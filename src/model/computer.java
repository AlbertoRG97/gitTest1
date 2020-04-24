package model;

public class computer {
	
	private String gpu, cpu, id, model;
	private int ram, rom, position = 0;
	private String[] perifericos = new String[5];
	private String date;
	
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getPeriferico(String p) {
		String x = "";
		for (int i = 0; i < perifericos.length; i++) {
			x = perifericos[i];
			if(x.equals(p)) {
				x = p;
				break;
			}
			else {
				continue;
			}
		}
		return x;
	}
	public String[] getPerifericos() {
		return perifericos;
	}
	public void setPerifericos(String[] perifericos) {
		this.perifericos = perifericos;
	}
	public void setPeriferico(String periferico) {
		this.perifericos[position] = periferico;
		position++;
	}
	
	public computer(String gpu, String cpu, String id, String model, int ram, int rom) {
		super();
		this.gpu = gpu;
		this.cpu = cpu;
		this.id = id;
		this.model = model;
		this.ram = ram;
		this.rom = rom;
	}
	@Override
	public String toString() {
		return "id = " + id + " model = " +model + " gpu = " + gpu + " cpu = " + cpu + " ram = " + ram + " rom = " + rom;
	}
}
