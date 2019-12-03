package main.com.java.designpatterns;

public class PC extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cput) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cput;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
