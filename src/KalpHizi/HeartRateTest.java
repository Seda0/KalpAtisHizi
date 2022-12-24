package KalpHizi;

import java.util.Scanner;

public class HeartRateTest<person> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String surname;
		int yas;
		Scanner input = new Scanner(System.in);
		System.out.println("Adinizi Giriniz:");

		name = input.nextLine();

		System.out.println("Soyadinizi Giriniz :");
		surname = input.nextLine();

		System.out.println("Yasinizi Giriniz :");
		 yas = input.nextInt();

		HeartRate person = new HeartRate(name,surname, yas);
		System.out.println("Hosgeldiniz :" + person.getName() + " " + person.getSurname());
		System.out.println("Yasiniz :" + person.getYas());
		person.getName();
		person.getSurname();
		person.setYas(yas);
		System.out.println("Hosgeldiniz :" + person.getName() + " " + person.getSurname());
	
	    person.show();
	}

}
