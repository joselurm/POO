//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // conjunto de objetos de distintos tipos de animales
    List<Animal> animales = new ArrayList<>();
    animales.add(new Perro("Paco", 5));
    animales.add(new Gato("Garfield", 3));
    animales.add(new Pajaro("Piolín", 2));
    animales.add(new Pez("Nemo", 1));
    animales.add(new Pato("Donald", 4));

    System.out.println(" DEMOSTRACIÓN DE POLIMORFISMO ");
    // Llamar a los métodos mostrarInfo() y hacerSonido() de cada objeto
    for (Animal animal : animales) {
        animal.mostrarInfo();
        animal.hacerSonido();
        animal.comer();
    }

    System.out.println(" DEMOSTRACIÓN DE INTERFACES ");

    //Crear referencias de tipo Volador y Nadador
    List<Volador> voladores = new ArrayList<>();
    List<Nadador> nadadores = new ArrayList<>();

    //Agregar animales que pueden volar
    voladores.add(new Pajaro("Canario", 1));
    voladores.add(new Pato("Lucas", 3));

    //Agregar animales que pueden nadar
    nadadores.add(new Pez("Dory", 2));
    nadadores.add(new Pato("Daisy", 2));

    System.out.println(" Animales que vuelan ");
    for (Volador volador : voladores) {
        volador.volar();
    }

    System.out.println(" Animales que nadan ");
    for (Nadador nadador : nadadores) {
        nadador.nadar();
    }



}
