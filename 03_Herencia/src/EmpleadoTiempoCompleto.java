public class EmpleadoTiempoCompleto extends Empleado {
    private int horasExtras;
    private int precioHorasExtras = 20;
    //Constructor
    public EmpleadoTiempoCompleto(String nombre, double salarioBase, int horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }
    //Getters
    public int getHorasExtras() {
        return horasExtras;
    }

    //Sobreescribo el metodo de calcular
    @Override
    public double calcularSalario() {
        return (this.getSalarioBase() + (horasExtras*precioHorasExtras));
    }

    //Sobreescribo el metodo que da la informacion
    public void mostrarInformacion(){
        System.out.println("Empleado a Tiempo Completo");
        super.mostrarInformacion();
        System.out.println("Horas Extra: " + horasExtras);
        System.out.println("Pago por Horas Extra: " + (horasExtras * precioHorasExtras));
    }




}
