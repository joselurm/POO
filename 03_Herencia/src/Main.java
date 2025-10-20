//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Empleado[] empleados = new Empleado[2];
    empleados[0] = new EmpleadoTiempoCompleto("Ana García", 2000.0, 5);
    empleados[1] = new EmpleadoPorHoras("Carlos López", 15, 40);

    System.out.println("Mostramos la informacion de los empleados");
    //Recorrer el array
    for (int i=0; i<empleados.length; i++) {
        empleados[i].mostrarInformacion();
    }


    System.out.println("DEMOSTRACIÓN DEL POLIMORFISMO ");
    System.out.println("Total de salarios a pagar: " + calcularTotalSalarios(empleados));
}
// Método que demuestra polimorfismo
public static double calcularTotalSalarios(Empleado[] empleados) {
    double total = 0;
    for (Empleado empleado : empleados) {
        total += empleado.calcularSalario(); // Polimorfismo en acción
    }
    return total;
}
