package co.edu.unicundi.areaherencia;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Principal {
    public void menu(){
        Scanner entrada = new Scanner(System.in);
        int opc;
        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();
        Triangulo tri = new Triangulo();
        
        do{
            System.out.println("\nCalculo de Area y Perimetro\n1. Circulo\n2. Cuadrado\n3. Triangulo");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    cir.circulo();
                    break;
                case 2:
                    cua.cuadrado();
                    break;
                case 3:
                    tri.triangulo();
                    break;
                default:
                    System.out.println("Opción no valida");
            }
            System.out.println("\n¿Desea realizar otro calculo? 1. Si / 2. No");
            opc = entrada.nextInt();
        }while(opc == 1);
    }
    
    public static void main(String[] args) {
        Principal p = new Principal();
        p.menu();
    }
}
