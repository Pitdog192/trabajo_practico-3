public class Libro {
    String titulo;
    String autor;
    private int anoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int nuevoAno) {
        if(nuevoAno > 0 && nuevoAno <= 2025) {
            anoPublicacion = nuevoAno;
        } else {
            System.out.println("Anio invalido");
        }
    }

    public void mostrarInformacion() {
        System.out.println(titulo + " - " + autor + " - " + anoPublicacion);
    }
}
