package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Cirujano;
import main.CirujanoCardioVascular;
import main.Dentista;
import main.Endodoncista;
import main.Medico;
import main.Profesional;

class ProfesionalesTest {

	@Test
	void medicoTest() {
		Profesional chapatin = new Medico("Ronaldo", "Chapatin");
		assertEquals(500000.0, chapatin.getHonorario());
	}
	
	@Test
	void cirujanoTest() {
		Profesional cureta = new Cirujano("Carlos", "Chatatin");
		assertEquals(625000.0, cureta.getHonorario());
	}

	@Test
	void cirujanoCardioVascularTest() {
		Profesional aspirin = new CirujanoCardioVascular("Robert", "Chain");
		assertEquals(781250.0, aspirin.getHonorario());
	}
	
	@Test
	void dentistaTest() {
		Profesional molar = new Dentista("Dolores", "Gonzalez");
		assertEquals(500000.0, molar.getHonorario());
	}
	
	@Test
	void endodoncistaTest() {
		Profesional anabel = new Endodoncista("Anabel", "Chamorro");
		assertEquals(625000.0, anabel.getHonorario());
	}
}
