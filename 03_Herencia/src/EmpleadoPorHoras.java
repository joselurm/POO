public class EmpleadoPorHoras extends Empleado {
    private int horasExtras;
    private int precioHorasExtras = 20;
    //Constructor
    public EmpleadoPorHoras(String nombre, int horasExtras, int precioHorasExtras) {
        super(nombre, 0);
        this.horasExtras = horasExtras;
    }
    //Sobreescribo el metodo de calcular
    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + (horasExtras*precioHorasExtras);
    }
    //Sobreescribo el metodo que da la informacion
    public void mostrarInformacion(){
        System.out.println("Empleado por Horas");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Horas Trabajadas: " + horasExtras);
        System.out.println("Tarifa por Hora: " + precioHorasExtras);
        System.out.println("Salario Total: " + calcularSalario());
    }


}
