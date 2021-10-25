package com.almi.nuevasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Multiplicar extends AppCompatActivity {
    TextView lblResultadoMultiplicar;
    EditText txtNumero1;
    EditText txtNumero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("MULTIPLICAR");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        lblResultadoMultiplicar = findViewById(R.id.lblResultadoMultiplicar);


        findViewById(R.id.btnCalcular).setOnClickListener(view -> {
            if(txtNumero1.getText().toString().isEmpty() || txtNumero2.getText().toString().isEmpty()){
                Toast.makeText(this, "introduce algo anda mongol@", Toast.LENGTH_LONG).show();
            }else{
                lblResultadoMultiplicar.setText(multiplicar());
            }



        });
    }
    public String multiplicar(){
        String sTotalMultiplicar;
        int iNumero1;
        int iNumero2;
        int iResultado;


        iNumero1 = Integer.parseInt(txtNumero1.getText().toString());
        iNumero2 =  Integer.parseInt(txtNumero2.getText().toString());
        iResultado = iNumero1 * iNumero2;
        sTotalMultiplicar = String.valueOf(iResultado);
        return sTotalMultiplicar;
    }
}