package com.example.thebookoflegends.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.model.HorizontalNumberPicker;
import com.example.thebookoflegends.model.Pacote;

import java.util.List;

public class PacoteAdapter extends RecyclerView.Adapter<PacoteAdapter.PatrocinioViewHolder> {

    private Context context;
    private List<Pacote> listPacotes;


    public PacoteAdapter(@NonNull Context context, List<Pacote> listPacotes) {
        this.context = context;
        this.listPacotes = listPacotes;

    }


    @NonNull
    @Override
    public PatrocinioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext().getApplicationContext());
        View view = layoutInflater.inflate(R.layout.pacote_view, parent, false);

        return new PatrocinioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PatrocinioViewHolder holder, final int position) {
        holder.image.setImageResource(listPacotes.get(position).getImage());
        holder.tvNome.setText(listPacotes.get(position).getNome());
        holder.tvDesc.setText(listPacotes.get(position).getDescricao());
        holder.tvValor.setText(String.valueOf(listPacotes.get(position).getValor()));

    }


    @Override
    public int getItemCount() {
        return listPacotes.size();
    }


    public class PatrocinioViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView tvNome;
        public TextView tvDesc;
        public TextView tvValor;

        public PatrocinioViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ivPacote);
            tvNome = itemView.findViewById(R.id.tvNome);
            tvDesc = itemView.findViewById(R.id.tvDescricao);
            final HorizontalNumberPicker np_channel_nr = itemView.findViewById(R.id.nbQuantidade);
            tvValor = itemView.findViewById(R.id.tvValor);

            np_channel_nr.setValue(1);
            np_channel_nr.setMax(99);
            np_channel_nr.setMin(1);


        }
    }
}



