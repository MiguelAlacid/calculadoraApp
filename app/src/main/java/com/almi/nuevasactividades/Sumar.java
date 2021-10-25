package com.almi.nuevasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Sumar extends AppCompatActivity {

    TextView lblResultado;
    public static EditText txtNumero1;
    public static EditText txtNumero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);
        lblResultado = findViewById(R.id.lblResultado);


        findViewById(R.id.btnCalcular).setOnClickListener(view -> {
            sumar();
        //lblResultado.setText();

        });

    }
    public void sumar(){
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        txtNumero1.getText();
        txtNumero2.getText();
        System.out.println(txtNumero1 + " " + txtNumero2);
    }
}