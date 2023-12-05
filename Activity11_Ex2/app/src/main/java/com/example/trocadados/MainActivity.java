package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private EditText nomeInput, v2Input, v3Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        nomeInput = findViewById(R.id.textViewNome);
        v2Input = findViewById(R.id.v2Input);
        v3Input = findViewById(R.id.v3Input);


        button.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v){
Intent intent=new Intent(getApplicationContext(),RecebeDados.class);
                                        String nome;
                                          int v2Int,v3Int;
                                          nome = nomeInput.getText().toString();
                                          v2Int = Integer.parseInt(v2Input.getText().toString());
                                          v3Int = Integer.parseInt(v3Input.getText().toString());
intent.putExtra("nome",nome);
intent.putExtra("v2",v2Int);
intent.putExtra("v3",v3Int);
startActivity(intent);                               }
        }



        );
    }
}
