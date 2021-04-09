package com.wtechweb.oilservice;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ManagerDash extends AppCompatActivity {

    Button btnADD, btnCAR;
    final static int ADD_WORKER=1;
    final static int ADD_CAR=2;
    public ArrayList<Worker> worker;
    public ArrayList<Car> car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_dash);

        init();
        btnADD.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(ManagerDash.this,AddaWorker.class);
                startActivityForResult(intent,ADD_WORKER);
            }
        });
        btnCAR.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(ManagerDash.this,AddaCar.class);
                startActivityForResult(intent,ADD_CAR);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==ADD_WORKER){
            if(resultCode== RESULT_OK){
                Worker work= new Worker();
                work.setId(data.getStringExtra("workerEmail"));
                work.setName(data.getStringExtra("workerName"));
                work.setPassword(data.getStringExtra("workerPassword"));
                worker.add(work);
                Toast.makeText(this,"User Added",Toast.LENGTH_SHORT).show();
            }

        } if(requestCode==ADD_CAR){
            if(resultCode== RESULT_OK){
                  Car smc= new Car();
//                intent.putExtra("carNumber",carNumber);
//                intent.putExtra("carName",carName);
//                intent.putExtra("carPhone",carPhone);
//                intent.putExtra("carAddress",carAddress);
//                intent.putExtra("carReading",carReading);
//                intent.putExtra("oilChange",oilChange);

                smc.setCarNumber(data.getStringExtra("carNumber"));
                smc.setOwnerCar(data.getStringExtra("carName"));
                smc.setPhoneNumber(data.getStringExtra("carPhone"));
                smc.setAddress(data.getStringExtra("carAddress"));
                smc.setLastReading(data.getStringExtra("carReading"));
                smc.setWorker(data.getStringExtra("oilChange"));

                car.add(smc);
                Toast.makeText(this,"Car Added",Toast.LENGTH_SHORT).show();

            }

        }
    }

    private void init(){
        btnADD= findViewById(R.id.btnADD);
        btnCAR= findViewById(R.id.btnCAR);
        worker = new ArrayList<Worker>();
        car = new ArrayList<Car>();
    }
}