package com.example.loginsabado;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginsabado.Models.Lugar;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder> {

    ArrayList<Lugar> listaDeDatos;

    public AdaptadorLista(ArrayList<Lugar> listaDeDatos) {
        this.listaDeDatos = listaDeDatos;
    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaItemLista= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_de_lista,null,false);
        return new viewHolder(vistaItemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position) {
        holder.actualizarDatosDeItem(listaDeDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDeDatos.size();
    }

    TextView lugar,municipio,descripcionResumenLugar,DescripcionLugar;
    ImageView imagenLugar;

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            lugar = itemView.findViewById(R.id.lugar);
            municipio = itemView.findViewById(R.id.municipio);
            descripcionResumenLugar = itemView.findViewById(R.id.descripcionResumenLugar);
            //DescripcionLugar = itemView.findViewById(R.id.DescripcionLugar);
            imagenLugar = itemView.findViewById(R.id.imagenLugar);

        }

        public void actualizarDatosDeItem(Lugar datos) {
            //nombreTrabajador.setText(datos);
            lugar.setText(datos.getLugar());
            municipio.setText(datos.getMunicipio());
            descripcionResumenLugar.setText(datos.getDescripcion());
            //DescripcionLugar.setText(datos.getDescripcion());
            imagenLugar.setImageResource(datos.getFotoLugar());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("lugar",datos);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
