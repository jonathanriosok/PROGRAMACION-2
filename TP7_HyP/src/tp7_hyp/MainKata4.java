package tp7_hyp;

public class MainKata4 {
    public static void main(String[] args) {
        Animal[] animales = new Animal[] {
                new Perro("Firulais"),
                new Gato("Mishi"),
                new Vaca("Lola")
        };

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();   // polimorfismo: se llama al método sobrescrito
            System.out.println("------------------");
        }
    }
}

