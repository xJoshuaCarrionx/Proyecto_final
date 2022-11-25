package Ferreteria;
import java.util.Objects;

public class Cerrajeria extends Producto {
	private String tipoSeguridad;
	private int nLlave;
	private String tipologiaCaNDADO;

	public Cerrajeria(int id, String name, int precio, String tipoSeguridad, int nLlave,  String tipologiaCaNDADO) {
		super(id,name, precio);
		this.tipoSeguridad = tipoSeguridad;
		this.nLlave = nLlave;
		this.tipologiaCaNDADO = tipologiaCaNDADO;
	}

	public String getTipoSeguridad() {
		return tipoSeguridad;
	}

	public void setTipoSeguridad(String tipoSeguridad) {
		this.tipoSeguridad = tipoSeguridad;
	}

	public int getnLlave() {
		return nLlave;
	}

	public void setnLlave(int nLlave) {
		this.nLlave = nLlave;
	}

	public String getTipologiaCaNDADO() {
		return tipologiaCaNDADO;
	}

	public void setTipologiaCaNDADO(String tipologiaCaNDADO) {
		this.tipologiaCaNDADO = tipologiaCaNDADO;
	}

	@Override
	public String MostrarProducto() {
		// TODO Auto-generated method stub
		return "Id: "+super.getId()+""
				+ "\n Producto: "+super.getName()+" "
				+ "\n Tipo de Seguridad: "+getTipoSeguridad()+""
				+ "\n N de Llave: "+getnLlave()+" "
				+ "\n Tipologia del candado: "+getTipologiaCaNDADO()+""
				+ "\n Precio: "+super.getPrecio()+"C$";
	}

	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Cerrajeria cerrajeria=(Cerrajeria) o;
	    return Float.compare(cerrajeria.getPrecio(), getPrecio()) == 0 &&
	            Objects.equals(getId(), cerrajeria.getId()) &&
	            Objects.equals(getName(), cerrajeria.getName()) && 
	            Objects.equals(getTipoSeguridad(), cerrajeria.getTipoSeguridad()) &&
	            Objects.equals(getnLlave(), cerrajeria.getnLlave())&&
	            Objects.equals(getTipologiaCaNDADO(), cerrajeria.getTipologiaCaNDADO());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getPrecio(),getTipoSeguridad(), getnLlave(), getTipologiaCaNDADO());
	}
	
	
	
	

}
