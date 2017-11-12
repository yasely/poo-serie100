
import misClases.Alumno;

public class PruebaAlumno {

    public static void main(String[] args) {
        /*
         codigo: “27071009”.
 nombres: Jose Antonio.
 apellidos: Perez Quispe.
 fechaNacimiento: 01/01/1995
 anioIngreso: 2010
 ciclo: 10
         */
        //Establecer un obbjeto objetoAlumno1
        Alumno objetoAlumno1 = new Alumno("27071009", "Jose Antonio", "Perez Quispe", "01/01/1995", 2010, 10);

        System.out.println("El ciclo del objetoAlumno1 es : " + objetoAlumno1.getCiclo());
        objetoAlumno1.setCiclo(17);
        System.out.println("El Nuevo ciclo del objetoAlumno1 es : " + objetoAlumno1.getCiclo());

    }

}
