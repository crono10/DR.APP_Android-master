package com.practica1.elii.drapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

public class citas extends AppCompatActivity {
    private Button bfecha;
    private int dia, mes, ano;
    private EditText ediFecha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);

        bfecha = (Button) findViewById(R.id.bfecha);
        ediFecha = (EditText) findViewById(R.id.txtFecha);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] letra = {"Ortopedía","Oftalmología","Medicina de rehabilitación","Otorrinolaringologia","Anestesiología", "Quemaduras", "Patología del lenguaje"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letra));
    }


    //Boton Enviar
    public void Enviar (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, cancelacion.class);
        startActivity(explicit_intent);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void Fecha_Pick(View view) {
        if (view == bfecha) {
            final Calendar c = Calendar.getInstance();

            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            ano = c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    ediFecha.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                }
            }
                    , dia, mes, ano);
            datePickerDialog.show();
        }
    }
}
