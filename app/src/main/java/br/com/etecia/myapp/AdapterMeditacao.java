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

public class AdapterMeditacao extends RecyclerView.Adapter<AdapterMeditacao.ViewHolder> {
    private Context context;
    private List<Meditacao> lstMeditacao;

    //criando o construtor da classe adaptadora alt+insert selecione construtor


    public AdapterMeditacao(Context context, List<Meditacao> lstMeditacao) {
        this.context = context;
        this.lstMeditacao = lstMeditacao;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_meditacao,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTitulo.setText(lstMeditacao.get(position).getTitulo());
        holder.txtSubTitulo.setText(lstMeditacao.get(position).getSubtitulo());
        holder.txtOrientacao.setText(lstMeditacao.get(position).getOrientacao());
        holder.imgMeditacao.setImageResource(lstMeditacao.get(position).getImgMeditacao());

    }

    @Override
    public int getItemCount() {
        return lstMeditacao.size();
    }

    //criando a inner class
    public class ViewHolder extends RecyclerView.ViewHolder {
        //criando o construtor da inner class alt+insert selecione o construtor

        ImageView imgMeditacao;
        TextView txtTitulo, txtSubTitulo, txtOrientacao;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtSubTitulo = itemView.findViewById(R.id.txtSubTitulo);
            txtOrientacao = itemView.findViewById(R.id.txtOrientacao);
            imgMeditacao = itemView.findViewById(R.id.imgMeditacao);
        }
    }
}
