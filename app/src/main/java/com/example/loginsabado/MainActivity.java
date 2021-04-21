package com.example.loginsabado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginsabado.Models.Lugar;

public class MainActivity extends AppCompatActivity {



    TextView LugarMain,descripcionMain,MunicipioMain,distanciaMain,comentariosMain,estrellaMain;
    ImageView fotoLugar,mapMain;

    Lugar lugar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LugarMain =findViewById(R.id.LugarMain);
        estrellaMain =findViewById(R.id.estrellaMain);
        MunicipioMain =findViewById(R.id.MunicipioMain);
        distanciaMain =findViewById(R.id.distanciaMain);
        comentariosMain =findViewById(R.id.comentariosMain);
        fotoLugar =findViewById(R.id.fotoLugarMain);
        descripcionMain =findViewById(R.id.descripcionMain);
        mapMain =findViewById(R.id.mapMain);

        lugar=(Lugar) getIntent().getSerializableExtra("lugar");

        LugarMain.setText(lugar.getLugar());
        estrellaMain.setText(lugar.getEstrellas());
        MunicipioMain.setText(lugar.getMunicipio());
        distanciaMain.setText(lugar.getDistancia());
        // comentariosMain.setText(lugar.getEstrellas());
        descripcionMain.setText(lugar.getDescripcion());
        fotoLugar.setImageResource(lugar.getFotoLugar());


        mapMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LocationManager lm = (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);
                boolean gpsActivo = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);


                if (gpsActivo != false){
                    Intent h = new Intent(getApplicationContext(), maps.class);
                    startActivity(h);
                }
                else{
                    Toast.makeText(getApplicationContext(),"activa el GPS para poder continuar...",Toast.LENGTH_SHORT).show();
                }



            }
        });


    }








}





