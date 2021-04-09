package com.wtechweb.oilservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class managerLogin extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button loginMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_login);
        init();
        loginMgr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String userEmail=etEmail.getText().toString().trim();
                String passWord=etPassword.getText().toString();
                if(userEmail.isEmpty()){
                    etEmail.setError("Email required");
                }
                else if(passWord.isEmpty()){
                    etPassword.setError("Password required");
                }
                if(userEmail.equals("manager@gmail.com") && passWord.equals("manager123")){
                    startActivity(new Intent(managerLogin.this,ManagerDash.class));
                    finish();
                }
            }
        });
    }
    private void init(){
        etEmail= findViewById(R.id.etEmail);
        etPassword= findViewById(R.id.etPassword);
        loginMgr= findViewById(R.id.loginMgr);
    }
}