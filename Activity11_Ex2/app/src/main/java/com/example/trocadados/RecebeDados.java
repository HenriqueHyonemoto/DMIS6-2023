package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecebeDados extends AppCompatActivity {
private TextView txtNome,txtV2,txtV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dados);

        txtNome = findViewById(R.id.textViewNome);
        txtV2 = findViewById(R.id.textViewV2);
        txtV3 = findViewById(R.id.textViewV3);

        int v2,v3;
        String nome;

        Bundle dados=getIntent().getExtras();

        nome=dados.getString("nome");
        v2=dados.getInt("v2");
        v3=dados.getInt("v3");

        txtNome.setText("Nome: "+nome);
        txtV2.setText("Valor2: "+v2);
        txtV3.setText("Valor2: "+v3);
    }
}
