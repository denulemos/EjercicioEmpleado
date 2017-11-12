/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavcac02;

//import Empleado.Entra0;
import Empleado.*;

/**
 *
 * @author alumno
 */
public class MAVCaC02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        System.out.println("mundo");
        
        //Crear un objeto de la clase DosNum
        DosNum dn0 = new DosNum();
        //Con un objeto creado utilizo el operador punto para acceder a los miembros
        dn0.operando1 = 100.0;
        dn0.operando2 = 50.0;
        dn0.Sumar();
        System.out.println("La suma: " + dn0.resultado);
        
        dn0.Restar(1000.0, 500.0);
        System.out.println("La resta: " +dn0.resultado);
        
        double resul = dn0.Multiplicar();
        System.out.println("La multiplicacion: " +resul);
 
        double resul1 = dn0.Dividir(5000, 1000);
        System.out.println("La division: " +resul1);
        
        resul = 5000.0 / 900.0;
        System.out.println("La pruebita es: " +resul);
        
        DosNum objeto1 = new DosNum();
        
        System.out.println("Division con objeto nuevo: " +objeto1.Dividir(1000, 15));
       
        //Defino los objetoo
        Entra0 e0;
        Sueldo suel;
        Sale0 s0;
        
        //Creo el objeto de la clase Entra0
        e0 = new Entra0();
        e0.Entrar();
        
        //System.out.println("Ingreso: " + e0.SBasico);
        
        suel = new Sueldo();
        //System.out.println("Calculo: " + suel.SBasico);
        
        suel.SBasico = e0.SBasico;
        suel.Cate = e0.Cate;
        suel.HTra = e0.HTra;
        suel.FIngreso = e0.FIngreso;
        
        suel.CSueldo();
        
        s0 = new Sale0();
        s0.Anti = suel.Anti;
        s0.Sueldo1 = suel.Sueldo1;
        s0.Sueldo2 = suel.Sueldo2;
        s0.Sueldo3 = suel.Sueldo3;
        s0.Mostrar();

        
        int entero; //Definir o Declarar variable, esto no se puede repetir
        
        entero = 44; //utilizar variable
//        int entero = 55;
        entero = 545; //puedo utilizar muchas veces

        for(int i = 0; i<3; i++)
        {
//copia
            //Creo el objeto de la clase Entra0
            e0 = new Entra0();
            e0.Entrar();

            //System.out.println("Ingreso: " + e0.SBasico);

            suel = new Sueldo();
            //System.out.println("Calculo: " + suel.SBasico);

            suel.SBasico = e0.SBasico;
            suel.Cate = e0.Cate;
            suel.HTra = e0.HTra;
            suel.FIngreso = e0.FIngreso;

            suel.CSueldo();

            s0 = new Sale0();
            s0.Anti = suel.Anti;
            s0.Sueldo1 = suel.Sueldo1;
            s0.Sueldo2 = suel.Sueldo2;
            s0.Sueldo3 = suel.Sueldo3;
            s0.Mostrar();
        }


        
    }
    
    
}
