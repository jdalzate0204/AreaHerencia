package co.edu.unicundi.areaherencia;

import java.util.Scanner;

/**
 * Clase que se encarga de calcular el area y perimetro del cuadrado (Clase Hija)
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public class Cuadrado extends AreaPerimetro{
    /**
     * Indica el lado del cuadrado
     */
    double lado;
    
    public void cuadrado(){
        Scanner  entrada=new Scanner(System.in);
        
        System.out.println("\nIngrese un lado del cuadrado");
        lado=entrada.nextDouble();
    }

    /**
     * Se calcula el area del cuadrado
     * @return getArea()
     */
    @Override
    public double area() {
        super.setArea(lado*lado);
        return getArea();
    }

    /**
     * Se calcula el perimetro del cuadrado
     * @return getPerimetro()
     */
    @Override
    public double perimetro() {
        super.setPerimetro(lado*4);
        return getPerimetro();
    }

    /**
     * Se muestra resultado(Metodo extendido de clase padre)
     */
    @Override
    public void resultados() {
        System.out.println("El area del cuadrado es: " + area());
        System.out.println("El perimetro del cuadrado es: " + perimetro());
    }
}
