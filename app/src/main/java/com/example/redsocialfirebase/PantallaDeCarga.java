package com.example.redsocialfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaDeCarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_carga);
        final int Duracion = 2500;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(PantallaDeCarga.this,MainActivity.class);
                startActivity(intent);

            }
        },Duracion);
    }
}
