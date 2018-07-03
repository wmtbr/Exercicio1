package com.wmtbr.exercici01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    private static final String NOME = null;
    private static final String SOBRENOME = null;
    private static final String IDADE = null;
    TextView nome;
    TextView sobrenome;
    TextView idade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);
        nome = (TextView) findViewById(R.id.receptNome);
        sobrenome = (TextView) findViewById(R.id.receptSobrenome);
        idade = (TextView) findViewById(R.id.receptIdade);
        Intent umIntent = getIntent();
        Bundle umBundle = umIntent.getExtras();
        nome.setText(umBundle.getString("NOME"));
        sobrenome.setText(umBundle.getString("SOBRENOME"));
        idade.setText(umBundle.getString("IDADE"));

    }
}
