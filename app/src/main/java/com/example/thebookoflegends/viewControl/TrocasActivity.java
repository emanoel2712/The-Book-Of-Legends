package com.example.thebookoflegends.viewControl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.thebookoflegends.R;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.thebookoflegends.ui.main.tab_trocas_activity.SectionsPagerAdapter;

public class TrocasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trocas);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


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
                // User chose the "Settings" item, show the app settings UI...
                return true;

//            case R.id.action_home:
//                Intent intent2 = new Intent(this, MainActivity.class);
//                startActivity(intent2);
//                // User chose the "Favorite" action, mark the current item
//                // as a favorite...
//                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void buttonHome(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

}