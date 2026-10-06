package biblioteca.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una biblioteca
 *
 * @version 1.0
 * @autor Moisés G Torres Gonzalez
 * @since 2026
 */

public class Biblioteca {
    private String nombre;

    private List<Usuario> listaUsuarios = new ArrayList<>();

    /**
     * @param nombre nombre de la biblioteca
     */

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }


    public void agregarUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
        System.out.println("Se agregó el usuario: " + usuario.getNombre() + " con identificador: " + usuario.getNumeroIdentificacion());
    }


}
