package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain{
	public static void main(String[] args)throws ParseException{
		Student s = new Student();
		s.setNim("4510210001");
		s.setNama("Izay Komrink");
		s.setAlamat("Jl. Raya Condet gg Waru No. 54 JakTim");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("22-11-1988"));
		s.setNoHp("08561672xxx");
		
		Employee e = new Employee();
		e.setNip("4510210024");
		e.setNama("Agus Trisnandar");
		e.setAlamat("Jl. Raya Ciracas No. 102");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("13-08-1989"));
		e.setNoHp("08989999xxx");
		
		showData(s);
		System.out.println("\n========================================\n");
		showData(e);
	}
	static void showData(Student s){
		System.out.println("Class Student");
		System.out.println("NIM : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMMM yyyy").format(s.getTglLahir()));
		System.out.println("No HP : " + s.getNoHp());
	}
	static void showData(Employee e){
		System.out.println("Class Employee");
		System.out.println("NIP : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("ALamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMMM yyyy").format(e.getTglLahir()));
		System.out.println("No HP : " + e.getNoHp());
	}
	
}