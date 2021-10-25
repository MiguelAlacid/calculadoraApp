package com.almi.nuevasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Restar extends AppCompatActivity {

    TextView lblResultadoResta;
    EditText txtNumero1;
    EditText txtNumero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        lblResultadoResta = findViewById(R.id.lblResultadoRestar);


        findViewById(R.id.btnCalcular).setOnClickListener(view -> {
            if(txtNumero1.getText().toString().isEmpty() || txtNumero2.getText().toString().isEmpty()){
                Toast.makeText(this, "introduce algo anda mongol@", Toast.LENGTH_LONG).show();
            }else{
                lblResultadoResta.setText(restar());
            }



        });
    }

    public String restar(){
        String sTotalResta;
        int iNumero1;
        int iNumero2;
        int iResultado;


        iNumero1 = Integer.parseInt(txtNumero1.getText().toString());
        iNumero2 =  Integer.parseInt(txtNumero2.getText().toString());
        iResultado = iNumero1 - iNumero2;
        sTotalResta = String.valueOf(iResultado);
        return sTotalResta;
    }
}