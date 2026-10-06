package biblioteca.servicio;

import biblioteca.modelo.Ejemplar;
import biblioteca.modelo.EstadoEjemplar;
import biblioteca.modelo.Libro;
import biblioteca.modelo.Usuario;

import java.time.LocalDate;


/**
 * Representa un prestamo de una biblioteca
 *
 * @version 1.0
 * @autor Moisés G Torres Gonzalez
 * @since 2026
 */
public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    private Usuario usuario;
    private Ejemplar ejemplar;

    /**
     * @param fechaPrestamo   fecha que se hizo el prestamo
     * @param fechaDevolucion fecha de vencimiento
     */
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String realizarPrestamo(Usuario usuario, Ejemplar ejemplar) {
        this.usuario = usuario;
        this.ejemplar = ejemplar;
        this.ejemplar.setEstado(EstadoEjemplar.PRESTADO);
        return "El usuario " + this.usuario.getNombre() + " pidio prestado el ejemplar " + this.ejemplar.getTitulo() + " con codigo " + this.ejemplar.getCodigo();
    }

    public void devolver() {
        this.ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);
        System.out.println("El ejemplar con titulo " + this.ejemplar.getTitulo() + " con numero de identificacion " + this.ejemplar.getCodigo() + " a sido devuelto");
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(this.fechaDevolucion);
    }
}
