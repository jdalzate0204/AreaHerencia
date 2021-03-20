package co.edu.unicundi.areaherencia;

/**
 * Clase que se encarga de ejecutar la aplicacion
 * @author James Alzate
 * @author Alejandra Guzman
 * @version 1.0.1
 */
public class Principal {
    /**
     * Metodo que trae todos los calculos y resultados 
     */
    public void resultado(){
        //Se definen los objetos de cada clase
        ICalculos circulo=new Circulo();
        ICalculos cuadrado=new Cuadrado();
        ICalculos triangulo=new Triangulo();
        //Se crea el vector que almacena los datos de las figuras
        ICalculos[] vector=new ICalculos[3];
        vector[0]=circulo;
        vector[1]=cuadrado;
        vector[2]=triangulo;
        //Condicion que extrae todos los metodos utilizados en cada clase
        for(ICalculos cal:vector){
            if(cal instanceof  Circulo){
                ((Circulo)cal).circulo();
            }else if (cal instanceof  Cuadrado){
                ((Cuadrado)cal).cuadrado();
            }else if(cal instanceof Triangulo){
                ((Triangulo)cal).triangulo();
            }
            cal.area();
            cal.perimetro();
            AreaPerimetro resultado;
            resultado=((AreaPerimetro)cal);
            resultado.resultados();
        }          
    }
    
    /**
     * Permite ejecutar la aplicacion
     * @param args 
     */
    public static void main(String[] args) {
        Principal principal=new Principal();
        principal.resultado();
    }
}
