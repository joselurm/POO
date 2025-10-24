abstract public class Animal {
    private String nombre;
    private int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método concreto
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " años");
    }

    // Método abstracto que las subclases deben implementar
    public abstract void hacerSonido();


}


