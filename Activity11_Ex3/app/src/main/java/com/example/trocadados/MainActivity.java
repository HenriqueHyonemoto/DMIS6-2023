package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private EditText v1Input, v2Input, v3Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);

        v1Input = findViewById(R.id.v1Input);
        v2Input = findViewById(R.id.v2Input);
        v3Input = findViewById(R.id.v3Input);


        button.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v){
Intent intent=new Intent(getApplicationContext(),RecebeDados.class);
String tipoTriangulo;
                                          int v1Int,v2Int,v3Int;
                                          v1Int = Integer.parseInt(v1Input.getText().toString());
                                           v2Int = Integer.parseInt(v2Input.getText().toString());
                                          v3Int = Integer.parseInt(v3Input.getText().toString());
                                          if(v1Int<=0 || v2Int<=0 || v3Int<=0)
                                              tipoTriangulo=("Input Invalido");
                                          else if(v1Int>=(v2Int+v3Int) || v3Int>=(v2Int+v1Int) || v2Int>=(v1Int+v3Int))
                                              tipoTriangulo=("Não");
                                          else{
                                              tipoTriangulo=("Sim");
                                          }

intent.putExtra("v1",v1Int);
intent.putExtra("v2",v2Int);
intent.putExtra("v3",v3Int);
intent.putExtra("tipoTriangulo",tipoTriangulo);
startActivity(intent);                               }
        }



        );
    }
}
