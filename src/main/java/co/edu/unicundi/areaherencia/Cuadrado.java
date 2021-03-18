package co.edu.unicundi.areaherencia;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Cuadrado extends AreaPerimetro{
    public void cuadrado(){
        Scanner  entrada=new Scanner(System.in);
        double lado;
        
        System.out.println("\nIngrese un lado del cuadrado");
        lado=entrada.nextDouble();

        super.resultados(area(lado), perimetro(lado));
    }
    
    public double area(double lado){
        super.area = lado*lado;
        return area;
    }
    
    public double perimetro(double lado){
        super.perimetro = lado*4;
        return perimetro;
    }
}
