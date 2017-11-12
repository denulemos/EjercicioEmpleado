/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Entra0
{
        public double SBasico;
        public LocalDate FIngreso;
        public String Cate;
        public int HTra;
        
        public void Entrar()
        {
            //Creo el OBJETO entra0 de la clase java.util.scanner
            Scanner entra0 = new Scanner(System.in);
            
            System.out.print("SBasico: ");
            SBasico = entra0.nextDouble();
            
            //HTra. El punto no hace nada por que no es un objeto
            //FIngreso. es un objeto FECHAS
            FIngreso = LocalDate.parse("2017-10-18"); //convierte String a Fecha Tiene mas opciones
            
            System.out.print("Fecha de Ingreso (aaaa-mm-dd): ");
            
            FIngreso = LocalDate.parse(entra0.next());
            
            System.out.print("Categoria: ");
            Cate = entra0.next();
            
            System.out.print("Horas Trabajadas: ");
            HTra = entra0.nextInt();

        }
    
}