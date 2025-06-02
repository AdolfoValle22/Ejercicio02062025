import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        // Crear una lista de tipo LinkedList que almacene objetos Alumno
        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        // Agregar alumnos a la lista
        listaAlumnos.add(new Alumno("M001", "Mauricio Guerrero", "2025-1111"));
        listaAlumnos.add(new Alumno("L002", "Luis Mora", "2025-2222"));
        listaAlumnos.add(new Alumno("P003", "Pedro Sanchez", "2025-3333"));

        // Mostrar los elementos de la lista
        System.out.println("Listado de alumnos en la LinkedList:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}

// Clase Alumno (igual que en el ejercicio anterior)
class Alumno {
    private String codigo;
    private String nombre;
    private String carnet;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

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

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}
