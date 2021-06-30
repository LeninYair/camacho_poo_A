//los grados de visibilidad son private, public, protected, y default
//los atributos son de visibilidad, 
package ec.edu.intsuperior.modelo;


public class Punto {
  private int x;
  private int y;
  // el que me ayuda a construir es un metodo especial que se llama constructor
  //el mismo nombre de la clase me sirve para construir un objeto de la clase  
  public Punto (){
      this.x=0;
      this.y=0;     
      System.out.println("objeto creado"); 
  }  
  public Punto(int x1,int y1){
      this.x=x1;
      this.y=y1;
  }  
// public void AsignarX(int x){
// this.x=x;
//}
// public int RetornarX(){
//  return x;
//  }  
//  public void SetY(int y){
//  this.y=y;
//  }
//  public int GetY(){
//  return y;
//   

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
 
  
}
