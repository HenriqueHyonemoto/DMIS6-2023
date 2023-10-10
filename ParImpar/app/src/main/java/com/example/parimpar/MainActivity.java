package com.example.parimpar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private String  escolhaPlayer = "par";
    private int pontosMaquina, pontosPlayer,jogadaMaquina, jogadaPlayer, rodada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //toda vez que for acessar elemento da intrface, é necessario realizar import de view

    public void escolheImpar(View view){
        escolhaPlayer="impar";
       TextView txtImparOuPar = findViewById(R.id.imparOuPar);
       txtImparOuPar.setText("Sua Escolha: Impar");
    }
    public void escolhePar(View view){
        TextView txtImparOuPar = findViewById(R.id.imparOuPar);
        escolhaPlayer="par";
        txtImparOuPar.setText("Sua Escolha: Par");
    }

    public void calcRodadas(View view){
        if (rodada == 6){
            TextView txtRodada = findViewById(R.id.rodada);
            TextView txtImparOuPar = findViewById(R.id.imparOuPar);
            txtRodada.setText("Fim de Jogo");
            rodada = 0;
            ImageView imgMaquina = findViewById(R.id.imgMaquina);
            imgMaquina.setImageResource(R.drawable.zerodedos);

            if(pontosPlayer > pontosMaquina){
                txtImparOuPar.setText("Você Ganhou da Maquina!");
                txtImparOuPar.setTextColor(Color.GREEN);
            }else{
                txtImparOuPar.setText("Você Perdeu para Maquina!");
                txtImparOuPar.setTextColor(Color.RED);
            }
            pontosPlayer=0;
            pontosMaquina=0;
            ImageView imgPlayer1 = findViewById(R.id.umDedoImg);
            imgPlayer1.setEnabled(false);
           // imgPlayer1.setImageResource(R.drawable.zerodedos);
            ImageView imgPlayer2 = findViewById(R.id.doisDedoImg);
            imgPlayer2.setEnabled(false);
            //imgPlayer2.setImageResource(R.drawable.zerodedos);
            ImageView imgPlayer3 = findViewById(R.id.tresDedoImg);
            imgPlayer3.setEnabled(false);
            //imgPlayer3.setImageResource(R.drawable.zerodedos);
            ImageView imgPlayer4 = findViewById(R.id.quatroDedoImg);
            imgPlayer4.setEnabled(false);
            //imgPlayer4.setImageResource(R.drawable.zerodedos);
            ImageView imgPlayer5 = findViewById(R.id.cincoDedoImg);
            imgPlayer5.setEnabled(false);
            //imgPlayer5.setImageResource(R.drawable.zerodedos);

        }
        TextView txtRodada = findViewById(R.id.rodada);
            txtRodada.setText("Rodada: "+ rodada);

    }

    public void calcRes (View view){
        TextView txtVencedor = findViewById(R.id.vencedor);
        if (((jogadaMaquina + jogadaPlayer)%2 == 0)&&escolhaPlayer=="par"){
            pontosPlayer++;
            txtVencedor.setText("Você Ganhou!");
            txtVencedor.setTextColor(Color.GREEN);
        }
        if (((jogadaMaquina + jogadaPlayer)%2 == 0)&&escolhaPlayer=="impar"){
            pontosMaquina++;
            txtVencedor.setText("Você Perdeu!");
            txtVencedor.setTextColor(Color.RED);
        }
        if (((jogadaMaquina + jogadaPlayer)%2 != 0)&&escolhaPlayer=="impar"){
            pontosPlayer++;
            txtVencedor.setText("Você Ganhou!");
            txtVencedor.setTextColor(Color.GREEN);
        }
        if (((jogadaMaquina + jogadaPlayer)%2 != 0)&&escolhaPlayer=="par"){
            pontosMaquina++;
            txtVencedor.setText("Você Perdeu!");
            txtVencedor.setTextColor(Color.RED);
        }


    }


    public void jogaMaquina(View view){
        int[] jogadaM={
                1,
                2,
                3,
                4,
                5
        };
        int i= new Random().nextInt(5);
        jogadaMaquina=jogadaM[i];
        ImageView imgMaquina = findViewById(R.id.imgMaquina);
        if (jogadaMaquina == 1){
            imgMaquina.setImageResource(R.drawable.umdedo);
        }
        if (jogadaMaquina == 2){
            imgMaquina.setImageResource(R.drawable.doisdedos);
        }
        if (jogadaMaquina == 3){
            imgMaquina.setImageResource(R.drawable.tresdedos);
        }
        if (jogadaMaquina == 4){
            imgMaquina.setImageResource(R.drawable.quatrodedos);
        }
        if (jogadaMaquina == 5){
            imgMaquina.setImageResource(R.drawable.cincodedos);
        }

    }


    public void escolheUm(View view){
        this.jogadaPlayer=1;
        jogaMaquina(view);
        calcRodadas(view);
        calcRes(view);
        rodada++;
        TextView txtPontosMaq = findViewById(R.id.pontosMaq);
        TextView txtPontosPlayer = findViewById(R.id.mostraPontosPlayer);
        txtPontosMaq.setText("Pontos Maquina: "+ pontosMaquina);
        txtPontosPlayer.setText("Seus Pontos: "+ pontosPlayer);
    }
    public void escolheDois(View view){
        this.jogadaPlayer=2;
        jogaMaquina(view);
        calcRodadas(view);
        calcRes(view);
        rodada++;
        TextView txtPontosMaq = findViewById(R.id.pontosMaq);
        TextView txtPontosPlayer = findViewById(R.id.mostraPontosPlayer);
        txtPontosMaq.setText("Pontos Maquina: "+ pontosMaquina);
        txtPontosPlayer.setText("Seus Pontos: "+ pontosPlayer);
    }
    public void escolheTres(View view){
        this.jogadaPlayer=3;
        jogaMaquina(view);
        calcRodadas(view);
        calcRes(view);
        rodada++;
        TextView txtPontosMaq = findViewById(R.id.pontosMaq);
        TextView txtPontosPlayer = findViewById(R.id.mostraPontosPlayer);
        txtPontosMaq.setText("Pontos Maquina: "+ pontosMaquina);
        txtPontosPlayer.setText("Seus Pontos: "+ pontosPlayer);
    }
    public void escolheQuatro(View view){
        this.jogadaPlayer=4;
        jogaMaquina(view);
        calcRodadas(view);
        calcRes(view);
        rodada++;
        TextView txtPontosMaq = findViewById(R.id.pontosMaq);
        TextView txtPontosPlayer = findViewById(R.id.mostraPontosPlayer);
        txtPontosMaq.setText("Pontos Maquina: "+ pontosMaquina);
        txtPontosPlayer.setText("Seus Pontos: "+ pontosPlayer);
    }
    public void escolheCinco(View view){
        this.jogadaPlayer=5;
        jogaMaquina(view);
        calcRodadas(view);
        calcRes(view);
        rodada++;
        TextView txtPontosMaq = findViewById(R.id.pontosMaq);
        TextView txtPontosPlayer = findViewById(R.id.mostraPontosPlayer);
        txtPontosMaq.setText("Pontos Maquina: "+ pontosMaquina);
        txtPontosPlayer.setText("Seus Pontos: "+ pontosPlayer);
    }

}
