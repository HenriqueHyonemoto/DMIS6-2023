package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecebeDados extends AppCompatActivity {
private TextView txtNome,txtNomeAmigo,txtV2,txtV3,txtDiff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dados);

        txtNome = findViewById(R.id.textViewNome);
        txtNomeAmigo = findViewById(R.id.textViewNomeAmigo);
        txtV2 = findViewById(R.id.textViewV2);
        txtV3 = findViewById(R.id.textViewV3);
        txtDiff = findViewById(R.id.textViewDiff);

        int v2,v3,diff;
        String nome,nomeAmigo;

        Bundle dados=getIntent().getExtras();

        nome=dados.getString("nome");
        nomeAmigo=dados.getString("nomeAmigo");
        v2=dados.getInt("v2");
        v3=dados.getInt("v3");
        diff=dados.getInt("diff");

        txtNome.setText("Nome: "+nome);
        txtNomeAmigo.setText("Nome do Amigo: "+nomeAmigo);
        txtV2.setText("Sua Idade: "+v2);
        txtV3.setText("Idade do Amigo: "+v3);
        txtDiff.setText("Diferença de idade: "+diff);
    }
}
