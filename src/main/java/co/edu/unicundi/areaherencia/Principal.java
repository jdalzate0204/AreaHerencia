package co.edu.unicundi.areaherencia;

import java.util.Scanner;

/**
 * Clase que se encarga de ejecutar la aplicacion
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public class Principal {
    /**
     * Metodo que se encarga de mostrar el menu de la aplicacion
     */
    public void menu(){
        Scanner entrada = new Scanner(System.in);
        /**
         * Indica la opcion para ingresar
         */
        int opc;
        //objetos de las clases 
        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();
        Triangulo tri = new Triangulo();
        //Menu de la aplicacion
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
    /**
     * Permite ejecutar la aplicacion
     * @param args 
     */
    public static void main(String[] args) {
        Principal p = new Principal();
        p.menu();
    }
}
