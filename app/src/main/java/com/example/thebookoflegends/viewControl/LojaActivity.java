package com.example.thebookoflegends.viewControl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.model.Album;
import com.example.thebookoflegends.model.Promocao;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class LojaActivity extends AppCompatActivity {
    private ArrayList<Promocao> promocoes;
    private ArrayList<Album> albuns;
    private CarouselView carouselView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        addAlbuns();
        addPromocoesLista();

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(promocoes.size());

        carouselView.setImageListener(imageListener);


        View recyclerView = findViewById(R.id.album_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new SimpleAlbumFiguraRecyclerViewAdapter(this, albuns));


    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(promocoes.get(position).getImage());
        }


    };

    private void addAlbuns() {
        albuns = new ArrayList<>();
        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE LEAGUE OF LEGENDS"));
        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE TOM CLANCYS"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE RAINBOW SIX SIEGE"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE FORTNITE"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE LEAGUE OF LEGENDS"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE TOM CLANCYS"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE RAINBOW SIX SIEGE"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE FORTNITE"));
//
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE LEAGUE OF LEGENDS"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE TOM CLANCYS"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE RAINBOW SIX SIEGE"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE FORTNITE"));
//
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE LEAGUE OF LEGENDS"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE TOM CLANCYS"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE RAINBOW SIX SIEGE"));
//        albuns.add(new Album(R.drawable.tbg_imagens_png_28, "ÁLBUM DE FORTNITE"));


    }

    private void addPromocoesLista() {
        promocoes = new ArrayList<>();

        promocoes.add(new Promocao(R.drawable.tela3_img_inventario));
        promocoes.add(new Promocao(R.drawable.tela3_img_loja));
        promocoes.add(new Promocao(R.drawable.tela3_box_batalhas));
        promocoes.add(new Promocao(R.drawable.tela3_img_trocas));

    }

    public void buttonHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_loja, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_cart:
                Intent intent = new Intent(this, LojaActivity.class);
                startActivity(intent);
                return true;

//            case R.id.action_home:
//                Intent intent2 = new Intent(this, MainActivity.class);
//                startActivity(intent2);
//                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public static class SimpleAlbumFiguraRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleAlbumFiguraRecyclerViewAdapter.ViewHolder> {

        private final LojaActivity mParentActivity;
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

        SimpleAlbumFiguraRecyclerViewAdapter(LojaActivity parent, List<Album> items) {
            eValues = items;
            mParentActivity = parent;

        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.album_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {

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
}














