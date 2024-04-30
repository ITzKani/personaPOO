import java.util.Scanner;

class MainPersona{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        //Persona 1

        //Asigancion de nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = fn.nextLine();

        //Asignacion de apellido
        System.out.print("Ingresa tu apellido: ");
        String apellido = fn.nextLine();

        //Asigancion de edad
        System.out.print("Ingresa tu edad: ");
        int edad = fn.nextInt();

        //Asignacion de estatura
        System.out.print("Ingresa tu estatura: ");
        double estatura = fn.nextDouble();

        Persona p1 = new Persona();

        p1.setNombre(nombre);
        p1.setApellido(apellido);
        p1.setEdad(edad);
        p1.setEstatura(estatura);

        System.out.println(p1.toString());

        //Persona 2

        //Asigancion de nombre
        Scanner fn2 = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre2 = fn2.nextLine();

        //Asignacion de apellido
        System.out.print("Ingresa tu apellido: ");
        String apellido2 = fn2.nextLine();

        //Asigancion de edad
        System.out.print("Ingresa tu edad: ");
        int edad2 = fn2.nextInt();

        //Asignacion de estatura
        System.out.print("Ingresa tu estatura: ");
        double estatura2 = fn2.nextDouble();

        Persona p2 = new Persona();

        p2.setNombre(nombre2);
        p2.setApellido(apellido2);
        p2.setEdad(edad2);
        p2.setEstatura(estatura2);

        System.out.println(p2.toString());





        

    }
}