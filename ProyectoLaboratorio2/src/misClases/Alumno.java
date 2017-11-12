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
}
