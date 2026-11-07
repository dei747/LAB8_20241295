package pe.edu.pucp.iweb.lab8.beans;

/**
 * Ejercicio 2: bean Cancion.
 */
public class Cancion {

    // TODO: atributos idCancion, titulo, artista, duracionSeg, anio
    //          y genero (de tipo Genero)
    private String idCancion;
    private String titulo;
    private String artista;
    private int duracion_seg;
    private int anio;
    private Genero genero;
    // TODO: getters y setters

    public String getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(String idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion_seg() {
        return duracion_seg;
    }

    public void setDuracion_seg(int duracion_seg) {
        this.duracion_seg = duracion_seg;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * TODO: retornar la duración en formato m:ss
     *          (354 segundos -> "5:54", 200 segundos -> "3:20").
     */
    public String getDuracionFormateada(int duracion_seg) {
        int m = duracion_seg/60;
        int ss = duracion_seg-60*m;
        return m+":"+ss;
    }
}
