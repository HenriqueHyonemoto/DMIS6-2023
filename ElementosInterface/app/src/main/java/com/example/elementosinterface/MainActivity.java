package com.example.elementosinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editTextRoupa;
    private TextView textViewEscolha, textViewCores;
    private CheckBox checkBoxBranco, checkBoxVerde, checkBoxAzul;

    List<String> checked = new ArrayList<String>();

    public void getTexto(View view){
        textViewEscolha.setText(editTextRoupa.getText());
        verificaCheck(view);
    }

    public void verificaCheck(View view){
        checked.clear();
        textViewCores = findViewById(R.id.textViewCores);

        if(checkBoxBranco.isChecked()){
            checked.add(checkBoxBranco.getText().toString());
        }
        if(checkBoxVerde.isChecked()){
            checked.add(checkBoxVerde.getText().toString());
        }
        if(checkBoxAzul.isChecked()){
            checked.add(checkBoxAzul.getText().toString());
        }
        textViewCores.setText(checked.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void mudaTexto (View view){
        editTextRoupa=findViewById(R.id.editTextRoupa);
        textViewEscolha=findViewById(R.id.textViewEscolha);
        checkBoxBranco=findViewById(R.id.checkBoxBranco);
        checkBoxVerde=findViewById(R.id.checkBoxVerde);
        checkBoxAzul=findViewById(R.id.checkBoxAzul);

        textViewEscolha.setText("Sua Escolha: "+editTextRoupa.getText());
        verificaCheck(view);
    }


}
