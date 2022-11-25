package Ferreteria;
import java.util.Objects;


public class Pintura extends Producto{
	private String tipoPintura;

	public Pintura( int id,String name, int precio, String tipoPintura) {
		super(id, name, precio);
		this.tipoPintura = tipoPintura;
	}

	//public String getColor() {return Color;}

	//public void setColor(String color) {Color = color;}

	public String getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

	@Override
	public String MostrarProducto() {
		return "Id: "+super.getId()+" Pintura: "+super.getName()+" Tipo de Pintura: "+getTipoPintura()+" Precio: "+super.getPrecio();
	}
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Pintura pinturas=(Pintura) o;
	    return Float.compare(pinturas.getPrecio(), getPrecio()) == 0 &&
	            Objects.equals(getId(), pinturas.getId()) &&
	            Objects.equals(getName(), pinturas.getName()) && 
	            Objects.equals(getTipoPintura(), pinturas.getTipoPintura());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getPrecio(),getTipoPintura());
	}
	
	

}
