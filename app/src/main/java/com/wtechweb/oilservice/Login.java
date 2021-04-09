package com.wtechweb.oilservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
public class Login extends AppCompatActivity {
    Button mngBtn;
    public ArrayList<Worker> worker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        mngBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                init();
                startActivity(new Intent(Login.this,managerLogin.class));
                finish();
            }
        });
    }
    private void init(){
        worker = new ArrayList<Worker>();
        mngBtn= findViewById(R.id.mngBtn);
    }
}