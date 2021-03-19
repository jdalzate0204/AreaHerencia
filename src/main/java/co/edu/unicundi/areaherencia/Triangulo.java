package co.edu.unicundi.areaherencia;

import java.util.Scanner;

/**
 * Clase que se encarga de calcular el area y perimetro del triangulo (Clase Hija)
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public class Triangulo extends AreaPerimetro {
    public void triangulo(){
        Scanner entrada=new Scanner(System.in);
        /**
         * Indica la base del triangulo
         */
        double base;
        /**
         * Indica la altura del triangulo
         */
        double altura;
        /**
         * Indica los lados del triangulo
         */
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
        //muestra el resultado de area y perimetro del triangulo
        super.resultados(area(base,altura), perimetro(lado1,lado2,lado3));
    }
    
    /**
     * Se calcula el area del triangulo
     * @param base
     * @param altura
     * @return 
     */
    public double area(double base, double altura){
        super.area = (base*altura)/2;
        return area;
    }
    
    /**
     * Se calcula el perimetro del triangulo
     * @param lado1
     * @param lado2
     * @param lado3
     * @return 
     */
    public double perimetro(double lado1, double lado2,double lado3){
        super.perimetro = lado1+lado2+lado3;
        return perimetro;
    }
}
