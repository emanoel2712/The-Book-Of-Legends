package com.example.thebookoflegends.control;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

import com.example.thebookoflegends.R;
import com.example.thebookoflegends.viewControl.MainActivity;

public class LoginControl {
    private Activity activity;


    public LoginControl(Activity activity) {
        this.activity = activity;
        initComponents();

    }

    private void initComponents() {

    }


    public void btEntrar() {
        Intent it = new Intent(activity, MainActivity.class);
        activity.startActivity(it);

    }
}
