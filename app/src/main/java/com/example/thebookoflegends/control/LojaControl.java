package com.example.thebookoflegends.control;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.adapter.AlbumFiguraAdapter;
import com.example.thebookoflegends.model.Album;
import com.example.thebookoflegends.model.Promocao;
import com.example.thebookoflegends.viewControl.LojaActivity;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class LojaControl {
    private AppCompatActivity appCompatActivity;
    private CarouselView carouselView;
    private Toolbar toolbar;
    private View recyclerView;

    private ArrayList<Promocao> promocoes;
    private ArrayList<Album> albuns;


    public LojaControl(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
        initComponents();
    }

    private void initComponents() {
        toolbar = appCompatActivity.findViewById(R.id.toolbar);
        appCompatActivity.setSupportActionBar(toolbar);

        addAlbuns();
        addPromocoesLista();

        carouselView = (CarouselView) appCompatActivity.findViewById(R.id.carouselView);
        carouselView.setPageCount(promocoes.size());
        carouselView.setImageListener(imageListener);


        recyclerView = appCompatActivity.findViewById(R.id.album_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

    }


    private void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new AlbumFiguraAdapter(this, albuns));


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

    }

    private void addPromocoesLista() {
        promocoes = new ArrayList<>();

        promocoes.add(new Promocao(R.drawable.tela3_img_inventario));
        promocoes.add(new Promocao(R.drawable.tela3_img_loja));
        promocoes.add(new Promocao(R.drawable.tela3_box_batalhas));
        promocoes.add(new Promocao(R.drawable.tela3_img_trocas));

    }

}
