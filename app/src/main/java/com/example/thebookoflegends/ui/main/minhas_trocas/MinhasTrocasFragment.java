package com.example.thebookoflegends.ui.main.minhas_trocas;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thebookoflegends.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MinhasTrocasFragment extends Fragment {


    public MinhasTrocasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_minhas_trocas, container, false);


        return root;


    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }


}