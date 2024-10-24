package com.aluracursos.JavaPeliculas.modelos;

import com.aluracursos.JavaPeliculas.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private String serie;
    private int totalVisualizaciones;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getTotalVizualizacion() {
        return totalVisualizaciones;
    }

    public void setTotalVizualizacion(int totalVizualizacion) {
        this.totalVisualizaciones = totalVizualizacion;
    }

    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 100){
            return 4;
        }else {
            return 2;
        }
    }
}

