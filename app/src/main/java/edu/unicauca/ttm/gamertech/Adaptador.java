package edu.unicauca.ttm.gamertech;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view. ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int[] datosImg;

    //constructor
    public Adaptador(Context contexto, String[][] datos, int[] imagenes) {
        this.contexto = contexto;
        this.datos = datos;
        this.datosImg = imagenes;

        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.componente_lista, null);

        TextView titulo = (TextView) vista.findViewById(R.id.TituloBoard);
        TextView descripcion = (TextView) vista.findViewById(R.id.descriptionboard);
        TextView precio = (TextView) vista.findViewById(R.id.precioboard);
        ImageView imagen = (ImageView) vista.findViewById(R.id.imgBoard);

        titulo.setText(datos[i][0]);
        descripcion.setText(datos[i][1]);
        precio.setText(datos[i][2]);
        imagen.setImageResource(datosImg[i]);

        return vista;


    }

    @Override
    public int getCount() {return datosImg.length;}

    @Override
    public Object getItem(int i) {return null;}

    @Override
    public long getItemId(int i) {return 0;}

}
