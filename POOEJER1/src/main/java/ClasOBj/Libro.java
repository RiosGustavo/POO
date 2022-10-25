
package ClasOBj;

import java.util.Scanner;


public class Libro {
    
    // Atributos
    
    String ISBN;
    String Titulo;
    String Autor;
    int NumeroPaginas = 60;
    
    // Metodo Constructor
    
    public Libro(String ISBN, String Titulo, String Autor, int NumeroPaginas){
        
       this.ISBN =ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
        
       
        
    }
    
   public Libro(){
       
   }
    //Metodos
    
    // para cargtar un libro
    public void CargarLibro(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Procederemos a cargar un libro por favor ingrese: ");
        System.out.println("Ingrese ISBN");
        ISBN = leer.nextLine();
       
        System.out.println("Ingrese Titulo");
        Titulo = leer.nextLine();
        
        System.out.println("Ingrese Autor");
        Autor = leer.nextLine();
        
        System.out.println("Ingrese Numero de paginas");
        NumeroPaginas = leer.nextInt();
        
    }
    
  public void MostarLibro(){
        System.out.println("El ISBN del libro es: "+ISBN);
        System.out.println("El Titulo del libro es: "+Titulo);
        System.out.println("El Autor del libro es: "+Autor);
        System.out.println("La cantidad de paginas del libro es: "+NumeroPaginas);
    }
    
}
