package edu.unicauca.ttm.gamertech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pideEnLinea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fragment_barraBusqueda FragmentBarraBusqueda;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pide_en_linea);

        FragmentBarraBusqueda = new fragment_barraBusqueda();
        getSupportFragmentManager().beginTransaction().add(R.id.ContenedorFragment,FragmentBarraBusqueda).commit();
    }

    public void onClick(View view){
        Intent mIntent = null;

        switch (view.getId()){

            case R.id.btnAtrasCategorias:
                mIntent=new Intent(pideEnLinea.this,MainActivity.class);
                break;

            case R.id.btnBoards:
                mIntent=new Intent(pideEnLinea.this,categoriaActivity.class);
                break;

        }startActivity(mIntent);
    }
}