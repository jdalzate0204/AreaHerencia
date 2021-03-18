/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areaherencia;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Triangulo extends Area {
    double lado1;
    double lado2;
    double lado3;
      public void triangulo(){
        Scanner  entrada=new Scanner(System.in);
        
        System.out.println("Ingrese la base del triangulo");
        super.base=entrada.nextDouble();

        System.out.println("Ingrese la altura del triangulo");
        super.altura=entrada.nextDouble();
        
        System.out.println("Ingrese la lado 1 del triangulo");
        lado1=entrada.nextDouble();
        
        System.out.println("Ingrese la lado 2 del triangulo");
        lado2=entrada.nextDouble();
        
        System.out.println("Ingrese la lado 3 del triangulo");
        lado3=entrada.nextDouble();
        
        area(base,altura);
        perimetro(lado1,lado2,lado3);
        resultados();
    }
    
    public double area(double base, double altura){
        super.area = (base*altura)/2;
        return area;
    }
    
    public double perimetro(double lado1, double lado2,double lado3){
        super.perimetro = lado1+lado2+lado3;
        return perimetro;
    }
    
    public void resultados(){
        System.out.println("El area del triangulo es: " + area(base,altura));
        System.out.println("El perimetro del triangulo es: " + perimetro(lado1,lado2,lado3));
    }
}
