package com.almi.nuevasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sumar extends AppCompatActivity {

    TextView lblResultado;
    public static EditText txtNumero1;
    public static EditText txtNumero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);
        lblResultado = findViewById(R.id.lblResultadoSumar);

        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);

        findViewById(R.id.btnCalcular).setOnClickListener(view -> {

            if(txtNumero1.getText().toString().isEmpty() || txtNumero2.getText().toString().isEmpty()){
                Toast.makeText(this, "introduce algo anda mongol@", Toast.LENGTH_LONG).show();
            }else{
                lblResultado.setText(sumar());
            }

        });


    }
    public String sumar(){
        int iNumero;
        int iNumero2;
        int iTotal;
        String sTotalSuma;

        iNumero = Integer.parseInt(txtNumero1.getText().toString());
        iNumero2 =  Integer.parseInt(txtNumero2.getText().toString());
        iTotal = iNumero + iNumero2;
        sTotalSuma = String.valueOf(iTotal);
        return sTotalSuma;
    }
}