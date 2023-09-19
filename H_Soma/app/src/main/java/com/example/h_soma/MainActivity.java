package com.example.h_soma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void soma (View view){
        TextView resultado = findViewById(R.id.textViewResultado);
        EditText numero1 = findViewById(R.id.n1);
        EditText numero2 = findViewById(R.id.n2);

        double n1,n2, res;

        n1=Integer.parseInt(numero1.getText().toString());
        n2=Integer.parseInt(numero2.getText().toString());
        res = n1 + n2;
        resultado.setText(""+res);
    }
}
