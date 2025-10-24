public class Pez extends Animal implements Nadador {
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pez.hacerSonido()");
    }
    @Override
    public void nadar() {
        System.out.println("Pez.nadar()");
    }

}
