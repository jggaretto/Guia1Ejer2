/*
En un nuevo proyecto crear una clase que represente una Computadora, usted determine
que atributos describirían mejor a dicho objeto y luego agregue un constructor para
inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de
la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado
de todos sus atributos.
 */
package ejer2;


public class Computadora {
     private String modelo;
    private int ram;
    private int almacenamiento;
    private double precio;
    
    public Computadora(String modelo, int ram, int almacenamiento, double precio) {
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getRam() {
        return ram;
    }
    
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public int getAlmacenamiento() {
        return almacenamiento;
    }
    
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
