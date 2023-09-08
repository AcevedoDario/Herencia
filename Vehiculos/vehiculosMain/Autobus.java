package vehiculosMain;

public class Autobus extends Vehiculo{
	//atributos
	private int pasajeros;
	
	//constructor
	public Autobus (int kilometros, Chofer chofer, int pasajeros) {
		super(kilometros, chofer);
		this.pasajeros = pasajeros;
	}
	
	//metodos
	
	public Chofer getChofer() {
		return chofer;
	}
	
	@Override
	public void asignarOCambiarChofer(Chofer chofer) {
		if(pasajeros == 0)
			this.setChofer(chofer);
	}
}
