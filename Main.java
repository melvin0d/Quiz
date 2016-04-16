/**
 * Created by Lean7_PC on 7/03/2016.
 */
import java.util.Scanner;
public class Main {
    private static Scanner t;
    public static void main(String[] args) {
        String nom;
        String ape;
        String ced;
        String tel;
        int opc = -1;
        int cc = 0;
        int cp = 0;
        int cj = 0;
        t = new Scanner(System.in);
        String opcion = "S";
        while (opcion.equals("S")){
            System.out.print(" QUIZ N° 1");
            System.out.print("\n PROGRAMACIÓN II");
            System.out.print("\n \nPREPARADO POR: VIVIAN ALVAREZ");
            System.out.print("\n \n CENTRO EDUCATIVO ABC");
            System.out.println("\n\n Usted a Ingresado a la Matricula de Cursos en Linea, puede seleccionar una de las siguientes opciones:");
            System.out.println("1. Programacion en C++");
            System.out.println("2. Programacion en Python");
            System.out.println("3. Programacion en Java");
            while(opc < 1 || opc > 3) {
                System.out.print("\n Seleccione el numero del curso que desea matricular: ");
                opc = t.nextInt();
            }
            switch (opc) {
                case 1:
                    cc = cc + 1;
                    System.out.println("Usted a Matriculado es Programacion en C++");
                    break;
                case 2:
                    cp = cp + 1;
                    System.out.println("Usted a Matriculado es Programacion en Pyton");
                    break;
                case 3:
                    cj = cj + 1;
                    System.out.println("Usted a Matriculado es Programacion en Java");
                    break;
                default:
                    System.out.print("Usted a ingresado una opcion invalida, por favor seleccione una opcion de la lista.");
            }
            System.out.println("\n Por Favor ingrese los Datos Personales del Estudiante que desea matricular:");
            System.out.print("Nombre: ");
            nom = t.next();
            System.out.print("Apellido: ");
            ape = t.next();
            System.out.print("Cedula: ");
            ced = t.next();
            System.out.print("Telefono: ");
            tel = t.next();
            System.out.println("\n Datos del Estudiante Matriculado: \n \n Nombre Completo: " + nom + " " + ape + " \n Cedula de Identidad N°" + ced + " \n Matriculado en el curso N°: " + opc);
            System.out.println(" Se puede localizar al estudiante en el telefono: " + tel);
            System.out.print("\n Desea continuar (S/N): ");
            opcion = t.next();
        }
        System.out.println("\n Cantidad de Estudiantes Matriculado en cada Curso:\n\n" + " Curso Programacion en C++ " + cc + " Estudiantes"+ "\n Curso Programacion en Python " + cp + " Estudiantes" + "\n Curso Programacion en Java " + cj + " Estudiantes ");
    }
}
