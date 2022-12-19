package edu.unicauca.ttm.gamertech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class categoriaActivity extends AppCompatActivity {

    ListView listaBoards;

    String datos [][] ={

            {"ASUS TUF B450-PRO GAMING","Motherboard AMD B450 ATX con iluminación LED AURA SYNC RGB Compatibilidad con DDR4 4400MHZ Dual M.2 USB 3.1 GEN 2 NATIVO", "$1.167.615"},
            {"B450 AORUS ELITE V2","AMD RYZEN de 3.A generación. Socket AM4 Memoria DDR4 3600/2933/2133 MHZ 128GB máx Integrado: audio HD RED USB 3.0. SATA 3.0 M.2 ATX PTOS:1XPCIEX16 1XPCIEX4 2XPCIEX1","$950.000"},
            {"MSI A320M PRO-VH","AMD AM4 DDR4 PCIE 3.0 SATA 6GB/S USB 3.2 GEN 2 ranura M.2 DVI/HDMI MICRO-ATX","$830.000"},
            {"ASUS PRIME H370-A","INTEL SOCKET 1151 FOR 8TH GENERATION DE PROCESADORES CORE I7/CORE 15 15/CORE 13/PENTIUM CELERON 4 X MEMORIA DIMM MAX. 64GB DDR4 2666/2400/2133 MHZ NON-ECC UN-BUFFERED","$500.000"}

    };

    int [] DatosImg={
            R.drawable.asus_tuf_b450,
            R.drawable.b450_aourus,
            R.drawable.msi_a320m,
            R.drawable.asus_prime_h370,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragment_barraBusqueda FragmentBarraBusqueda;
        setContentView(R.layout.activity_categoria);
        listaBoards = (ListView) findViewById(R.id.lvlLista);
        listaBoards.setAdapter(new Adaptador(this,datos,DatosImg));

        FragmentBarraBusqueda = new fragment_barraBusqueda();
        getSupportFragmentManager().beginTransaction().add(R.id.ContenedorFragment,FragmentBarraBusqueda).commit();
    }

    public void onClick(View view){
        Intent mIntent = null;

        switch (view.getId()){

            case R.id.btnAtrasPedir2:
                mIntent=new Intent(categoriaActivity.this,pideEnLinea.class);
                break;

        }startActivity(mIntent);
    }
}