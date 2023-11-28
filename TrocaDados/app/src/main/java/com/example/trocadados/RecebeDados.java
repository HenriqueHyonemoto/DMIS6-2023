package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecebeDados extends AppCompatActivity {
private TextView txtIdade, txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dados);

        txtIdade = findViewById(R.id.textViewIdade);
        txtNome = findViewById(R.id.textViewNome);


        String nome;
        int idade;

        Bundle dados=getIntent().getExtras();

        nome=dados.getString("nome");
        idade=dados.getInt("idade");



        txtNome.setText(""+nome);
        txtIdade.setText(""+idade);
    }
}
