package co.edu.unicundi.areaherencia;

/**
 * Clase que se encarga de almacenar atributos y metodos comunes(Clase Padre)
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public class AreaPerimetro {
    /**
     * Guarda el resultado del calculo de area
     */
    double area;
    /**
     * Guarda el resultado el calculo de perimetro
     */
    double perimetro;
    
    /**
     * Metodo que muestra los resultados 
     * @param resultadoA
     * @param resultadoP 
     */
    public void resultados(double resultadoA, double resultadoP){
        //impresion resultado de area y perimetro
        System.out.println("El area es: " + resultadoA);
        System.out.println("El perimetro es: " + resultadoP);
    }
}
