package vehiculosTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vehiculosMain.Autobus;
import vehiculosMain.Chofer;
import vehiculosMain.Motocicleta;

class VehiculosTest {

	@Test
	public void testChofer() {
		Chofer ch = new Chofer("Ruben", "Aguirre", 14);
		Motocicleta moto = new Motocicleta(100, ch, true);
		
		assertEquals(ch, moto.getChofer());
	}
	
	@Test
	public void testConocerKilometros() {
		Chofer ch2 = new Chofer("Ramon", "Valdez", 15);
		Autobus autobus = new Autobus(1800, ch2, 20);
		
		assertEquals(1800, autobus.conocerKms());
	}
	
	@Test
	public void testCambioDeChoferSinPasajeros() {
		Chofer ch3 = new Chofer("Carlos", "Villagran", 16);
		Chofer ch4 = new Chofer("Roberto", "Gomez", 17);
		
		Autobus autobus2 = new Autobus(1800, ch3, 0);
		Motocicleta moto2 = new Motocicleta(100, ch4, false);
		
		moto2.asignarOCambiarChofer(ch3);
		autobus2.asignarOCambiarChofer(ch4);
		
		assertEquals(ch3, moto2.getChofer());
		assertEquals(ch4, autobus2.getChofer());
		
	}
	
	@Test
	public void testCambioDeChoferConPasajeros() {
		Chofer ch3 = new Chofer("Carlos", "Villagran", 16);
		Chofer ch4 = new Chofer("Roberto", "Gomez", 17);
		
		Autobus autobus3 = new Autobus(1800, ch3, 22);
		Motocicleta moto3 = new Motocicleta(100, ch4, true);
		
		moto3.asignarOCambiarChofer(ch3);
		autobus3.asignarOCambiarChofer(ch4);
		
		assertEquals(ch4, moto3.getChofer());
		assertEquals(ch3, autobus3.getChofer());
		
	}

}
