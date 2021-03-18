package co.edu.unicundi.areaherencia;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Cuadrado extends Area{
    public void cua(){
        Scanner  entrada=new Scanner(System.in);
        
        System.out.println("Ingrese la base del cuadrado");
        super.base=entrada.nextDouble();

        System.out.println("Ingrese la altura del cuadrado");
        super.altura=entrada.nextDouble();
        area(base,altura);
        perimetro(base,altura);
        resultados();
    }
    
    public double area(double base, double altura){
        super.area = base*altura;
        return area;
    }
    
    public double perimetro(double base, double altura){
        super.perimetro = (base*2)+(altura*2);
        return perimetro;
    }
    
    public void resultados(){
        System.out.println("El area del ciruclo es: " + area(base,altura));
        System.out.println("El perimetro del circulo es: " + perimetro(base,altura));
    }
}
