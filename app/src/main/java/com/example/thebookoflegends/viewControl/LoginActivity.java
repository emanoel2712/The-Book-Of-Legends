package com.example.thebookoflegends.viewControl;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.thebookoflegends.R;
import com.example.thebookoflegends.control.LoginControl;

public class LoginActivity extends AppCompatActivity {
    private LoginControl loginControl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginControl = new LoginControl(this);
    }

    public void clickEntrar(View v){
        loginControl.btEntrar();

    }


}
