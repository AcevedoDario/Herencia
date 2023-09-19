package main;

public abstract class Profesional implements Comparable<Profesional> {//Implementar Comparable
	protected static final double HONORARIO_BASICO = 500000; //STATIC SIGNIFICA ATRIBUTO O METODO DE LA CLASE Y FINAL SIGNIFICA QUE NO SE VA A HEREDAR
	protected String nombre;
	protected String apellido;
	
	public Profesional(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public double getHonorario() {
		return Profesional.HONORARIO_BASICO;//si la clase es abstracta se hace así
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido + ", honorario: " + this.getHonorario();
	}
	
	@Override
	public int compareTo(Profesional p) { //CompareTo compara el objeto instanciado con otro
//		if(this.getHonorario() < p.getHonorario())
//			return -1;
//		else
//			if(this.getHonorario() > p.getHonorario())
//				return 1;
//		else
//			return 0;
		return (-1) * Double.compare(this.getHonorario(), p.getHonorario());
	}
	
}
