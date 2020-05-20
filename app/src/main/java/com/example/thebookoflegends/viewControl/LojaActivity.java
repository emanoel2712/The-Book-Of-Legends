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
import com.example.thebookoflegends.control.LojaControl;
import com.example.thebookoflegends.model.Album;
import com.example.thebookoflegends.model.Promocao;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class LojaActivity extends AppCompatActivity {

    private LojaControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);

        control = new LojaControl(this);
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


}














