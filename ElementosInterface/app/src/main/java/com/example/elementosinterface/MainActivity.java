package com.example.elementosinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextRoupa;
    private TextView textViewEscolha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mudaTexto (View view){
        editTextRoupa=findViewById(R.id.editTextRoupa);
        textViewEscolha=findViewById(R.id.textViewEscolha);

        textViewEscolha.setText("Sua Escolha: "+editTextRoupa.getText());
    }


}
