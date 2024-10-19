package com.aluracursos.JavaPeliculas.calculos;
import com.aluracursos.JavaPeliculas.modelos.Titulo;

public class CalculadoraDeTiempo {

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    private int tiempoTotal;

    public void incluye(Titulo titulo){
        this.tiempoTotal+=titulo.getDuracionEnMinutos();
    }


}
