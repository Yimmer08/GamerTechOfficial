package edu.unicauca.ttm.gamertech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int imagenesPromociones[] =
                {
                        R.drawable.promocion1,
                        R.drawable.promo2,
                        R.drawable.promocion_3};
        v_flipper =findViewById(R.id.v_flipper);

        for (int imagen : imagenesPromociones) {
            flipperImages(imagen);

        }
    }
        //metodo flipperImages

        public void flipperImages(int imagePromo){
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(imagePromo);
            v_flipper.addView(imageView);
            v_flipper.setFlipInterval(7000); //time transaction
            v_flipper.setAutoStart(true);
            v_flipper.setInAnimation(this,android.R.anim.slide_out_right);
            v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        }

    public void onClick(View view){
          Intent mIntent = null;

          switch (view.getId()){

              case R.id.btnLogIn:
                  mIntent=new Intent(MainActivity.this,inicioSesion.class);
                  break;

              case R.id.btnCheckIn:
                  mIntent=new Intent(MainActivity.this,inicioSesion.class);
                  break;

              case R.id.btnOrderOnline:
                  mIntent=new Intent(MainActivity.this,pideEnLinea.class);
                  break;




          }startActivity(mIntent);
        }


    }




