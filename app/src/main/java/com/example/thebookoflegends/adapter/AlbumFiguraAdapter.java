package com.example.thebookoflegends.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.control.LojaControl;
import com.example.thebookoflegends.model.Album;
import com.example.thebookoflegends.viewControl.LojaActivity;
import com.example.thebookoflegends.viewControl.PacoteActivity;

import java.util.List;

public class AlbumFiguraAdapter extends RecyclerView.Adapter<AlbumFiguraAdapter.ViewHolder> {
    private final LojaControl mParentActivity;
    private final List<Album> eValues;

    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Context context = view.getContext();
            Intent intent = new Intent(context, PacoteActivity.class);
            context.startActivity(intent);
//                }
        }
    };

    public AlbumFiguraAdapter(LojaControl parent, List<Album> items) {
        eValues = items;
        mParentActivity = parent;

    }


    @Override
    public AlbumFiguraAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_list_content, parent, false);
        return new AlbumFiguraAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AlbumFiguraAdapter.ViewHolder holder, final int position) {

        holder.txtNome.setText(eValues.get(position).getNome());
        holder.imageView.setImageResource(eValues.get(position).getImage());

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
        final TextView txtNome;
        final ImageView imageView;

        ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
            txtNome = (TextView) view.findViewById(R.id.tvName);
        }

    }


}
