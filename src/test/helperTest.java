package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.computer;
import operations.helper;

class helperTest {

	@Test
	void testAddRam() {
		computer c1 = new computer("gpu1", "cpu1", "ID0001", "Modelo XXZ", 16, 512);
		helper.addRam(c1, 4);
		assertEquals(20,c1.getRam());
	}

	@Test
	void testAddRom() {
		computer c1 = new computer("gpu1", "cpu1", "ID0001", "Modelo XXZ", 16, 512);
		helper.addRom(c1, 512);
		assertEquals(1024,c1.getRom());
	}

}
