package com.example.h_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView txtTextViewResultado1, txtTextViewResultado2, textViewResCheck;
    private ToggleButton toggleButton;
    private Switch switch1;
    private CheckBox checkboxAtivar;

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

