package tp5.ej2;

public class DemoEj2 {
    public static void run() {
        System.out.println("\n-- Ej2: Celular-Bateria-Usuario --");
        Bateria b = new Bateria("EB-BJ", 5000);
        Celular c = new Celular("123456789012345", "Samsung", "A36", b);
        Usuario u = new Usuario("Ana Garcia", "23456789");

        c.setUsuario(u); // vincula la relación bidireccional
        System.out.println(c);

        // probar agregación: cambiar la batería
        c.setBateria(new Bateria("AB-XY", 4500));
        System.out.println("Nueva batería: " + c.getBateria());
    }
}
