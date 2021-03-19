package co.edu.unicundi.areaherencia;

import java.util.Scanner;

/**
 * Clase que se encarga de calcular el area y perimetro del cuadrado (Clase Hija)
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public class Cuadrado extends AreaPerimetro{
    public void cuadrado(){
        Scanner  entrada=new Scanner(System.in);
        /**
         * Indica el lado del cuadrado
         */
        double lado;
        
        System.out.println("\nIngrese un lado del cuadrado");
        lado=entrada.nextDouble();
         //muestra el resultado de area y perimetro del cuadrado
        super.resultados(area(lado), perimetro(lado));
    }
    
    /**
     * Se calcula el area del cuadrado
     * @param lado
     * @return 
     */
    public double area(double lado){
        super.area = lado*lado;
        return area;
    }
    
    /**
     * Se calcula el perimetro del cuadrado
     * @param lado
     * @return 
     */
    public double perimetro(double lado){
        super.perimetro = lado*4;
        return perimetro;
    }
}
