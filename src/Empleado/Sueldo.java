/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Sueldo {
    //Entradas
    public double SBasico;
    public LocalDate FIngreso;
    public String Cate;
    public int HTra;
    
    //Salidas
    public int Anti;
    public double Sueldo1;
    public double Sueldo2;
    public double Sueldo3;

    
    public void CSueldo()
    {
        /*Anti = Fecha actual - Fecha de ingreso Como la piden en años, me vasta restar
                año actual menos año de ingreso*/
        
        Anti = LocalDate.now().getYear() - FIngreso.getYear();
        
        Sueldo1 = SBasico + SBasico * 10 / 100;
        Sueldo2 = Sueldo1 + Sueldo1 * (Anti/2) / 100;
        Sueldo3 = Sueldo2 + Sueldo2 * (HTra-160) / 100;
    }
    
}
