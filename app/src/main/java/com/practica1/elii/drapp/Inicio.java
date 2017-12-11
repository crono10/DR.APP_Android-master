package com.practica1.elii.drapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Inicio extends AppCompatActivity implements View.OnClickListener {
     FirebaseAuth mAuth;
     EditText edithtextUsuario, edithtextContraseña;
     ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        mAuth = FirebaseAuth.getInstance();

        edithtextUsuario = (EditText) findViewById(R.id.txtcorreo);
        edithtextContraseña = (EditText) findViewById(R.id.txtcontraseña);
       progressBar = (ProgressBar) findViewById(R.id.progressbar2);

        findViewById(R.id.Cuenta).setOnClickListener(this);
        findViewById(R.id.conectarse).setOnClickListener(this);

    }

    private void userLogin(){
        String usuario = edithtextUsuario.getText().toString().trim();
        String contraseña = edithtextContraseña.getText().toString().trim();

        if(usuario.isEmpty()){
            edithtextUsuario.setError("Correo necesario");
            edithtextUsuario.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(usuario).matches()){
            edithtextUsuario.setError("Por favor introduzca un correo valido");
            edithtextUsuario.requestFocus();
            return;
        }
        if (contraseña.isEmpty()){
            edithtextContraseña.setError("Contraseña necesaria");
            edithtextContraseña.requestFocus();
            return;
        }

        if(contraseña.length()<6){
            edithtextContraseña.setError("El minimo de contrase es de 6 caracteres");
            edithtextContraseña.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(usuario,contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
               progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()){
                    Intent intent = new Intent(Inicio.this,menu2.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Cuenta:
                startActivity(new Intent(this, registrar.class));
                break;

            case R.id.conectarse:
                userLogin();

                break;

        }

    }
}

   /* public void Registar (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, registrar.class);
        startActivity(explicit_intent);
    }

    public void Contraseña (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, recuperar_contrasena.class);
        startActivity(explicit_intent);
    }

}

   */