package misClases;

/**
 *
 * @author Equipo
 */
public class Alumno {

    private String codigo;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private int anioIngreso;
    private int ciclo;

    public Alumno(String codigo, String nombres, String apellidos, String fechaNacimiento, int anioIngreso, int ciclo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.anioIngreso = anioIngreso;
        this.ciclo = ciclo;
    }

    public int getCiclo() {
        return this.ciclo;
    }

    public void setCiclo(int nuevoCiclo) {
        this.ciclo = nuevoCiclo;
    }

    public String getCodigo() {
        return this.codigo;

    }

    public void setCodigo(String nuevoCodigo) {
        this.codigo = nuevoCodigo;
    }

    public void imprimirInformacion() {
        System.out.println("========== Informacion del alumno==================");
        System.out.println("Nombre : " + this.nombres);
        System.out.println("Apellidos : " + this.apellidos);
        System.out.println("Codigo : " + this.codigo);
        
    }
}
