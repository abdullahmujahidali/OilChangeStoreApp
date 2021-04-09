package com.wtechweb.oilservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddaCar extends AppCompatActivity {
    EditText etCarNo, etCarName, etCarPh,etCarAddress, etCarReading, etOilChange;
    Button addCarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adda_car);
        init();

        addCarBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String carNumber=etCarNo.getText().toString();
                String carName=etCarName.getText().toString().trim();
                String carPhone=etCarPh.getText().toString();
                String carAddress=etCarAddress.getText().toString();
                String carReading=etCarReading.getText().toString();
                String oilChange=etOilChange.getText().toString();
                if(carNumber.isEmpty()){
                    etCarNo.setError("Car No required");
                }
                else if (carName.isEmpty()) {
                    etCarName.setError("Name required");
                }
                else if (carPhone.isEmpty()) {
                    etCarPh.setError("Phone Number required");
                }
                else if (carAddress.isEmpty()) {
                    etCarPh.setError("Address Number required");
                }
                else if (carReading.isEmpty()) {
                    etCarPh.setError("Last Reading required");
                }
                else if (oilChange.isEmpty()) {
                    etCarPh.setError("Worker Number required");
                }

                Intent intent= new Intent();
                intent.putExtra("carNumber",carNumber);
                intent.putExtra("carName",carName);
                intent.putExtra("carPhone",carPhone);
                intent.putExtra("carAddress",carAddress);
                intent.putExtra("carReading",carReading);
                intent.putExtra("oilChange",oilChange);

                setResult(RESULT_OK,intent);
                finish();

            }
        });
    }
    private void init(){
        etCarNo=findViewById(R.id.etCarNo);
        etCarName=findViewById(R.id.etCarName);
        etCarPh=findViewById(R.id.etCarPh);
        etCarAddress=findViewById(R.id.etCarAddress);
        etCarReading=findViewById(R.id.etCarReading);
        etOilChange=findViewById(R.id.etOilChange);
        addCarBtn=findViewById(R.id.addCarBtn);
    }
}