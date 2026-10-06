package biblioteca.modelo;

public class Ejemplar extends Libro {
    private String codigo;
    private EstadoEjemplar estado;

    /**
     * @param codigo  codigo del ejemplar
     * @param estado estado del ejemplar
     */
    public Ejemplar(String titulo, String autor, String codigo, EstadoEjemplar estado) {
        super(titulo, autor);
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }
}
