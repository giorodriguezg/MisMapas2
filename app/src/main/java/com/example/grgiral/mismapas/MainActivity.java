package com.example.grgiral.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void irMapa(View v){
        Intent intent = new Intent(this, MapsActivity.class);

        //ImageView view = (ImageView) findViewById(R.id.someImage);
        switch (v.getId()){
            case R.id.img_guatape: //id de ImageView.
                intent.putExtra("Longitud", 6.232481);
                intent.putExtra("Latitud", -75.160818);
                intent.putExtra("Descripcion", "Guatapé");
                break;
            case R.id.img_pueblito_paisa: //id de ImageView.
                intent.putExtra("Longitud", 6.236458);
                intent.putExtra("Latitud", -75.579787);
                intent.putExtra("Descripcion", "Pueblito Paisa");

                break;
            case R.id.img_parque_arvi: //id de ImageView.
                intent.putExtra("Longitud", 6.288948);
                intent.putExtra("Latitud", -75.509187);
                intent.putExtra("Descripcion", "Parque Arví");

                break;
            case R.id.img_santafe: //id de ImageView.
                intent.putExtra("Longitud", 6.560121);
                intent.putExtra("Latitud", -75.827816);
                intent.putExtra("Descripcion", "Santa Fé de Antioquia");

                //realiza operación al dar clic al imageView.
                break;
            default:
                break;




        }
        startActivity(intent);
       // Intent i = new Intent(this, MapsActivity.class);


     //   startActivity(i);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.img_guatape: //id de ImageView.

                //realiza operación al dar clic al imageView.
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

                break;
            default:
                break;
        }
    }



}
