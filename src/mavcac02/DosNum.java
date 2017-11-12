/*
 Clase para calculadora de do numeros
 */
package mavcac02;

/**
 *
 * @author alumno
 */
public class DosNum { //Definicion de la clase
    
    //Zona de definicion de atributos
    public double operando1;
    public double operando2;
    public double resultado;
    
    //Zona para los metodos de la clase
    
    //Metodo sin parametros y sin retorno. Cuando no hay retorno se coloca void
    public void Sumar()
    {
        resultado = operando1 + operando2;
    }
    
    //Metodo con dos parametros de entrada y sin valor de retorno
    public void Restar(double grande, double chico)
    {
        resultado = grande - chico;
    }
    
    //Metodo con valor de retorno
    public double Multiplicar()
    {
        double retorno = 0.0; //Declaro variable del tipo del valor de retorno

        retorno = operando1 * operando2;

        return retorno; //Retorna el valor al programa que lo llama
    }
    
    //Metodo con parametros de entrada y valor de retorno
    public double Dividir(double d1, double d2)
    {
        //DosNum dn0 = new DosNum No puedo crear adentro de una clase un objeto de esa clase
        double retorno = 0.0;
        
        if(d2!=0)
        {
            retorno = d1 / d2;
        }
        return retorno;
    }
}
