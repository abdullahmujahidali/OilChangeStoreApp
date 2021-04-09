package com.wtechweb.oilservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class WorkerLogin extends AppCompatActivity {

    Button btnWorkLogin;
    EditText etWorkerLoginEmail,etWorkerLoginPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_login);

        init();
        
    }
    private void init(){
        etWorkerLoginEmail=findViewById(R.id.etWorkerEmail);
        etWorkerLoginPass=findViewById(R.id.etWorkerLoginPass);
        btnWorkLogin=findViewById(R.id.btnWorkLogin);

    }
}