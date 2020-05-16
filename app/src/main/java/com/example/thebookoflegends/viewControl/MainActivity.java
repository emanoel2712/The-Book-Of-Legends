package com.example.thebookoflegends.viewControl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.control.MainControl;
import com.example.thebookoflegends.model.Novidade;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private MainControl mainControl;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mainControl = new MainControl(this);

    }


    public void buttonHome(View v) {
        mainControl.botaoHome();

    }

    public void botaoTrocas(View v) {
        mainControl.botaoTrocas();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

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













