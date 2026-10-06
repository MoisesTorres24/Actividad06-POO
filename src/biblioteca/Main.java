package biblioteca;

import biblioteca.modelo.*;
import biblioteca.servicio.Prestamo;

import java.time.LocalDate;

/**
 * Aplicacion principal de la biblioteca
 *
 * @version 1.0
 * @autor Moisés G Torres Gonzalez
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        // aqui se crea un libro
        Libro libro1 = new Libro("El principito", "Moises Torres");

        // aqui se crea un ejemplar
        Ejemplar ejemplar1 = new Ejemplar(libro1.getTitulo(), libro1.getAutor(), "01", EstadoEjemplar.DISPONIBLE);

        // aqui se crea usuario
        Usuario usuario1 = new Usuario("Jose", "U1");

        // aqui se crea una biblioteca
        Biblioteca biblioteca1 = new Biblioteca("USBI");

        // se le agrega un usuario a la biblioteca
        biblioteca1.agregarUsuario(usuario1);


        // aqui se crea un prestamo
        Prestamo prestamo1 = new Prestamo(LocalDate.now(), LocalDate.parse("2026-10-15"));

        // el usuario que creamos hace un prestamo
        prestamo1.realizarPrestamo(usuario1, ejemplar1);

        // estado del prestamo
        System.out.println("El estado es: " + prestamo1.estaVencido());

        // estado del ejemplar cuando esta prestado
        System.out.println("El ejemplar " + ejemplar1.getTitulo() + " con codigo " + ejemplar1.getCodigo() + " se encuentra " + ejemplar1.getEstado());
        prestamo1.devolver();

        // estado del ejemplar despues de ser devolvido
        System.out.println("El ejemplar " + ejemplar1.getTitulo() + " con codigo " + ejemplar1.getCodigo() + " se encuentra " + ejemplar1.getEstado());

    }
}
