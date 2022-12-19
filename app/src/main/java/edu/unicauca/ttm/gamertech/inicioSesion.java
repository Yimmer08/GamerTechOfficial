package edu.unicauca.ttm.gamertech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicioSesion extends AppCompatActivity {
    fragment_iniciar_sesion FragmentIniciaSesion;
    fragment_registro FragmentRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        FragmentIniciaSesion = new fragment_iniciar_sesion();
        getSupportFragmentManager().beginTransaction().add(R.id.ContenedorFragment,FragmentIniciaSesion).commit();

    }
    public void onClick(View view){
        FragmentRegistro = new fragment_registro();

        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

        Intent mIntent=null;
        switch (view.getId())
        {
            case R.id.btnInicioSesion:
                transaction=getSupportFragmentManager().beginTransaction().replace(R.id.ContenedorFragment,FragmentIniciaSesion);
                        break;
            case R.id.btnRegi:
                transaction=getSupportFragmentManager().beginTransaction().replace(R.id.ContenedorFragment,FragmentRegistro);
                        break;

            case R.id.btnAtrasInicioSesion:
                mIntent=new Intent(inicioSesion.this,MainActivity.class);
                startActivity(mIntent);
                break;

        }transaction.commit();



    }


    }
