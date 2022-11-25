package Ferreteria;
import java.util.Objects;


public class Electricidad extends Producto{
	private int voltaje;
	private int potencia;
	private int resistencia;

	public Electricidad(int id,String name, int precio, int voltaje, int potencia, int resistencia) {
		super(id, name, precio);
		this.voltaje = voltaje;
		this.potencia = potencia;
		this.resistencia = resistencia;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	@Override
	public String MostrarProducto() {
			return "Id: "+super.getId()+" Producto: "+super.getName()+" Voltaje: "+getVoltaje()+" Potencia: "+getPotencia()+" Resistencia : "+getResistencia()+" Precio: "+super.getPrecio();
		
	}
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Electricidad electricidades=(Electricidad) o;
	    return Float.compare(electricidades.getPrecio(), getPrecio()) == 0 &&
	            Objects.equals(getId(), electricidades.getId()) &&
	            Objects.equals(getName(), electricidades.getName()) && 
	            Objects.equals(getVoltaje(), electricidades.getVoltaje())&&
	            Objects.equals(getPotencia(), electricidades.getPotencia())&&
	            Objects.equals(getResistencia(), electricidades.getResistencia());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getPrecio(),getVoltaje(), getPotencia(), getResistencia()  );
	}
	
	

}
