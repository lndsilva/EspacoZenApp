package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterFragMeditar extends RecyclerView.Adapter<AdapterFragMeditar.ViewHolder> {
    Context context;
    List<Meditar> lstmeditar;

    public AdapterFragMeditar(Context context, List<Meditar> lstmeditar) {
        this.context = context;
        this.lstmeditar = lstmeditar;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_meditar_fragment, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tituloModeloMeditar.setText(lstmeditar.get(position).getTituloMeditar());
        holder.textoMeditar.setText(lstmeditar.get(position).getTextoMeditar());
        holder.imgModeloMeditar.setImageResource(lstmeditar.get(position).getImgMeditar());

    }

    @Override
    public int getItemCount() {
        return lstmeditar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tituloModeloMeditar, textoMeditar;
        ImageView imgModeloMeditar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tituloModeloMeditar = itemView.findViewById(R.id.tituloModeloMeditar);
            textoMeditar = itemView.findViewById(R.id.textoMeditar);
            imgModeloMeditar = itemView.findViewById(R.id.imgModeloMeditar);
        }
    }
}
