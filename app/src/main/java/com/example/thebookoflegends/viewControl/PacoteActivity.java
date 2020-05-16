package com.example.thebookoflegends.viewControl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.adapter.PacoteAdapter;
import com.example.thebookoflegends.model.Pacote;

import java.util.ArrayList;
import java.util.List;

public class PacoteActivity extends AppCompatActivity {
    private List<Pacote> listPacotes;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacote);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        adicionaPacotesLista();

        recyclerView = findViewById(R.id.recyclerViewPacotes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        PacoteAdapter pacoteAdapter = new PacoteAdapter(this, listPacotes);
        recyclerView.setAdapter(pacoteAdapter);

    }

    public void buttonHome(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    private void adicionaPacotesLista() {

        listPacotes = new ArrayList<>();

        listPacotes.add(new Pacote("PACOTE PLATINA", "10 CARTAS - NIVEL 4", R.drawable.tbg_imagens_png_28, 99, 2.50));
        listPacotes.add(new Pacote("PACOTE OURO", "10 CARTAS - NIVEL 4", R.drawable.tbg_imagens_png_28, 99, 00.00));
        listPacotes.add(new Pacote("PACOTE PRATA", "10 CARTAS - NIVEL 4", R.drawable.tbg_imagens_png_28, 99, 00.00));
        listPacotes.add(new Pacote("PACOTE BRONZE", "10 CARTAS - NIVEL 4", R.drawable.tbg_imagens_png_28, 99, 00.00));


    }

    public void clickPacote(View v) {

        Intent intent = new Intent(this, PacoteFigurinhaIndividualActivity.class);
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
                // User chose the "Settings" item, show the app settings UI...
                return true;

//            case R.id.action_home:
//                Intent intent2 = new Intent(this, MainActivity.class);
//                startActivity(intent2);
//                // User chose the "Favorite" action, mark the current item
//                // as a favorite...
//                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

}
