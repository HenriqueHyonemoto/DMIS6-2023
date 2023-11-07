package com.example.h_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView txtTextViewResultado1, textViewResCheck, txtTextViewResultadoIMC,txtTextViewResultadoPesoIdeal,txtTextViewResultadoSexo,txtTextViewResultadoPeso,txtTextViewResultadoAnalise;
    private ToggleButton toggleButton;
    private Switch switch1;
    private CheckBox checkboxAtivar;
    private ImageView imgImc;

    private RadioGroup rbSexo;
    private String sexo,statusIMC;

    private EditText altura, peso;

    private double pesoIdeal, imc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = findViewById(R.id.switch1);
        txtTextViewResultado1 = findViewById(R.id.txtTextViewResultado1);
        txtTextViewResultadoPesoIdeal = findViewById(R.id.txtTextViewResultadoPesoIdeal);
        txtTextViewResultadoSexo = findViewById(R.id.txtTextViewResultadoSexo);
        txtTextViewResultadoPeso = findViewById(R.id.txtTextViewResultadoPeso);
        txtTextViewResultadoAnalise = findViewById(R.id.txtTextViewResultadoAnalise);
        imgImc = findViewById(R.id.imgImc);

        altura = findViewById(R.id.campoAltura);
        peso = findViewById(R.id.campoPeso);


        //verificaEnabled();
        checkRb();
    }

    public void calculaIMC(){
        double imc2;
        double pesoD, alturaD;
        pesoD = Double.parseDouble(peso.getText().toString());
        alturaD = Double.parseDouble(altura.getText().toString());
        if (sexo == "M"){
            pesoIdeal = (72.7*alturaD)-58;
            imgImc.setImageResource(R.drawable.male);
        }if (sexo == "F"){
            pesoIdeal = (62.1*alturaD)-44.7;
            imgImc.setImageResource(R.drawable.female);
        }


        txtTextViewResultadoPesoIdeal.setText("Seu peso ideal é: " + pesoIdeal);
        txtTextViewResultadoPeso.setText("Seu peso é: " + pesoD);
        imc = pesoD/(alturaD*alturaD);

        if (imc < 18.5){
            statusIMC=", Abaixo do peso Normal";
        }else if(imc > 18.5 && imc < 24.9){
            statusIMC=", Peso Normal";
        }
        else if(imc > 25 && imc < 29.9){
            statusIMC=", Sobrepeso";
        }
        else if(imc > 30 && imc < 34.9){
            statusIMC=", Obesidade Grau I";
        }
        else if(imc > 35 && imc < 39.9){
            statusIMC=", Obesidade Grau II";
        }
        else if(imc > 40){
            statusIMC=", Obesidade Grau III";
        }

        if (pesoD>pesoIdeal){
            txtTextViewResultadoAnalise.setText("Você está com IMC: "+imc+statusIMC+", e "+(pesoD-pesoIdeal)+"Kg Acima do peso Ideal");
        }else if (pesoIdeal>pesoD){
            txtTextViewResultadoAnalise.setText("Você está com IMC: "+imc+statusIMC+", e "+(pesoIdeal-pesoD)+"Kg Abaixo do peso Ideal");
        }


    }




    public void checkRb(){
        rbSexo = findViewById(R.id.rbSexo);
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
        calculaIMC();
        if(sexo == "M"){
            txtTextViewResultadoSexo.setText("Sexo: "+sexo);
        }else
        if(sexo == "F"){
            txtTextViewResultadoSexo.setText("Sexo: "+sexo);
        }

    }
}
