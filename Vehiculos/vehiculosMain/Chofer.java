package vehiculosMain;

import java.util.Objects;

public class Chofer {
	//atributos
	private String nombre;
	private String apellido;
	private int codigo;
	
	//constructor
	public Chofer(String nombre, String apellido, int codigo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chofer other = (Chofer) obj;
		return Objects.equals(apellido, other.apellido) && codigo == other.codigo
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}
