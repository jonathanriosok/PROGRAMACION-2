package tp5.ej14;

public class DemoEj14 {
    public static void run() {
        System.out.println("\n-- Ej14: EditorVideo-Render-Proyecto (dependencia de creacion) --");
        Proyecto p = new Proyecto("Spot Primavera", 45);
        EditorVideo editor = new EditorVideo();

        Render r = editor.exportar("mp4", p);  // se crea dentro del método
        System.out.println(r);
    }
}
