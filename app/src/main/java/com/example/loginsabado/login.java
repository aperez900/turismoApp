package com.example.loginsabado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class login extends AppCompatActivity {

    Button botonInvitado;
    Button botonInvitado2;
    Spinner sp_municipio ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sp_municipio = findViewById(R.id.spinnerMunicipio);
        String[] ArrayAMunicipios= new String[]{
                "Seleccione Municipio", "Jardin"
        };

        ArrayList<String> ListAMunicipios = new ArrayList(Arrays.asList(ArrayAMunicipios));
        ArrayAdapter<String> adapterMunicipios = new ArrayAdapter<String>(this, R.layout.spinner_item_modified, ListAMunicipios);
        sp_municipio.setAdapter(adapterMunicipios);

        botonInvitado = findViewById(R.id.botonInvitado);
        botonInvitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), DrawerMenu.class);
                startActivity(h);
                finish();

            }
        });

    }
}