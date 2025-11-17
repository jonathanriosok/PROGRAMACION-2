package tp6.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos = new ArrayList<>();

    // ● agregarProducto(Producto p)
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // ● listarProductos()
    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // ● buscarProductoPorId(String id)
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // ● eliminarProducto(String id)
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            return productos.remove(p);
        }
        return false;
    }

    // ● actualizarStock(String id, int nuevaCantidad)
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // ● filtrarPorCategoria(CategoriaProducto categoria)
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // ● obtenerTotalStock()
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // ● obtenerProductoConMayorStock()
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;

        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        return max;
    }

    // ● filtrarProductosPorPrecio(double min, double max)
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // ● mostrarCategoriasDisponibles()
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " - " + c.getDescripcion());
        }
    }
}
  
