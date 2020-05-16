package com.example.thebookoflegends.ui.main.trocas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thebookoflegends.R;

import java.util.List;

public class CartaOferecidaAdapter extends RecyclerView.Adapter<CartaOferecidaAdapter.CartaOferecidaViewHolder> {

    private Context context;
    private List<Carta> listCartasOferecidas;

    public CartaOferecidaAdapter(@NonNull Context context, List<Carta> listCartasOferecidas) {
        this.context = context;
        this.listCartasOferecidas = listCartasOferecidas;

    }


    @NonNull
    @Override
    public CartaOferecidaAdapter.CartaOferecidaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext().getApplicationContext());
        View view = layoutInflater.inflate(R.layout.carta_view, parent, false);


        return new CartaOferecidaAdapter.CartaOferecidaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CartaOferecidaAdapter.CartaOferecidaViewHolder holder, final int position) {

        holder.image.setImageResource(listCartasOferecidas.get(position).image);

//        holder.image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder mBuilder = new AlertDialog.Builder(context);
//                LayoutInflater layoutInflater = LayoutInflater.from(context.getApplicationContext());
//                View mView = layoutInflater.inflate(R.layout.display_image_patrocinio, null);
//                PhotoView photoView = mView.findViewById(R.id.imageViewDialogPatrocinio);
//
//                photoView.setImageResource(listPatrocinios.get(position).image);
//
//                mBuilder.setView(mView);
//                AlertDialog mDialog = mBuilder.create();
//                mDialog.show();
//
//
//            }
//
//
//        });


    }


    @Override
    public int getItemCount() {
        return listCartasOferecidas.size();
    }


    public class CartaOferecidaViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;

        public CartaOferecidaViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ivCarta);

        }
    }

}


