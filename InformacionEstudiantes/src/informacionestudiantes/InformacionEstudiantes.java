
package informacionestudiantes;

import java.util.Scanner;
/**
 *
 * @author ESFOT
 */
public class InformacionEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("\t\t\t\tInformacion Estudiantes");
        System.out.println();
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Los estudiantes a ingresar seran 5: ");
        int estud = scan.nextInt();
        
        Estudiantes[] estudiantes = new Estudiantes[estud];
        
        
        for(int i=0; i<estudiantes.length; i++){
            System.out.println("");
            System.out.println("Estudiante" +(i+1)); 
            scan.nextLine();
            
            System.out.print("Nombre: ");
            String nombre = scan.nextLine();
            
            System.out.print("Edad: ");
            int edad = scan.nextInt();
            
            System.out.println("Materias Del estudiante");
            scan.nextLine();
            //ingresamos solo 2 materias por que asi es como nos dice el enunciado
            System.out.print("Materia 1: ");
            String materia1 = scan.nextLine();
            System.out.println("2 nivel");
            
            System.out.print("Materia 2: ");
            String materia2 = scan.nextLine();
            System.out.println("2 nivel");
                    
        }
        
        System.out.println("Se ha ingresado la informacion con los siguientes datos");
        System.out.println("Nombre " + estudiantes[0].getNombre() + "Edad " + estudiantes[0].getEdad()
        + "Materias " + estudiantes[0].getMaterias());
        
        System.out.println("Nombre " + estudiantes[1].getNombre() + "Edad " + estudiantes[1].getEdad()
        + "Materias " + estudiantes[1].getMaterias());
          
        System.out.println("Nombre " + estudiantes[2].getNombre() + "Edad " + estudiantes[2].getEdad()
        + "Materias " + estudiantes[2].getMaterias());
            
        System.out.println("Nombre " + estudiantes[3].getNombre() + "Edad " + estudiantes[3].getEdad()
        + "Materias " + estudiantes[3].getMaterias());
              
        System.out.println("Nombre " + estudiantes[4].getNombre() + "Edad " + estudiantes[4].getEdad()
        + "Materias " + estudiantes[4].getMaterias());
        
          
    }

    
    }
    

