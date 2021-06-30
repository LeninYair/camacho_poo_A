
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Punto;
import ec.edu.intsuperior.modelo.Bicicleta;
import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Autor;


public class Aplicacion {
    public static void main(String[] args) {
    Punto p1=new Punto(1,5);
    Punto p2=new Punto();  
    Bicicleta b1=new Bicicleta();
    Bicicleta b2= new Bicicleta(15,"Tundra", 525.36, 55,"Verde");
    Autor au1=new Autor("1234567890", "jorge", "flores", "02/05/1995");
    Libro l1=new Libro("la belleza en la programacion", "int superio",au1);
    Biblioteca biblio=new Biblioteca(250.0f, 55, l1,"Cayambe");
        System.out.println("la cordenada del punto1 en cordenada x"+p1.getX());
        System.out.println("la cordenada del punto1 en cordenada y"+p1.getY());
        
    }
    
}
