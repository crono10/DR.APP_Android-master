package com.practica1.elii.drapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
    }

    public void Onclick (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, MainActivity.class);
        startActivity(explicit_intent);
    }

    public void Analisis (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, analisis.class);
        startActivity(explicit_intent);
    }
       public void Citas (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, citas.class);
        startActivity(explicit_intent);
    }

    public void Expediente (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, expediente.class);
        startActivity(explicit_intent);
    }







}
