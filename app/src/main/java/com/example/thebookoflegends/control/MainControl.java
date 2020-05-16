package com.example.thebookoflegends.control;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.model.Novidade;
import com.example.thebookoflegends.viewControl.LojaActivity;
import com.example.thebookoflegends.viewControl.MainActivity;
import com.example.thebookoflegends.viewControl.TrocasActivity;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class MainControl {
    private Activity activity;
    private ArrayList<Novidade> novidades;
    private CarouselView carouselView;

    public MainControl(Activity activity) {
        this.activity = activity;

        initComponents();
    }

    private void initComponents() {
        carouselView = activity.findViewById(R.id.carouselView);
        addNovidadesLista();
        configCarrousel();

    }

    private void configCarrousel() {
        carouselView.setPageCount(novidades.size());
        carouselView.setImageListener(imageListener);

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(novidades.get(position).getImage());
        }
    };


    private void addNovidadesLista() {
        novidades = new ArrayList<>();
        novidades.add(new Novidade(R.drawable.tela3_box_novidades));
        novidades.add(new Novidade(R.drawable.tela3_box_batalhas));
        novidades.add(new Novidade(R.drawable.tela3_img_album));
        novidades.add(new Novidade(R.drawable.tela3_img_inventario));
        novidades.add(new Novidade(R.drawable.tela3_img_loja));


    }


    public void botaoTrocas() {
        Intent intent = new Intent(activity, TrocasActivity.class);
        activity.startActivity(intent);
    }

    public void botaoHome() {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
    }

}
