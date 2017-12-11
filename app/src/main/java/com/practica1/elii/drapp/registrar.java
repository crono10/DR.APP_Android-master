package com.practica1.elii.drapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class registrar extends AppCompatActivity implements View.OnClickListener {
    EditText edithtextUsuario, edithtextContraseña;
    private FirebaseAuth mAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        edithtextUsuario = (EditText) findViewById(R.id.email);
        edithtextContraseña = (EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progressbar1);
        findViewById(R.id.ButtonEnviar).setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.login2).setOnClickListener(this);


    }

    private void registerUser(){
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

        mAuth.createUserWithEmailAndPassword(usuario, contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
              progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()){
                    Intent intent = new Intent(registrar.this, menu2.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                } else{

                    if (task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(getApplicationContext(), "Tu estas registrado", Toast.LENGTH_SHORT).show();

                    }else{
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ButtonEnviar:
                registerUser();

                break;

            case R.id.login2:
                startActivity(new Intent(this, Inicio.class));

                break;
        }
    }
}

    /*public void Aceptar (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, Inicio.class);
        startActivity(explicit_intent);
        Toast t=Toast.makeText(this,"Se Registro con exito", Toast.LENGTH_SHORT);
        t.show();
    }
}
*/