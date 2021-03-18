package co.edu.unicundi.areaherencia;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Triangulo extends AreaPerimetro {
    public void triangulo(){
        Scanner entrada=new Scanner(System.in);
        double base;
        double altura;
        double lado1;
        double lado2;
        double lado3;
        
        System.out.println("\nIngrese la base del triangulo");
        base=entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura=entrada.nextDouble();
        System.out.println("Ingrese el lado 1 del triangulo");
        lado1=entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del triangulo");
        lado2=entrada.nextDouble();
        System.out.println("Ingrese el lado 3 del triangulo");
        lado3=entrada.nextDouble();
        
        super.resultados(area(base,altura), perimetro(lado1,lado2,lado3));
    }
    
    public double area(double base, double altura){
        super.area = (base*altura)/2;
        return area;
    }
    
    public double perimetro(double lado1, double lado2,double lado3){
        super.perimetro = lado1+lado2+lado3;
        return perimetro;
    }
}
