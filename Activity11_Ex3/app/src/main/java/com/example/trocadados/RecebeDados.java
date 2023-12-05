package com.example.trocadados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecebeDados extends AppCompatActivity {
private TextView txtV1,txtV2,txtV3, txtTriangulo;
    private Button button2;
    int v1,v2,v3;
    String tipoTriangulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dados);

        txtV1 = findViewById(R.id.textViewV1);
        txtV2 = findViewById(R.id.textViewV2);
        txtV3 = findViewById(R.id.textViewV3);
        txtTriangulo = findViewById(R.id.textViewTipoTriangulo);
        button2=findViewById(R.id.button2);


        Bundle dados=getIntent().getExtras();
        v1=dados.getInt("v1");
        v2=dados.getInt("v2");
        v3=dados.getInt("v3");
        tipoTriangulo=dados.getString("tipoTriangulo");

        txtV1.setText("Lado1: "+v1);
        txtV2.setText("Lado2: "+v2);
        txtV3.setText("Lado3: "+v3);
        txtTriangulo.setText(""+tipoTriangulo);

        if(v1>=(v2+v3) || v3>=(v2+v1) || v2>=(v1+v3))
            button2.setVisibility(View.INVISIBLE);
        else{
            button2.setVisibility(View.VISIBLE);
        }



        button2.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v){
                                          Intent intent=new Intent(getApplicationContext(),RecebeDadosFinal.class);
                                          String tipoEspecificoTriangulo;

                                          if(v1==v2 && v2==v3)
                                              tipoEspecificoTriangulo=("Triangulo Equilatero");
                                          else if(((v1*v1)+(v2*v2))==(v3*v3) || ((v1*v1)+(v3*v3))==(v2*v2) || ((v3*v3)+(v2*v2))==(v1*v1))
                                              tipoEspecificoTriangulo=("Triangulo Retângulo");
                                          else if(v1!=v2 && v2!=v3 && v3!=v1)
                                              tipoEspecificoTriangulo=("Triangulo Escaleno");
                                          else if(v1==v2 || v3==v1 || v3==v2)
                                              tipoEspecificoTriangulo=("Triangulo Isosceles");
                                          else{
                                              tipoEspecificoTriangulo=("Input Invalido");
                                          }
                                          intent.putExtra("v1",v1);
                                          intent.putExtra("v2",v2);
                                          intent.putExtra("v3",v3);
                                          intent.putExtra("tipoEspecificoTriangulo",tipoEspecificoTriangulo);
                                          startActivity(intent);                               }
                                  }



        );
    }
}
