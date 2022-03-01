
package tarealibro;
public class TareaLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setGenero("Novela");
        libro1.setTitulo("1984");
        libro1.setAnno(1949);
        libro1.setEditorial("Herder");
        libro1.setNoDePaginas(326);
        libro1.setAutor("George Orwell");

        System.out.println("Titulo del Libro: " + libro1.getTitulo());
        System.out.println("Genero: " + libro1.getGenero());
        System.out.println("Autor " + libro1.getAutor());
        System.out.println("Editorial: " + libro1.getEditorial());
        System.out.println("Anio: " + libro1.getAnno());
        System.out.println("Numero de paginas: " + libro1.getNoDePaginas()); 
        libro1.Abrir(" Ha sido abierto");
        libro1.Leer(" esta siendo leido");
    }
    
    
    
}
