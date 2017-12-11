package com.practica1.elii.drapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Person> persons;
    public static final int NOTIFICACION_ID=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView audioRv = (RecyclerView) findViewById(R.id.audio_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        audioRv.setLayoutManager(linearLayoutManager);
        populatePersons();
        ListAdapter listAdapter = new ListAdapter(persons);
        audioRv.setAdapter(listAdapter);

    }

    public void populatePersons() {
        persons = new ArrayList<>();
        persons.add(new Person("RECETA", "NO. DE EXPEDIENTE: 000324 \nFECHA: 28/04/2017 \nNOMBRE: Madrid Bautista Elizabeth \nSEXO: Femenino \nDR.(A):Verónica Macín Chavez \nCED.PROF.: 4564184 \nALERGIAS: Negado \nI.D. FARINGOAMIGDALITIS, ATITIS MEDIA ", ""));
        persons.add(new Person("1.- CEFALEXINA TAB 1GR", "1 tableta cada 8 horas durante 8 días vía de administración oral.", "#00FF00"));
        persons.add(new Person("2.- LEVODROPROPIZINA SOL 600MG/100ML", "10 ML cada 8 horas durante 7 días vía de administración oral", "#774499"));
        persons.add(new Person("3.- ACIDO ASCORBICO SABOR NARANJA COMP EFERV 2GR", "1 tableta cada 24 horas durante 10 días via de administración oral, disolver en un vaso con agua por las mañanas", ""));
        persons.add(new Person("4.- CLARITROMICINA TAB 500 MG", "1 tableta cada 12 horas durante 5 días via de administración oral", "#DDFF00"));
        persons.add(new Person("5.- CEFTRIAXONA/LIDOCAINA SOLUCIÓN INYECTABLE 1GR/35MG/3.5 ML", "1 inyeccion cada 24 horas durante 5 días via de administración oral", ""));
        persons.add(new Person("6.- NEBULIZACIONES ", "Diarias por 10 días", ""));
    }


    public void Notificacion (View view) {

        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,0);

        //Construccion de la notificacion;
        NotificationCompat.Builder builder= new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.reloj_26);
        builder.setContentIntent(pendingIntent);
        builder.setAutoCancel(true);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.logo_launcher));
        builder.setContentTitle("Recordatorio");
        builder.setContentText("CEFALEXINA TAB 1GR");
        builder.setSubText("Durante 8 Días");

        //Enviar la notificacion
        NotificationManager notificationManager= (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICACION_ID,builder.build());



        // Sonido por defecto de notificaciones, podemos usar otro
        Uri defaultSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
// Uso en API 11 o mayor
        builder.setSound(defaultSound);




    }

}
