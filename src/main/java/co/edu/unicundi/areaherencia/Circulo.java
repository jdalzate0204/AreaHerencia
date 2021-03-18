package co.edu.unicundi.areaherencia;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Circulo extends AreaPerimetro{
    public void circulo(){
        Scanner entrada = new Scanner(System.in);
        double radio;
        final double pi = 3.1416;
        
        System.out.println("\nIngrese el radio del circulo");
        radio=entrada.nextDouble();

        super.resultados(area(radio,pi), perimetro(radio,pi));
    }
    
    public double area(double radio,double pi) {
        super.area=pi*pow(radio,2);
        return area;
    }
    
    public double perimetro(double radio,double pi){
        super.perimetro=2*pi*radio;
        return perimetro;
    }
}