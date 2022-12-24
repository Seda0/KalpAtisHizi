package KalpHizi;

public class HeartRate {
	private double mhr;
	private double thr;
	private String name,surname;
	private int yas;
	public HeartRate(String name,String surname,int yas) {
		this.name=name;
		this.surname=surname;
		this.yas=yas;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public void show1() {
		System.out.println("adi soyadi giriniz :"+getName()+" "+getSurname());
		System.out.println("dogumtarihini giriniz :"+getYas());
		
	}
	
	
	public void maxHeartRate() {
		mhr=220-(2022+getYas());
	
		
	}
	
	public void targetHeartRate() {
		thr=mhr*(0.85);
		
	}
	
	public void show() {
		
		System.out.println("mhr="+mhr);
		System.out.println("thr="+thr);
		
		
		
		
	}
	
	
	
	
	
	
}
