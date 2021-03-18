package co.edu.unicundi.areaherencia;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Circulo extends Area{
    
    double radio;
    static final double pi=3.1416;
    
    public void  cir(){
        Scanner  entrada=new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo");
        radio=entrada.nextDouble();

        area(radio,pi);
        perimetro(radio,pi);
        resultados();
    }
    
    public double area(double radio,double pi)
    {
        super.area=pi*pow(radio,2);
        return area;
    }
    
    public double perimetro(double radio,double pi){
        super.perimetro=2*pi*radio;
        return perimetro;
    }
    
    public void resultados(){
        System.out.println("El area del ciruclo es: " + area(radio,pi));
        System.out.println("El perimetro del circulo es: " + perimetro(radio,pi));
    }
}