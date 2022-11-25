package Ferreteria;
import java.util.Objects;

public class FijacionYsello extends Producto {
	private String tipoSello;
	private int duracion;
	

	public FijacionYsello(int id,String name, int precio, String tipoSello, int duracion) {
		super(id, name, precio);
		this.tipoSello = tipoSello;
		this.duracion = duracion;
	}

	public String getTipoSello() {
		return tipoSello;
	}

	public void setTipoSello(String tipoSello) {
		this.tipoSello = tipoSello;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String MostrarProducto() {
		return 	"Id: "+super.getId()+" Producto: "+super.getName()+" Tipo de Sellador: "+getTipoSello()+" Duracion: "+getDuracion()+" Precio: "+super.getPrecio();
	}
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    FijacionYsello fijado=(FijacionYsello) o;
	    return Float.compare(fijado.getPrecio(), getPrecio()) == 0 &&
	            Objects.equals(getId(), fijado.getId()) &&
	            Objects.equals(getName(), fijado.getName()) && 
	            Objects.equals(getTipoSello(), fijado.getTipoSello()) &&
	            Objects.equals(getDuracion(), fijado.getDuracion());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getPrecio(),getTipoSello(), getDuracion());
	}


	

}
