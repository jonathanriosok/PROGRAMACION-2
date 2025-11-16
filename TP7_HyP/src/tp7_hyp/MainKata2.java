package tp7_hyp;

public class MainKata2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];   // upcasting: Circulo/Rectangulo -> Figura

        figuras[0] = new Circulo(2.5);
        figuras[1] = new Rectangulo(4, 3);
        figuras[2] = new Circulo(1);

        for (Figura f : figuras) {
            System.out.println(
                    f.getNombre() + " - Area: " + f.calcularArea()
            );
        }
    }
}
