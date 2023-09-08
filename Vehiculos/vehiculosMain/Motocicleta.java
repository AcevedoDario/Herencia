package vehiculosMain;

public class Motocicleta extends Vehiculo{
	//atributos
	private boolean acompaniante;
	
	//constructor
	public Motocicleta (int kilometros, Chofer chofer, boolean acomp) {
		super(kilometros, chofer);
		acompaniante = acomp;
	}
	
	//metodos
	
	public Chofer getChofer() {
		return chofer;
	}
	
	@Override
	public void asignarOCambiarChofer(Chofer chofer) {
		if(!acompaniante)
			this.setChofer(chofer);
	}
}
