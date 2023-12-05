package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecebeDados extends AppCompatActivity {
private TextView txtV1,txtV2,txtV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dados);

        txtV1 = findViewById(R.id.textViewV1);
        txtV2 = findViewById(R.id.textViewV2);
        txtV3 = findViewById(R.id.textViewV3);

        int v1,v2,v3;

        Bundle dados=getIntent().getExtras();

        v1=dados.getInt("v1");
        v2=dados.getInt("v2");
        v3=dados.getInt("v3");

        txtV1.setText("Valor1: "+v1);
        txtV2.setText("Valor2: "+v2);
        txtV3.setText("Valor2: "+v3);
    }
}
