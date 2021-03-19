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
    public void circulo(){
        Scanner entrada = new Scanner(System.in);
        /**
         * indica el radio del circulo
         */
        double radio;
        /**
         * se define el valor de pi (Constante)
         */
        final double PI = 3.1416;
        
        System.out.println("\nIngrese el radio del circulo");
        radio=entrada.nextDouble();
        //muestra el resultado de area y perimetro del circulo
        super.resultados(area(radio,PI), perimetro(radio,PI));
    }
    
    /**
     * Se calcula el area del circulo
     * @param radio
     * @param pi
     * @return 
     */
    public double area(double radio,double pi) {
        super.area=pi*pow(radio,2);
        return area;
    }
    
    /**
     * Se calcula el perimetro del circulo
     * @param radio
     * @param pi
     * @return 
     */
    public double perimetro(double radio,double pi){
        super.perimetro=2*pi*radio;
        return perimetro;
    }
}