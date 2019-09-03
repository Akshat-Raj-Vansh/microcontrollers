package com.example.microcontrollers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Arduino extends AppCompatActivity implements View.OnClickListener {
    Button button,button2,button3,button4,button5,button6,button7,button8,close;
    Dialog MyDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arduino);

        button = findViewById(R.id.PowerSupplyJack);
        button2 = findViewById(R.id.usbport);
        button3 = findViewById(R.id.resetbutton);
        button4=findViewById(R.id.digitalpins);
        button5=findViewById(R.id.rxtx);
        button6=findViewById(R.id.atmega328);
        button7=findViewById(R.id.analogpins);
        button8=findViewById(R.id.voltagepins);

        button.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
        button3.setOnClickListener((View.OnClickListener) this);
        button4.setOnClickListener((View.OnClickListener) this);
        button5.setOnClickListener((View.OnClickListener) this);
        button6.setOnClickListener((View.OnClickListener) this);
        button7.setOnClickListener((View.OnClickListener) this);
        button8.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(Arduino.this, "Click on orangedots ", Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.PowerSupplyJack:
                MyCustomAlertDialog();


        }
    }

        public void MyCustomAlertDialog() {
            MyDialog = new Dialog(Arduino.this);
            MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            MyDialog.setContentView(R.layout.micrcontrollercontent);
            MyDialog.setTitle("My Custom Dialog");

            close = (Button) MyDialog.findViewById(R.id.close);

            close.setEnabled(true);

            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MyDialog.cancel();
                }
            });

            MyDialog.show();
        }

    }