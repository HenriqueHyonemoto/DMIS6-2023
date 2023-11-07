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

public class MainActivity extends AppCompatActivity {
    private TextView txtTextViewResultado1, textViewResCheck, txtTextViewResultadoIMC,txtTextViewResultadoSexo,txtTextViewResultadoPeso,txtTextViewResultadoAnalise;
    private ToggleButton toggleButton;
    private Switch switch1;
    private CheckBox checkboxAtivar;

    private RadioGroup rbSexo;
    private String sexo;

    private EditText altura, peso;

    private double imc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = findViewById(R.id.switch1);
        txtTextViewResultado1 = findViewById(R.id.txtTextViewResultado1);
        txtTextViewResultadoIMC = findViewById(R.id.txtTextViewResultadoIMC);
        txtTextViewResultadoSexo = findViewById(R.id.txtTextViewResultadoSexo);
        txtTextViewResultadoPeso = findViewById(R.id.txtTextViewResultadoPeso);
        txtTextViewResultadoAnalise = findViewById(R.id.txtTextViewResultadoAnalise);

        altura = findViewById(R.id.campoAltura);
        peso = findViewById(R.id.campoPeso);

        rbSexo = findViewById(R.id.rbSexo);
        //verificaEnabled();

    }

    public void calculaIMC(){

        double pesoD, alturaD;
        pesoD = Double.parseDouble(peso.getText().toString());
        alturaD = Double.parseDouble(altura.getText().toString());
        if (sexo == "M"){
            imc = (72.7*alturaD)-58;
        }if (sexo == "F"){
            imc = (62.1*alturaD)-44.7;
        }

        txtTextViewResultadoIMC.setText("Seu peso ideal é: " + imc);
        txtTextViewResultadoPeso.setText("Seu peso é: " + pesoD);

        if (pesoD>imc){
            txtTextViewResultadoAnalise.setText("Você está "+(pesoD-imc)+" Acima do peso");
        }else if (imc>pesoD){
            txtTextViewResultadoAnalise.setText("Você está "+(imc-pesoD)+" Abaixo do peso");
        }

    }




    public void checkRb(){

        rbSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbM){
                    sexo="M";
                }
                else if(checkedId == R.id.rbF){
                    sexo="F";
                }
            }
        });
    }


    public void verificaEnabled(View view){
        if (switch1.isChecked()) {

            altura.setEnabled(true);
            peso.setEnabled(true);
        } else if (!switch1.isChecked()) {
            altura.setEnabled(false);
            peso.setEnabled(false);
        }
    }
    public void verifica (View v) {
        checkRb();
        calculaIMC();
        if(sexo == "M"){
            txtTextViewResultadoSexo.setText("Sexo: "+sexo);
        }else
            if(sexo == "F"){
            txtTextViewResultadoSexo.setText("Sexo: "+sexo);
        }

    }
    }

