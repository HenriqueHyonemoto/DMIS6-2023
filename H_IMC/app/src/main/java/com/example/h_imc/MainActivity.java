package com.example.h_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView txtTextViewResultado1, txtTextViewResultado2, textViewResCheck,ResultadoIMC;
    private ToggleButton toggleButton;
    private Switch switch1; //Habilitar Campos
    private RadioGroup rbSexo; // Radio Button
    private CheckBox checkboxAtivar;

    private EditText altura, peso;

    private String sexo;

    private Double imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        switch1 = findViewById(R.id.switch1);
        checkboxAtivar = findViewById(R.id.checkboxAtivar);
        txtTextViewResultado1 = findViewById(R.id.txtTextViewResultado1);
        txtTextViewResultado2 = findViewById(R.id.txtTextViewResultado2);
        textViewResCheck = findViewById(R.id.textViewResCheck);

        ResultadoIMC = findViewById(R.id.resultadoIMC);

        altura = findViewById(R.id.alturaC);
        peso = findViewById(R.id.pesoC);
    }

    public void calculaIMC(View view){
        double pesoD, alturaD;
        pesoD = Double.parseDouble(peso.getText().toString());
        alturaD = Double.parseDouble(altura.getText().toString());
        if (sexo == "M"){
            imc = (pesoD*alturaD)-58;
        }else if (sexo == "F"){
            imc = (pesoD*alturaD)-44.7;
        }
    ResultadoIMC.setText("Resultado: " + imc);

    }
    public void checkRb(){
        rbSexo = findViewById(R.id.rbSexo);
        rbSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.M){
                    sexo="M";
                }
                else if(checkedId == R.id.F){
                    sexo="F";
                }
            }
        });
    }



    public void verifica (View v) {
        if (switch1.isChecked()) {
            txtTextViewResultado1.setText("Ligado");
        } else {
            txtTextViewResultado1.setText("Desligado");
        }

        if (toggleButton.isChecked()) {
            txtTextViewResultado2.setText("Toggle Ligado");
        } else {
            txtTextViewResultado2.setText("Toggle Desligado");
        }

        if (checkboxAtivar.isChecked()) {
            textViewResCheck.setText("CheckBox Ligado");
        } else {
            textViewResCheck.setText("CheckBox Desligado");
        }

    }
    }

