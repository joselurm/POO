public class Pato extends Animal implements Volador, Nadador {
    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pato.hacerSonido()");
    }
    @Override
    public void volar() {
        System.out.println("Pato.volar()");
    }
    @Override
    public void nadar() {
        System.out.println("Pato.nadar()");
    }
}
