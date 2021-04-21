package com.example.loginsabado.Models;

import java.io.Serializable;

public class Lugar implements Serializable {


    String lugar,municipio,distancia,descripcion,descripcionResumen,estrellas;
    int fotoLugar;


    public Lugar(String lugar, String municipio, String distancia, String descripcion, int fotoLugar, String descripcionResumen,String estrellas ) {
        this.lugar = lugar;
        this.municipio = municipio;
        this.distancia = distancia;
        this.descripcionResumen = descripcion;
        this.fotoLugar = fotoLugar;
        this.descripcion = descripcionResumen;
        this.estrellas = estrellas;
    }

    public String getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(String estrellas) {
        this.estrellas = estrellas;
    }

    public String getDescripcionResumen() {
        return descripcionResumen;
    }

    public void setDescripcionResumen(String descripcionResumen) {
        this.descripcionResumen = descripcionResumen;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFotoLugar() {
        return fotoLugar;
    }

    public void setFotoLugar(int fotoLugar) {
        this.fotoLugar = fotoLugar;
    }
}
