package controller;

import model.computer;
import operations.helper;

public class main {

	public static void main(String[] args) {
		computer c1 = new computer("gpu1", "cpu1", "ID0001", "Modelo XXZ", 16, 512);
		computer c2 = new computer("gpu2", "cpu2", "ID0002", "Modelo XYZ", 12, 1024);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println("A�adimos perifericos");
		c1.setPeriferico("Raton");
		c1.setPeriferico("Auriculares");
		c2.setPeriferico("Teclado");
		helper.verPerifericos(c1);
		System.out.println();
		helper.verPerifericos(c2);
		System.out.println("A�adimos ram y rom");
		helper.addRam(c2, 8);
		helper.addRom(c1, 512);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println("Cambiamos las cpu");
		helper.cpuChanger(c1, c2);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println("Esto es una prueba para git");
	}

}
