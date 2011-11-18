package main;

import java.io.*;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

public class MainClass{
	
	
	public static void main(String[] args){
		try{
			System.out.print("Masukkan Bilangan 1: ");input.writeLine();
			System.out.print("Masukkan Bilangan 2: ");input.writeLine();
			System.out.print("Masukkan Operator (+,-,*,/): ");input.writeLine();
	
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}