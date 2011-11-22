package main;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;
import java.io.*;

public class MainClass{
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
	String n="y";
	do{
	try{
		String x;
		int y,z; 
		CalculatorService service = new CalculatorServiceImpl();
		System.out.println("=================================");
		System.out.println("\tProgram Calculator");
		System.out.println("=================================");
		System.out.print("masukan angka pertama : ");
		y = Integer.parseInt(input.readLine());		
		System.out.print("masukan angka kedua : ");
		z = Integer.parseInt(input.readLine());
		System.out.print("masukan operator bilangan (+,-,*,/) : ");
		x = input.readLine();
		if(x.equals ("+")){
			Integer a = service.tambah(y , z);
			System.out.print("Hasil perhitungan dari ");
			System.out.println(y + "+" + z + "=" + a);
		}else if(x.equals ("-")){
			Integer b = service.kurang(y , z);
			System.out.print("Hasil perhitungan dari ");
			System.out.println(y + "-" + z + "=" + b);
		}else if(x.equals ("*")){
			Integer c = service.kali(y , z);
			System.out.print("Hasil perhitungan dari ");
			System.out.println(y + "*" + z + "=" + c);
		}else if(x.equals ("/")){
			Double d = service.bagi(y , z);
			System.out.print("Hasil perhitungan dari ");
			System.out.println(y + "/" + z + "=" + d);
		}else{
			throw new Exception("Pilihan Anda Tidak Ada");
		}
		System.out.print("Mau ngulang lagi kaga ? (y/n): ");
		n = input.readLine();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}while(n.equals ("y"));
	}
}