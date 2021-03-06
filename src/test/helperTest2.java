package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.computer;
import operations.helper;

class helperTest2 {

	@Test
	void testCpuChanger() {
		computer c1 = new computer("gpu1", "cpu1", "ID0001", "Modelo XXZ", 16, 512);
		computer c2 = new computer("gpu1", "cpu2", "ID0001", "Modelo XXZ", 16, 512);
		helper.cpuChanger(c1, c2);
		assertEquals("cpu2",c1.getCpu());
	}

}
