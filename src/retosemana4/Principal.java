/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retosemana4;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *cambio es una invitacion----trasformacion es consecuencia del cambio
 * @author JFORERO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ingreso de datos

        Scanner reader = new Scanner(System.in);
        String nombre= reader.nextLine();
        String correo= reader.nextLine();
        String celular= reader.nextLine();
        String salario= reader.nextLine();
        String correo2= reader.nextLine();
        String celular2= reader.nextLine();
        Empleado juan= new Empleado(nombre, correo, celular,salario);
          
        juan.crear();
        
        ArrayList<Empleado> emp = new ArrayList<>();
        emp=Empleado.leer();
        
        System.out.println("Empleado creado: "+emp.get(0).getCorreo()+", nombre: "+emp.get(0).getNombre()+", celular: "+emp.get(0).getCelular());
          
        Empleado.actualizar(emp.get(0).getId(), emp.get(0).getNombre(), "", correo2, celular2, true, emp.get(0).getSalario(), "");
        emp=Empleado.leer();
        System.out.println("Empleado creado: "+emp.get(0).getCorreo()+", nombre: "+emp.get(0).getNombre()+", celular: "+emp.get(0).getCelular());
        int NumEmpleados=emp.size()-1;
        Empleado.borrar(emp.get(0).getId());
        System.out.println("Cantidad de empleados: "+NumEmpleados);
          
    }
    
}
