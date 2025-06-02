import java.util.ArrayList;

public class EjemploAlumnos {
    public static void main(String[] args) {
        // 1. Crear la lista genérica de tipo ArrayList<Alumno>
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // 2. Insertar valores: instanciamos objetos Alumno y los agregamos a la lista
        listaAlumnos.add(new Alumno("C001", "Carlos Tobar", "2025-1234"));
        listaAlumnos.add(new Alumno("M002", "María Guadalupe", "2025-5678"));
        listaAlumnos.add(new Alumno("J003", "Juan Perez", "2025-9012"));

        // 3. Mostrar en pantalla cada objeto Alumno de la lista
        System.out.println("Listado de alumnos registrados:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}

// Clase entidad Alumno con propiedades, encapsuladas y constructores
class Alumno {
    // Propiedades privadas (encapsuladas)
    private String codigo;
    private String nombre;
    private String carnet;

    // Constructor vacío (opcional, pero buena práctica)
    public Alumno() {
    }

    // Constructor parametrizado
    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    // Getters y setters (encapsulación)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    // Sobrescribir toString() para mostrar fácilmente los datos del alumno
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}
