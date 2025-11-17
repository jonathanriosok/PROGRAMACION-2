package tp6.colecciones;

public class MainStock {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario
        Producto p1 = new Producto("P001", "Leche", 900, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 5500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 12000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos", 800, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        System.out.println("=== LISTA DE PRODUCTOS ===");
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su info
        System.out.println("\n=== BUSCAR POR ID P003 ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 4. Filtrar por categoría
        System.out.println("\n=== PRODUCTOS ALIMENTOS ===");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) {
            p.mostrarInfo();
        }

        // 5. Eliminar producto por ID y listar restantes
        System.out.println("\n=== ELIMINAR P002 Y LISTAR ===");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n=== ACTUALIZAR STOCK P001 A 80 ===");
        inventario.actualizarStock("P001", 80);
        inventario.buscarProductoPorId("P001").mostrarInfo();

        // 7. Mostrar total de stock disponible
        System.out.println("\nTotal de unidades en stock: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n=== PRODUCTO CON MAYOR STOCK ===");
        Producto maxStock = inventario.obtenerProductoConMayorStock();
        if (maxStock != null) {
            maxStock.mostrarInfo();
        }

        // 9. Filtrar productos por precio entre 1000 y 3000
        System.out.println("\n=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        // 10. Mostrar categorías disponibles
        System.out.println("\n=== CATEGORIAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
