package com.example.thebookoflegends.control;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.thebookoflegends.R;
import com.example.thebookoflegends.model.Figurinha;
import com.example.thebookoflegends.model.HorizontalNumberPicker;
import com.example.thebookoflegends.viewControl.PacoteActivity;
import java.util.ArrayList;
import java.util.List;

public class PacoteFigurinhaIndivualControl {
    private Activity activity;
    private List<Figurinha> listFigurinhas;


    public PacoteFigurinhaIndivualControl(Activity activity) {
        this.activity = activity;

        initComponents();
    }

    private void initComponents() {
        addFigurinhasLista();
        View recyclerView = activity.findViewById(R.id.recyclerViewFigIndiv);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

    }

    private void addFigurinhasLista() {
        listFigurinhas = new ArrayList<>();
        listFigurinhas.add(new Figurinha(R.drawable.tbg_imagens_png_26, "UZI", "DESCRIÇÃO FIGURINHA", 2.5));
        listFigurinhas.add(new Figurinha(R.drawable.tbg_imagens_png_26, "UZI", "DESCRIÇÃO FIGURINHA", 2.5));
        listFigurinhas.add(new Figurinha(R.drawable.tbg_imagens_png_26, "UZI", "DESCRIÇÃO FIGURINHA", 2.5));
        listFigurinhas.add(new Figurinha(R.drawable.tbg_imagens_png_26, "UZI", "DESCRIÇÃO FIGURINHA", 2.5));
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(activity, 2));
        recyclerView.setAdapter(new SimplePacoteFigIndivRecyclerViewAdapter(this, listFigurinhas));
    }


    public static class SimplePacoteFigIndivRecyclerViewAdapter
            extends RecyclerView.Adapter<PacoteFigurinhaIndivualControl.SimplePacoteFigIndivRecyclerViewAdapter.ViewHolder> {

        private final PacoteFigurinhaIndivualControl mParentActivity;
        private final List<Figurinha> eValues;

        private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, PacoteActivity.class);
                context.startActivity(intent);

            }
        };
        SimplePacoteFigIndivRecyclerViewAdapter(PacoteFigurinhaIndivualControl parent, List<Figurinha> items) {
            eValues = items;
            mParentActivity = parent;

        }

        @Override
        public PacoteFigurinhaIndivualControl.SimplePacoteFigIndivRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.figurinha_individual_content, parent, false);
            return new PacoteFigurinhaIndivualControl.SimplePacoteFigIndivRecyclerViewAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final PacoteFigurinhaIndivualControl.SimplePacoteFigIndivRecyclerViewAdapter.ViewHolder holder, final int position) {
            holder.imageView.setImageResource(eValues.get(position).getImage());
            holder.tvNome.setText(eValues.get(position).getNome());
            holder.tvDesc.setText(eValues.get(position).getDescricao());
            holder.tvValor.setText(String.valueOf(eValues.get(position).getValor()));

            holder.itemView.setTag(eValues.get(position));
            holder.itemView.setOnClickListener(mOnClickListener);


        }

        @Override
        public int getItemCount() {
            return eValues.size();
        }

        public int getItemViewType(int position) {
            return position;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final ImageView imageView;
            final TextView tvNome;
            final TextView tvDesc;
            final TextView tvValor;

            ViewHolder(View view) {
                super(view);
                imageView = view.findViewById(R.id.imageViewFigIndiv);
                tvNome = view.findViewById(R.id.tvNome);
                tvDesc = view.findViewById(R.id.tvDescricao);
                final HorizontalNumberPicker np_channel_nr = itemView.findViewById(R.id.nbQuantidade);
                tvValor = itemView.findViewById(R.id.tvValor);


                np_channel_nr.setValue(1);
                np_channel_nr.setMax(99);
                np_channel_nr.setMin(1);


            }

        }


    }


}
