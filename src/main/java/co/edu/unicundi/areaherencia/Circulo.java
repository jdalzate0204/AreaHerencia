package co.edu.unicundi.areaherencia;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 * Clase que se encarga de calcular el area y perimetro del circulo (Clase Hija)
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public class Circulo extends AreaPerimetro{
    /**
     * Indica el radio del circulo
     */
    double radio;
    /**
     * Se define el valor de pi (Constante)
     */
    final double PI = 3.1416;
    
    public void circulo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nIngrese el radio del circulo");
        radio=entrada.nextDouble();
    }
    
    /**
     * Se calcula el area del circulo
     * @return getArea()
     */
    @Override
    public double area() {
        super.setArea(PI*pow(radio,2));
        return getArea();
    }

    /**
     * Se calcula el perimetro del circulo
     * @return getPerimetro()
     */
    @Override
    public double perimetro() {
        super.setPerimetro(2*PI*radio);
        return getPerimetro();
    }
    /**
     * Se muestra resultado(Metodo extendido de clase padre)
     */
    @Override
    public void resultados() {
        System.out.println("El area del circulo es: " + area());
        System.out.println("El perimetro del circulo es: " + perimetro());
    }
}