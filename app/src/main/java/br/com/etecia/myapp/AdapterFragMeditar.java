package br.com.etecia.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterFragMeditar extends RecyclerView.Adapter<AdapterFragMeditar.ViewHolder> {
    Context context;
    List<Meditar> meditar;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
