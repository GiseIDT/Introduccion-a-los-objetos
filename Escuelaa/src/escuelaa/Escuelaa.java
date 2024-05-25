
package escuelaa;

import java.util.Scanner;


public class Escuelaa {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime  el nombre del alumno");
        String nombre = leer.next();
        
        Alumno alumno1 =new Alumno();
        Alumno alumno2 =new Alumno(nombre, nombre, 0, 0);
        
      
        System.out.println("El nombre y apellido del alumno 1 es "+ alumno2.getNombre()+" "+alumno2.getApellido());
        System.out.println(alumno2.toString());//puede o no estar el to.string
        alumno1.setNombre("Maria");
        System.out.println(alumno1);
        
        if (alumno2.getNota()<=10 && alumno2.getNota()>=7 ) {
            System.out.println("Su nota es sobresaliente");
        } else if (alumno2.getNota()<=6 && alumno2.getNota()>4 ){
            System.out.println("Su nota es aprobado");
        } else {
            System.out.println("Su nota es desaprobado");
        
            
        }
    }
    
}
