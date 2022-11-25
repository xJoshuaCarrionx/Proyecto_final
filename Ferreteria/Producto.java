package Ferreteria;
import java.util.Objects;

public class Producto {
	private String name;
	private int precio;
	private int id;
	
	public Producto(int id, String name, int precio) {
		super();
		this.name = name;
		this.precio = precio;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String MostrarProducto() {
		return "id: "+id+" Marca: "+name+" Precio: "+precio;
	}
	
	
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Float.compare(producto.precio, precio) == 0 &&
                Objects.equals(id, producto.id) &&
                Objects.equals(name, producto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, precio);
    }

	

}
