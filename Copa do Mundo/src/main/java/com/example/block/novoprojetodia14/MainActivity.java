package com.example.block.novoprojetodia14;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Spinner grupo;
    private Button visualizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupo = findViewById(R.id.grupo);
        visualizar = findViewById(R.id.ver);

        visualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grupoSelecionado = grupo.getSelectedItem().toString();
                String data = "Times do grupo "+grupoSelecionado+": ";

                if(grupoSelecionado.equals("Grupo A")){
                    data += "\nEgito\nRússia\nArábia Saudita\ne Uruguai";
                }else if(grupoSelecionado.equals("Grupo B)")){
                    data += "\nIrã\nMarrocos\nPortugal\ne Espanha";
                }else if(grupoSelecionado.equals("Grupo C")){
                    data += "\nAustrália\nDinamarca\nFrança\ne Peru";
                }else if(grupoSelecionado.equals("Grupo D")){
                    data += "\nArgentina\nCroácia\nIslândia\ne Nigéria";
                }else if(grupoSelecionado.equals("Grupo E")){
                    data += "\nBrasil\nCosta Rica\nSuíça\ne Sérvia";
                }else if(grupoSelecionado.equals("Grupo F")){
                    data += "\nAlemanha\nCoréia do Sul\nMéxico\ne Suécia";
                }else if(grupoSelecionado.equals("Grupo G")){
                    data += "\nBélgica\nInglaterra\nPanamá\ne Tunísia";
                }else if(grupoSelecionado.equals("Grupo H")){
                    data += "\nColômbia\nJapão\nPolõnia\ne Senegal";
                }

                Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();
            }
        });
    }
}
