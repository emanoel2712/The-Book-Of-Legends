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

public class CartaAdapter extends RecyclerView.Adapter<CartaAdapter.CartaViewHolder> {

    private Context context;
    private List<Carta> listCartas;

    public CartaAdapter(@NonNull Context context, List<Carta> listCartas) {
        this.context = context;
        this.listCartas = listCartas;

    }


    @NonNull
    @Override
    public CartaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext().getApplicationContext());
        View view = layoutInflater.inflate(R.layout.carta_view, parent, false);


        return new CartaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CartaViewHolder holder, final int position) {

        holder.image.setImageResource(listCartas.get(position).image);

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
        return listCartas.size();
    }


    public class CartaViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;

        public CartaViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ivCarta);

        }
    }

}
