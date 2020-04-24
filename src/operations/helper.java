package operations;

import model.computer;

public class helper {
	
	public static void addRam(computer c, int ram) {
		c.setRam(c.getRam()+ram);
	}
	
	public static void addRom(computer c, int rom) {
		c.setRom(c.getRom()+rom);
	}
	
	public static void verPerifericos(computer c) {
		String[] p = c.getPerifericos();
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}
	
	public static void cpuChanger(computer c1, computer c2) {
		String com1 = c1.getCpu();
		String com2 = c2.getCpu();
		c1.setCpu(com2);
		c2.setCpu(com1);
	}
}
