public class Pajaro extends Animal implements Volador {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pajaro.hacerSonido()");
    }
    @Override
    public void volar() {
        System.out.println("Pajaro.volar()");
    }
}
