package com.example.thebookoflegends.viewControl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.control.PacoteFigurinhaIndivualControl;

public class PacoteFigurinhaIndividualActivity extends AppCompatActivity {
    private PacoteFigurinhaIndivualControl pacoteFigurinhaIndivualControl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pacote_figurinha_individual);

        pacoteFigurinhaIndivualControl = new PacoteFigurinhaIndivualControl(this);

    }
}
