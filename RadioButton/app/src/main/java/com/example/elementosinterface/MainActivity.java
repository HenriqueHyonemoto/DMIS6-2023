package com.example.elementosinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editTextRoupa;
    private TextView textViewEscolha, textViewCores, txtTamanho;
    private CheckBox checkBoxBranco, checkBoxVerde, checkBoxAzul;
    private RadioGroup rbTamanho;
    public String corEsc;

    List<String> checked = new ArrayList<String>();

    public void getTexto(View view){
        textViewEscolha.setText(editTextRoupa.getText());
        verificaCheck(view);
    }

    public void checkRb(){
        rbTamanho = findViewById(R.id.rbTamanho);
        rbTamanho.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbG){
                    corEsc="G";
                }
                else if(checkedId == R.id.rbM){
                    corEsc="M";
                }
                else if(checkedId == R.id.rbP){
                    corEsc="P";
                }
            }
        });
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
        checkRb();


    }
    public void mudaTexto (View view){
        editTextRoupa=findViewById(R.id.editTextRoupa);
        textViewEscolha=findViewById(R.id.textViewEscolha);
        checkBoxBranco=findViewById(R.id.checkBoxBranco);
        checkBoxVerde=findViewById(R.id.checkBoxVerde);
        checkBoxAzul=findViewById(R.id.checkBoxAzul);
        txtTamanho = findViewById(R.id.txtTamanho);

        textViewEscolha.setText("Sua Escolha: "+editTextRoupa.getText());
        verificaCheck(view);
        checkRb();
        txtTamanho.setText("Tamanho: "+corEsc);
    }


}
