package com.almi.nuevasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSumar).setOnClickListener(v->{
            Intent Ventana = new Intent(MainActivity.this, Sumar.class);
            startActivity(Ventana);
        });
        findViewById(R.id.btnRestar).setOnClickListener(v->{
            Intent Ventana = new Intent(MainActivity.this, Restar.class);
            startActivity(Ventana);
        });
        findViewById(R.id.btnMultiplicar).setOnClickListener(v->{
            Intent Ventana = new Intent(MainActivity.this, Multiplicar.class);
            startActivity(Ventana);
        });
        findViewById(R.id.btnDividir).setOnClickListener(v->{
            Intent Ventana = new Intent(MainActivity.this, Division.class);
            startActivity(Ventana);

        });
    }
}