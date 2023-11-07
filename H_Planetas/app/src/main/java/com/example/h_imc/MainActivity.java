package com.example.h_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView txtTextViewResultadoPeso;
    private ToggleButton toggleButton;
    private Switch switch1;
    private CheckBox checkboxAtivar;
    private ImageView imgImc;

    private RadioGroup rbPlanetas;
    private String planeta;

    private EditText pesoTerra;
    private double pesoPlaneta, pesoTerraD;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTextViewResultadoPeso = findViewById(R.id.txtTextViewResultadoPeso);
        imgImc = findViewById(R.id.imgImc);
        toggleButton = findViewById(R.id.toggleButton);
        pesoTerra = findViewById(R.id.pesoTerra);
        checkRb();
    }
    public void calcPeso(){
        pesoTerraD = Double.parseDouble(pesoTerra.getText().toString());
    }

    public void checkRb(){
        rbPlanetas = findViewById(R.id.rbPlanetas);
        rbPlanetas.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.rbMercurio){
                    calcPeso();
                    pesoPlaneta = pesoTerraD*0.37;
                    txtTextViewResultadoPeso.setText("Seu peso em Mercúrio: "+pesoPlaneta+"Kg");
                    imgImc.setImageResource(R.drawable.mercurio);
                }
                else if(checkedId == R.id.rbVenus){
                    pesoPlaneta = pesoTerraD*0.88;
                    txtTextViewResultadoPeso.setText("Seu peso em Venus: "+pesoPlaneta+"Kg");
                    imgImc.setImageResource(R.drawable.venus);
                }
                else if(checkedId == R.id.rbMarte){
                    pesoPlaneta = pesoTerraD*0.38;
                    txtTextViewResultadoPeso.setText("Seu peso em Marte: "+pesoPlaneta+"Kg");
                    imgImc.setImageResource(R.drawable.marte);
                }
                else if(checkedId == R.id.rbJupiter){
                    pesoPlaneta = pesoTerraD*2.64;
                    txtTextViewResultadoPeso.setText("Seu peso em Jupiter: "+pesoPlaneta+"Kg");
                    imgImc.setImageResource(R.drawable.jupiter);
                }
                else if(checkedId == R.id.rbSaturno){
                    pesoPlaneta = pesoTerraD*1.15;
                    txtTextViewResultadoPeso.setText("Seu peso em Saturno: "+pesoPlaneta+"Kg");
                    imgImc.setImageResource(R.drawable.saturno);
                }
                else if(checkedId == R.id.rbUrano){
                    pesoPlaneta = pesoTerraD*1.17;
                    txtTextViewResultadoPeso.setText("Seu peso em Urano: "+pesoPlaneta+"Kg");
                    imgImc.setImageResource(R.drawable.urano);
                }
                else if(checkedId == R.id.rbNetuno){
                    pesoPlaneta = pesoTerraD*1.18;
                    txtTextViewResultadoPeso.setText("Seu peso em Netuno: "+pesoPlaneta+"Kg");
                    imgImc.setImageResource(R.drawable.netuno);
                }
            }
        });
    }


    public void verificaEnabled(View view){
        if (toggleButton.isChecked()) {
            pesoTerra.setEnabled(true);
        } else {
            pesoTerra.setEnabled(false);
        }
    }

}
