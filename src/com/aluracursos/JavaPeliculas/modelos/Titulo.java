package com.aluracursos.JavaPeliculas.modelos;

public class Titulo {
    //Definicion de Variables:
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    //Setters:
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {this.fechaDeLanzamiento = fechaDeLanzamiento;}
    public void setDuracionEnMinutos(int duracionEnMinutos) {this.duracionEnMinutos = duracionEnMinutos;}
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {this.incluidoEnElPlan = incluidoEnElPlan;}

    //Getters:
    public int getTotalDeLasEvaluaciones(){return totalDeLasEvaluaciones;}
    public String getNombre() {return nombre;}
    public int getFechaDeLanzamiento() {return fechaDeLanzamiento;}
    public int getDuracionEnMinutos() {return duracionEnMinutos;}
    public boolean isIncluidoEnElPlan() {return incluidoEnElPlan;}
    public double getSumaDeLasEvaluaciones() {return sumaDeLasEvaluaciones;}

    //METODOS:

    //Ficha tecnica:
    public void muestraFichaTecnica(){
        System.out.println("\n*******************************************");
        System.out.println("Nombre de la pelicula: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Duracion en Minutos: "+duracionEnMinutos);
        System.out.println("Evaluacion: "+calculamedia());
        System.out.println("Total de evaluaciones: "+totalDeLasEvaluaciones);
        System.out.println("*******************************************");
    }


    //Evaluacion:
    public void evalua(double nota){
        sumaDeLasEvaluaciones+=nota;
        totalDeLasEvaluaciones++;
    }

    //Media de evaluaciones:
    public double calculamedia(){
        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
    }
}
