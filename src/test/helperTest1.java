package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.computer;
import operations.helper;

class helperTest1 {

	@Test
	void testVerPerifericos() {
		computer c1 = new computer("gpu1", "cpu1", "ID0001", "Modelo XXZ", 16, 512);
		c1.setPeriferico("Mouse");
		helper.verPerifericos(c1);
		assertEquals("Mouse",c1.getPeriferico("Mouse"));
	}

}
