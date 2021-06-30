
package ec.edu.intsuperior.modelo;

public class Biblioteca {
float tamanio;
int aforo;
Libro libro;
String direccion;

    public Biblioteca() {
    }

    public Biblioteca(float tamanio, int aforo, Libro libro, String direccion) {
        this.tamanio = tamanio;
        this.aforo = aforo;
        this.libro = libro;
        this.direccion = direccion;
    }


}
