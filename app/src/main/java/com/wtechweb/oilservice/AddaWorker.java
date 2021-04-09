package com.wtechweb.oilservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AddaWorker extends AppCompatActivity {

    EditText etWorkerName, etWorkerEmail,etWorkerPassword;

    Button btnWorkerAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adda_worker);
        init();

        btnWorkerAdd.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                String workerName=etWorkerName.getText().toString();
                String workerEmail=etWorkerName.getText().toString().trim();
                String workerPassword=etWorkerPassword.getText().toString();
                if(workerEmail.isEmpty()){
                    etWorkerEmail.setError("Email required");
                }
                else if (workerName.isEmpty()) {
                    etWorkerName.setError("Name required");
                } else if (workerPassword.isEmpty()) {
                    etWorkerPassword.setError("Password required");
                }

                Intent intent= new Intent();
                intent.putExtra("workerName",workerName);
                intent.putExtra("workerEmail",workerEmail);
                intent.putExtra("workerPassword",workerPassword);
                setResult(RESULT_OK,intent);
                finish();

            }
        });


    }
    private void init(){
        etWorkerName= findViewById(R.id.etWorkerName);
        etWorkerEmail=findViewById(R.id.etWorkerEmail);
        etWorkerPassword=findViewById(R.id.etWorkerPassword);
        btnWorkerAdd=findViewById(R.id.btnWorkerAdd);
    }
}