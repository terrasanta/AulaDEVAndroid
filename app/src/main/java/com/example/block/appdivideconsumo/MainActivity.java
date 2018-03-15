package com.example.block.appdivideconsumo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private EditText valor;
    private EditText qtde;
    private Button btnCalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor = findViewById(R.id.valor);
        qtde = findViewById(R.id.qtde);
        btnCalcula = findViewById(R.id.btnCalcula);

        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float fvalor = Float.parseFloat(valor.getText().toString());
                int iqtde = Integer.parseInt(qtde.getText().toString());

                Float total = fvalor/iqtde;

                String data = "R$ " +fvalor+" divididos em "+iqtde+" pessoas da um total de "+ total+ " por pessoa";

                Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();
            }
        });
    }
}
