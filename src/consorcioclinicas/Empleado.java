package consorcioclinicas;

public class Empleado {

    private int codigo;
    private String nombre;
    private String especialidad;
    private String genero;

    public Empleado(int codigo, String nombre, String especialidad, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.genero = genero;
    }
}
