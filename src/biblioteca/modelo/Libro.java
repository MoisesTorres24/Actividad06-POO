package biblioteca.modelo;

/**
 * Representa un libro de una biblioteca
 *
 * @version 1.0
 * @autor Moisés G Torres Gonzalez
 * @since 2026
 */

public class Libro {
    private String titulo;
    private String autor;

    /**
     * @param titulo titulo del libro
     * @param autor  autor del libro
     */

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     *
     * @return titulo del libro
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @return nombre del autor
     */

    public String getAutor() {
        return autor;
    }
}