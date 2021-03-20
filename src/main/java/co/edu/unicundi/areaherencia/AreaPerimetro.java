package co.edu.unicundi.areaherencia;

/**
 * Clase que se encarga de almacenar atributos y metodos comunes(Clase Padre)
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public abstract class AreaPerimetro implements ICalculos{
    /**
     * Guarda el resultado del calculo de area
     */
    private double area;
    /**
     * Guarda el resultado el calculo de perimetro
     */
    private double perimetro;
    
    /**
     * Metodo que muestra los resultados 
     * @param resultadoA
     * @param resultadoP 
     */
    public void resultados(double resultadoA, double resultadoP){
        //Impresion resultado de area y perimetro
        System.out.println("El area es: " + resultadoA);
        System.out.println("El perimetro es: " + resultadoP);
    }

    /**
     * Retorna la variable area
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * Recibe la variable area
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Retorna la variable perimetro
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * Recibe la variable perimetro
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
