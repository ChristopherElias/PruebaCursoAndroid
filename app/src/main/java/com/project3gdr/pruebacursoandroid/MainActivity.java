package com.project3gdr.pruebacursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText TxtPrimerNumero, TxtSegundoNumero;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarViews();
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular();
            }
        });

    }


    private void iniciarViews() {

        TxtPrimerNumero = findViewById(R.id.TxtPrimerNumero);
        TxtSegundoNumero = findViewById(R.id.TxtSegundoNumero);
        btnCalcular = findViewById(R.id.btnCalcular);

    }


    private void Calcular() {

        String num1 = TxtPrimerNumero.getText().toString();
        String num2 = TxtSegundoNumero.getText().toString();

        if( num1.equals("") || num2.equals("") ){
            Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        int n1 = num1.length();
        int n2 = num2.length();

        if(n1 > n2){
            Toast.makeText(this, "El número " + num1 + " tiene mas digitos", Toast.LENGTH_SHORT).show();
        }else if(n2 > n1){
            Toast.makeText(this, "El número " + num2 + " tiene mas digitos", Toast.LENGTH_SHORT).show();
        }else if(n1 == n2){
            Toast.makeText(this, "Ambos tienen la misma cantidad de digitos", Toast.LENGTH_SHORT).show();
        }

    }
}
