package co.edu.unicundi.areaherencia;

/**
 * Clase que se encarga de ejecutar la aplicacion
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public class Principal {
    
    /**
     * Permite ejecutar la aplicacion
     * @param args 
     */
    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();
        Triangulo tri = new Triangulo();
        cir.circulo();
        cua.cuadrado();
        tri.triangulo();
    }
}
