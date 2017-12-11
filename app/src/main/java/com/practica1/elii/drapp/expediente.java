package com.practica1.elii.drapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class expediente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expediente);

    }

    public void Onclick (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, Receta.class);
        startActivity(explicit_intent);
    }

    public void Analisis (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, analisis.class);
        startActivity(explicit_intent);
    }
    }

