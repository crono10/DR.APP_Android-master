package com.practica1.elii.drapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class analisis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisis);
    }

    public void glucosa (View view) {
        new AlertDialog.Builder(this)
                .setTitle("GLUCOSA")
                .setMessage("La glucosa o dextrosa es un carbohidrato o glúcido que está relacionada con la cantidad" +
                        " de azúcar que el organismo es capaz de absorber a partir de los alimentos y transformar en energía" +
                        " para realizar diferentes funciones o simplemente ayudar a mantener el cuerpo caliente.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarGlucosa();

                    }
                }).create().show();
    }
    public void AceptarGlucosa() {

    }

    public void colesterol (View view) {
        new AlertDialog.Builder(this)
                .setTitle("COLESTEROL")
                .setMessage("El colesterol es una sustancia cerosa que usa el cuerpo para proteger los nervios," +
                        " para fabricar tejidos celulares y para producir determinadas hormonas." +
                        " El hígado fabrica todo el colesterol que necesita el cuerpo.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarColesterol();

                    }
                }).create().show();
    }
    public void AceptarColesterol() {
    }

    public void hemoglobina (View view){
        new AlertDialog.Builder(this)
                .setTitle("HEMOGLOBINA")
                .setMessage("La hemoglobina es una proteína presente en los glóbulos rojos que transporta el" +
                        " oxígeno a los órganos de su cuerpo y los tejidos y transporta el dióxido de carbono de " +
                        "los órganos y tejidos de nuevo a los pulmones.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarHemoglobina();

                    }
                }).create().show();
    }
    public void AceptarHemoglobina() {
    }

    public void leucocitos (View view) {
        new AlertDialog.Builder(this)
                .setTitle("LEUCOCITOS")
                .setMessage("Los leucocitos, también conocidos como glóbulos blancos," +
                        " son un componente importante de la sangre y una pieza clave en" +
                        " el sistema inmunológico del cuerpo.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarLeucocitos();

                    }
                }).create().show();
    }
    public void AceptarLeucocitos() {
    }

    public void eritrocitos (View view){
        new AlertDialog.Builder(this)
                .setTitle("ERITROCITOS")
                .setMessage("Los eritrocitos o glóbulos rojos son células que transportan oxígeno" +
                        " a todas las partes del cuerpo. Son el tipo más común de células sanguíneas; " +
                        "absorben el oxígeno en los pulmones o las branquias de los peces y lo liberan en los tejidos.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarEritrocitos();

                    }
                }).create().show();
    }
    public void AceptarEritrocitos() {
    }

    public void urea (View view){
        new AlertDialog.Builder(this)
                .setTitle("UREA")
                .setMessage("La urea es el principal producto de degradación del metabolismo de las proteínas." +
                        " Se origina en el hígado a partir de productos de la división de las proteínas y se" +
                        " elimina en los riñones en un 90%.")


                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarUrea();

                    }
                }).create().show();
    }
    public void AceptarUrea() {
    }

    public void calcio (View view){
        new AlertDialog.Builder(this)
                .setTitle("CALCIO")
                .setMessage("El calcio es un macromineral que cumple una importante " +
                        "función estructural en nuestro organismo al ser parte integrante de huesos y dientes." +
                        "Sin embargo, para la fijación del calcio en el sistema óseo es necesaria " +
                        "la presencia de Vitamina D.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarCalcio();

                    }
                }).create().show();
    }
    public void AceptarCalcio() {
    }


    public void trigliceridos (View view){
        new AlertDialog.Builder(this)
                .setTitle("TRIGLICERIDOS")
                .setMessage("Los triglicéridos son un tipo de grasa que se encuentra en la sangre." +
                        " El exceso de este tipo de grasa puede aumentar el riesgo de enfermedad de las arterias coronarias")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarTrigliceridos();

                    }
                }).create().show();
    }
    public void AceptarTrigliceridos() {
    }


    public void bilirrubina (View view){
        new AlertDialog.Builder(this)
                .setTitle("BILIRRUBINAS")
                .setMessage("La bilirrubina es un pigmento, de color amarillo anaranjado, presente en la sangre." +
                        "Es uno de los parámetros que se analizan en un análisis de sangre y ayuda a saber cómo " +
                        "funciona el hígado.")


                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarBilirrubina();

                    }
                }).create().show();
    }
    public void AceptarBilirrubina() {

    }


    public void ph (View view){
        new AlertDialog.Builder(this)
                .setTitle("PH")
                .setMessage("El pH es una forma de representar el carácter ácido, neutro o básico de una solución acuosa." +
                        " El agua pura está levemente disociada en iones H+ e iones OH- por partes iguales." +
                        "Cuando la cantidad de iones H+ es mayor a la de iones OH- la solución es ácida." +
                        "En caso inverso la solución es básica.")


                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarPh();

                    }
                }).create().show();
    }
    public void AceptarPh() {
    }


    public void bacterias(View view){
        new AlertDialog.Builder(this)
                .setTitle("BACTERIAS")
                .setMessage("Las bacterias son microorganismos unicelulares, con movilidad propia y que ostentan un muy pequeño " +
                        "tamaño y diversidad en su forma: esferas, barras, hélices, entre otras.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AceptarBacterias();

                    }
                }).create().show();
    }
    public void AceptarBacterias() {
    }


    public void Aceptar(){
        Intent explicit_intent;
        explicit_intent=new Intent(this,Inicio.class);
        startActivity(explicit_intent);

    }


}