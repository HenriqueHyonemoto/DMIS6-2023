package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecebeDados extends AppCompatActivity {
private TextView txtV1,txtV2,txtV3, txtTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dados);

        txtV1 = findViewById(R.id.textViewV1);
        txtV2 = findViewById(R.id.textViewV2);
        txtV3 = findViewById(R.id.textViewV3);
        txtTriangulo = findViewById(R.id.textViewTipoTriangulo);

        int v1,v2,v3;
        String tipoTriangulo;

        Bundle dados=getIntent().getExtras();

        v1=dados.getInt("v1");
        v2=dados.getInt("v2");
        v3=dados.getInt("v3");
        tipoTriangulo=dados.getString("tipoTriangulo");

        txtV1.setText("Lado1: "+v1);
        txtV2.setText("Lado2: "+v2);
        txtV3.setText("Lado3: "+v3);
        txtTriangulo.setText(""+tipoTriangulo);

    }
}
