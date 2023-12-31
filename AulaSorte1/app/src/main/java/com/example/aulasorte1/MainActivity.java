package com.example.aulasorte1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int sucesso =0;
    private int falha =0;

    public void sorteiaFrase(View view){
        //referencia a elemento da interface
        TextView txtFrase=findViewById(R.id.textFrase);

        //vetor de frases
        String[] frases={
                "1",
                "2",
                "3",
                "4",
                "5",
                "6"
        };

        //codigo para o sorteio
        //valores aleatórios

        int i= new Random().nextInt(6);

        //adaptar o textView para mostrar o resultado
        String fraseSorteada = frases[i];
        txtFrase.setText("Resultado: "+frases[i]);

        EditText txtEntrada=findViewById(R.id.editTextFrase);

        //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

        TextView maquinares=findViewById(R.id.maquinaVal);

        //vetor de frases
        String[] jogadamaquina={
                "1",
                "2",
                "3",
                "4",
                "5",
                "6"
        };


        int j= new Random().nextInt(6);

        //adaptar o textView para mostrar o resultado
        String MaquinaSorteada = jogadamaquina[j];
        maquinares.setText("Jogada da Maquina: "+jogadamaquina[j]);

        //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA





        TextView txtRes=findViewById(R.id.textViewResultado);
        if(txtEntrada.getText().toString().trim().isEmpty()){
            txtRes.setText("Você não digitou um número!");
            txtRes.setTextColor(Color.GRAY);
        }else {
            if (fraseSorteada.equalsIgnoreCase("" + txtEntrada.getText())) {
                txtRes.setText("Você Passou! =D");
                txtRes.setTextColor(Color.GREEN);
                sucesso++;

            } else {
                txtRes.setText("Você não passou =(");
                txtRes.setTextColor(Color.RED);
            }
            if (fraseSorteada.equalsIgnoreCase(MaquinaSorteada)) {
                falha++;
            }
        }
        TextView sucessamt = findViewById(R.id.sucessCount);
        sucessamt.setText("Seus Pontos:" +String.valueOf(sucesso)); // Converta 'sucesso' para String
        TextView failsamt = findViewById(R.id.failsCount);
        failsamt.setText("Pontos da Maquina:" + String.valueOf(falha)); // Converta 'falha' para String
    }
}

