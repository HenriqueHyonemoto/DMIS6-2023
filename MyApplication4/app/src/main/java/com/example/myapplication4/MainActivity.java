package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    //method to change textview in interface

    public void changeText(View view){
        //create reference to field textview in the interface
        TextView text = findViewById(R.id.textViewTexto);
        if (text.getText().equals("Hello World!")){
            text.setText("Texto Alterado");
        } else if (text.getText().equals("Texto Alterado")){
            text.setText("Hello World!");
        }
    }

}
