package vehiculosMain;

public abstract class Vehiculo {
	//atributos
	private int kilometros;
	protected Chofer chofer;
	
	//constructor
	public Vehiculo(int kilometros, Chofer conductor) {
		this.kilometros = kilometros;
		this.chofer = conductor;
	}
	
	//metodos
	public int conocerKms() {
		return kilometros;
	}
	
	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	
	public abstract void asignarOCambiarChofer(Chofer chofer);
}