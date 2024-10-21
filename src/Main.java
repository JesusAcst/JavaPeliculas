import com.aluracursos.JavaPeliculas.calculos.CalculadoraDeTiempo;
import com.aluracursos.JavaPeliculas.calculos.FiltroRecomendacion;
import com.aluracursos.JavaPeliculas.modelos.Episodio;
import com.aluracursos.JavaPeliculas.modelos.Pelicula;
import com.aluracursos.JavaPeliculas.modelos.Series;

public class Main {
    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula();
        peli1.setNombre("Matriz");
        peli1.setFechaDeLanzamiento(1999);
        peli1.setIncluidoEnElPlan(true);
        peli1.setDuracionEnMinutos(120);
        peli1.evalua(10);
        peli1.evalua(8);
        peli1.evalua(2);
        peli1.muestraFichaTecnica();


        Pelicula peli2 = new Pelicula();
        peli2.setNombre("Encanto");
        peli2.setFechaDeLanzamiento(2021);
        peli2.setIncluidoEnElPlan(true);
        peli2.setDuracionEnMinutos(120);
        peli2.evalua(10);
        peli2.evalua(8);
        peli2.evalua(2);
        peli2.muestraFichaTecnica();

        Series serie1 = new Series();
        serie1.setNombre("La casa del Dragon");
        serie1.setFechaDeLanzamiento(2022);
        serie1.setIncluidoEnElPlan(true);
        serie1.setTemporadas(1);
        serie1.setEpisodiosPorTemporadas(8);
        serie1.setMinutosPorEpisodio(60);
        serie1.getDuracionEnMinutos();
        serie1.evalua(10);
        serie1.evalua(8);
        serie1.evalua(2);
        serie1.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(peli1);
        calculadora.incluye(peli2);
        calculadora.incluye(serie1);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion=new FiltroRecomendacion();
        filtroRecomendacion.filtra(peli1);

        Episodio episodio=new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Casa targuer");
        episodio.setSerie("Casa del Dragon");
        episodio.setTotalVizualizacion(10000);

        filtroRecomendacion.filtra(episodio);
    }
}