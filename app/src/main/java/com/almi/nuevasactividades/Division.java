package com.almi.nuevasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Division extends AppCompatActivity {
    TextView lblResultadoDividir;
    EditText txtNumero1;
    EditText txtNumero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        lblResultadoDividir = findViewById(R.id.lblResultadoDividir);


        findViewById(R.id.btnCalcular).setOnClickListener(view -> {
            if(txtNumero1.getText().toString().isEmpty() || txtNumero2.getText().toString().isEmpty()){
                Toast.makeText(this, "introduce algo anda mongol@", Toast.LENGTH_LONG).show();
            }else{
                lblResultadoDividir.setText(dividir());
            }
        });
    }

    public String dividir(){
        String sTotalDividir;
        int iNumero1;
        int iNumero2;
        int iResultado;


        iNumero1 = Integer.parseInt(txtNumero1.getText().toString());
        iNumero2 =  Integer.parseInt(txtNumero2.getText().toString());
        iResultado = iNumero1 / iNumero2;
        sTotalDividir = String.valueOf(iResultado);
        return sTotalDividir;
    }
}