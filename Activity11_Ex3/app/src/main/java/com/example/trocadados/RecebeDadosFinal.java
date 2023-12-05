package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecebeDadosFinal extends AppCompatActivity {
    private TextView txtV1,txtV2,txtV3, txtEspecificoTriangulo;
    int v1,v2,v3;
    String tipoEspecificoTriangulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dados_final);

        txtV1 = findViewById(R.id.textViewLado1);
        txtV2 = findViewById(R.id.textViewLado2);
        txtV3 = findViewById(R.id.textViewLado3);
        txtEspecificoTriangulo = findViewById(R.id.textViewV6);

        Bundle dados=getIntent().getExtras();
        v1=dados.getInt("v1");
        v2=dados.getInt("v2");
        v3=dados.getInt("v3");
        tipoEspecificoTriangulo=dados.getString("tipoEspecificoTriangulo");

        txtV1.setText("Lado1: "+v1);
        txtV2.setText("Lado2: "+v2);
        txtV3.setText("Lado3: "+v3);
        txtEspecificoTriangulo.setText(""+tipoEspecificoTriangulo);

    }
}
