public class Empleado {
    private String nombre;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    //Calcular salario
    public double calcularSalario() {
        return salarioBase;
    }
    //Muestra la informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Total: " + calcularSalario());
    }


}
