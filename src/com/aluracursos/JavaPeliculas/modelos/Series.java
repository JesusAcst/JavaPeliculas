package com.aluracursos.JavaPeliculas.modelos;

public class Series extends Titulo{
    //Definicion de variables:
    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;

    //Getters:
    public int getTemporadas() {
        return temporadas;
    }
    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public int getDuracionEnMinutos(){
        return temporadas*episodiosPorTemporadas*minutosPorEpisodio;
    }

    //Setters:
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


    public void muestraFichaTecnica(){
        System.out.println("\n*******************************************");
        System.out.println("Nombre de la pelicula: "+getNombre());
        System.out.println("Fecha de lanzamiento: "+getFechaDeLanzamiento());
        System.out.println("Temporadas: "+getTemporadas());
        System.out.println("Episodios: "+getEpisodiosPorTemporadas());
        System.out.println("Duracion en Minutos: "+getDuracionEnMinutos());
        System.out.println("Evaluacion: "+calculamedia());
        System.out.println("Total de evaluaciones: "+getTotalDeLasEvaluaciones());
        System.out.println("*******************************************");
    }





}
