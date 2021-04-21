package com.example.loginsabado.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginsabado.AdaptadorLista;
import com.example.loginsabado.Models.Lugar;
import com.example.loginsabado.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ArrayList<Lugar> listaDeDatos = new ArrayList<>();
    RecyclerView listado;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        listado = view.findViewById(R.id.listado);
        listado.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));

        crearListado();
        AdaptadorLista adaptador = new AdaptadorLista(listaDeDatos);
        listado.setAdapter(adaptador);


        return view;
    }

    private void crearListado() {


        listaDeDatos.add(new Lugar(
                "TELESFERICO",
                "JARDIN",
                "80 km",
                "El Cable Aéreo de Jardín Antioquia es un medio de transporte...",
                R.drawable.telesferico,
                "El Cable Aéreo de Jardín Antioquia es un medio de transporte y de carga para los campesinos y también uno de los atractivos turísticos del municipio.",
                "5 estrellas"));
        listaDeDatos.add(new Lugar(
                "BASILICA",
                "JARDIN",
                "90 KM",
                "Templo de estilo neogótico que ocupa un área de 1.680m², construido...",
                R.drawable.basilica,
                "Templo de estilo neogótico que ocupa un área de 1.680m², construido en piedra labrada a mano extraída de una cantera de Serranías (vereda) entre 1918 y 1949, en varias etapas de construcción. ",
                "5 estrellas"));
        listaDeDatos.add(new Lugar(
                "CUEVA DEL ESPLENDOR",
                "JARDIN",
                "100 KM",
                "Es un lugar fascinante perdido entre las montañas del departamento de antioquia ...",
                R.drawable.esplendor,
                "Es un lugar fascinante perdido entre las montañas del departamento de antioquia, esta ubicado  en lo mas alto de las montañas que rodean el pueblo, en el sector conocido como el alto de flores",
                "4 estrellas"));
        listaDeDatos.add(new Lugar(
                "CUEVA DE GUACHAROS",
                "JARDIN",
                "110 KM",
                "Se encuentra en la parte alta de la quebrada La Salada en la vereda...",
                R.drawable.guacharos,
                "Se encuentra en la parte alta de la quebrada La Salada en la vereda del mismo nombre a cinco kilómetros de la cabecera municipal. Se trata de una cascada que cae entre las montañas que se levantan alrededor de una cueva, donde habitan los Guácharos.",
                "4 estrellas"));

    }
}