package com.wmtbr.exercici01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {
    EditText sendNome;
    EditText sendSobrenome;
    EditText sendIdade;
    Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        sendNome = (EditText) findViewById(R.id.sendNome);
        sendSobrenome = (EditText) findViewById(R.id.sendSobrenome);
        sendIdade = (EditText) findViewById(R.id.sendIdade);
        botao = (Button) findViewById(R.id.button);

    }

    public void clicado (View v){
        Toast.makeText(this, "EXECUTANDO", Toast.LENGTH_LONG).show();
        Intent meuIntent = new Intent(this, ReceptorActivity.class);
        //variavel nome guarda o que digitarem no sendNome
        String nome = sendNome.getText().toString();
        String sobrenome = sendSobrenome.getText().toString();
        String idade = sendIdade.getText().toString();

        Bundle meuBundle = new Bundle();
        meuBundle.putString("NOME", nome);

        meuBundle.putString("SOBRENOME", sobrenome);

        meuBundle.putString("IDADE", idade);
        meuIntent.putExtras(meuBundle);
        startActivity(meuIntent);

    }
}
