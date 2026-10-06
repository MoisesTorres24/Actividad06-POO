package biblioteca.modelo;

/**
 * Representa un usuario
 *
 * @version 1.0
 * @autor Moisés G Torres Gonzalez
 * @since 2026
 */
public class Usuario {
    private String nombre;
    private String numeroIdentificacion;

    /**
     * @param nombre               nombre del usuario
     * @param numeroIdentificacion identificador del usuario
     */


    public Usuario(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
}
