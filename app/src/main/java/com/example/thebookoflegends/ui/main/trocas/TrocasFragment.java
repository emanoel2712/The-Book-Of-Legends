package com.example.thebookoflegends.ui.main.trocas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.thebookoflegends.R;

import java.util.ArrayList;
import java.util.List;


public class TrocasFragment extends Fragment {
    private List<Carta> listCartas;
    private RecyclerView recyclerView;

    private List<Carta> listCartasOferecidas;
    private RecyclerView recyclerViewCartasOferecidas;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_trocas, container, false);

        adicionaCartasOferecidas();

        recyclerViewCartasOferecidas = root.findViewById(R.id.recyclerViewCartasOferecidas);
        recyclerViewCartasOferecidas.setHasFixedSize(true);
        recyclerViewCartasOferecidas.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        CartaOferecidaAdapter cartaOferecidaAdapter = new CartaOferecidaAdapter(getActivity(), listCartasOferecidas);
        recyclerViewCartasOferecidas.setAdapter(cartaOferecidaAdapter);


        adicionaCartasLista();

        recyclerView = root.findViewById(R.id.recyclerViewCartasJogador);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        CartaAdapter cartaAdapter = new CartaAdapter(getActivity(), listCartas);
        recyclerView.setAdapter(cartaAdapter);
        return root;

    }

    private void adicionaCartasOferecidas() {
        listCartasOferecidas = new ArrayList<>();

        listCartasOferecidas.add(new Carta(R.drawable.tbg_imagens_png_27));
        listCartasOferecidas.add(new Carta(R.drawable.tbg_imagens_png_27));
        listCartasOferecidas.add(new Carta(R.drawable.tbg_imagens_png_27));
        listCartasOferecidas.add(new Carta(R.drawable.tbg_imagens_png_27));
        listCartasOferecidas.add(new Carta(R.drawable.tbg_imagens_png_27));
        listCartasOferecidas.add(new Carta(R.drawable.tbg_imagens_png_27));
        listCartasOferecidas.add(new Carta(R.drawable.tbg_imagens_png_27));
        listCartasOferecidas.add(new Carta(R.drawable.tbg_imagens_png_27));

    }

    private void adicionaCartasLista() {
        listCartas = new ArrayList<>();

        listCartas.add(new Carta(R.drawable.tbg_imagens_png_26));
        listCartas.add(new Carta(R.drawable.tbg_imagens_png_26));
        listCartas.add(new Carta(R.drawable.tbg_imagens_png_26));
        listCartas.add(new Carta(R.drawable.tbg_imagens_png_26));
        listCartas.add(new Carta(R.drawable.tbg_imagens_png_26));
        listCartas.add(new Carta(R.drawable.tbg_imagens_png_26));
        listCartas.add(new Carta(R.drawable.tbg_imagens_png_26));
        listCartas.add(new Carta(R.drawable.tbg_imagens_png_26));


    }

//    @Override
//    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
////        SearchView searchView = menu.findItem(R.id.search).act);
//        super.onCreateOptionsMenu(menu, inflater);
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }


}
