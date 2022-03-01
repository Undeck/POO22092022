package tarealibro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OmarA
 */
public class Libro {

    private int NoDePaginas;
    private int Anno;
    private String Editorial;
    private String Autor;
    private String Genero;
    private String Titulo;

    public Libro() {
    }

    public Libro(int NoDePaginas, String Editorial, String Autor, String Categoria, int Anno) {
        this.NoDePaginas = NoDePaginas;
        this.Editorial = Editorial;
        this.Autor = Autor;
        this.Genero = Genero;
        this.Anno = Anno;
        this.Titulo = Titulo;
    }

    public int getAnno() {
        return Anno;
    }

    public void setAnno(int Anno) {
        this.Anno = Anno;
    }

    public int getNoDePaginas() {
        return NoDePaginas;
    }

    public void setNoDePaginas(int NoDePaginas) {
        this.NoDePaginas = NoDePaginas;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "NoDePaginas=" + NoDePaginas + ", Editorial=" + Editorial + ", Autor=" + Autor + ", Genero=" + Genero + ", Anno=" + Anno + ", Titulo=" + Titulo + '}';
    }

    public void Abrir (String abierto) {
        System.out.println("El Libro" + abierto);
    }

    public void Leer (String leer) {
        System.out.println("El libro " + leer);
    }
}
