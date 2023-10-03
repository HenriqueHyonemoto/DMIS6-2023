package com.example.pedra_papel_tesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private String jogadaMaquina, jogadaPlayer;
    private int pontosMaquina, pontosPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //toda vez que for acessar elemento da intrface, é necessario realizar import de view

    public void jogaMaquina(View view){
        String[] jogada={
                "pedra",
                "papel",
                "tesoura",
        };
        int i= new Random().nextInt(3);
        String maquinaRes=jogada[i];
        ImageView imgMaquina = findViewById(R.id.imgMaquina);
        if (maquinaRes.equals("pedra")){
            imgMaquina.setImageResource(R.drawable.pedra);
            this.jogadaMaquina = "pedra";
        }
        if (maquinaRes.equals("papel")){
            imgMaquina.setImageResource(R.drawable.papel);
            this.jogadaMaquina = "papel";
        }
        if (maquinaRes.equals("tesoura")){
            imgMaquina.setImageResource(R.drawable.tesoura);
            this.jogadaMaquina = "tesoura";
        }

    }



    public void mostrarResultado(View view){
        TextView txtVencedor = findViewById(R.id.vencedor);
        TextView txtMaqPts = findViewById(R.id.pontuacaoMaquina);
        TextView txtPlayerPts = findViewById(R.id.pontuacaoPlayer);
        if (this.jogadaPlayer.equals(this.jogadaMaquina)) {
            txtVencedor.setText("Vocês Empataram!");
            txtVencedor.setTextColor(Color.rgb(255, 165, 0));
        }
        if (this.jogadaPlayer == "pedra" && this.jogadaMaquina == "tesoura") {
            txtVencedor.setText("Você Ganhou!");
            txtVencedor.setTextColor(Color.GREEN);
            pontosPlayer++;
            txtPlayerPts.setText("Seus Pontos: " + pontosPlayer);
            txtMaqPts.setText("Maquina: " + pontosMaquina);
        }
        if (this.jogadaPlayer == "pedra" && this.jogadaMaquina == "papel") {
            txtVencedor.setText("Você Perdeu!");
            txtVencedor.setTextColor(Color.RED);
            pontosMaquina++;
            txtPlayerPts.setText("Seus Pontos: " + pontosPlayer);
            txtMaqPts.setText("Maquina: " + pontosMaquina);
        }
        //////////////////////////////////////////
        if (this.jogadaPlayer == "papel" && this.jogadaMaquina == "tesoura") {
            txtVencedor.setText("Você Perdeu!");
            txtVencedor.setTextColor(Color.RED);
            pontosMaquina++;
            txtPlayerPts.setText("Seus Pontos: " + pontosPlayer);
            txtMaqPts.setText("Maquina: " + pontosMaquina);
        }

        if (this.jogadaPlayer == "papel" && this.jogadaMaquina == "pedra") {
            txtVencedor.setText("Você Ganhou!");
            txtVencedor.setTextColor(Color.GREEN);
            pontosPlayer++;
            txtPlayerPts.setText("Seus Pontos: " + pontosPlayer);
            txtMaqPts.setText("Maquina: " + pontosMaquina);
        }
        /////////////////////////////////////////
        if (this.jogadaPlayer == "tesoura" && this.jogadaMaquina == "pedra") {
            txtVencedor.setText("Você Perdeu!");
            txtVencedor.setTextColor(Color.RED);
            pontosMaquina++;
            txtPlayerPts.setText("Seus Pontos: " + pontosPlayer);
            txtMaqPts.setText("Maquina: " + pontosMaquina);
        }

        if (this.jogadaPlayer == "tesoura" && this.jogadaMaquina == "papel") {
            txtVencedor.setText("Você Ganhou!");
            txtVencedor.setTextColor(Color.GREEN);
            pontosPlayer++;
            txtPlayerPts.setText("Seus Pontos: " + pontosPlayer);
            txtMaqPts.setText("Maquina: " + pontosMaquina);
        }
    }


    public void escolhePedra(View view){
        jogaMaquina(view);

        this.jogadaPlayer="pedra";

        ImageView imgPlayer = findViewById(R.id.imgPlayer);

        imgPlayer.setImageResource(R.drawable.pedra);

    mostrarResultado(view);
    }

    public void escolhePapel(View view){

        jogaMaquina(view);

        this.jogadaPlayer="papel";

        ImageView imgPlayer = findViewById(R.id.imgPlayer);

        imgPlayer.setImageResource(R.drawable.papel);

        mostrarResultado(view);
    }

    public void escolheTesoura(View view){

        jogaMaquina(view);

        this.jogadaPlayer="tesoura";

        ImageView imgPlayer = findViewById(R.id.imgPlayer);

        imgPlayer.setImageResource(R.drawable.tesoura);

        mostrarResultado(view);
    }

}
