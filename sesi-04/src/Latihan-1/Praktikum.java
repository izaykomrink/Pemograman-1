//class ini untuk menampilkan nama pada filenya.
public class Praktikum{
	//method utama yang akan menjalankan oleh java.
	public static void main(String[] args){
		//dideklarasikan variabel number1 = 20, number1=10 dan variabel results dengan tipe data integer.
		int number1, number2, results;
		boolean number;
		number1 = 20;
		number2 = 10;
		//membagi variabel dengan results = number1 / number2.
		results = number1 / number2;
		//mengeluarkan variabel dari number1/number2 dengan results
			System.out.println(results);
		//memjumlahkan variabel dengan results = number1 + number2. 
		results = number1 + number2;
		//mengeluarkan variabel dari number1 + number2.
			System.out.println(results);
		//untuk membandingkan apakah nilai 20 tidak sama dengan nilai 10.
		number = (20 != 10);
		//menampilkan variabel number = (20 !=10), dan akan menampilkan variabel
			System.out.println(number);
		//untuk membandingkan apakah nilai 20 sama dengan nilai 10.
		number = (20 == 10);
		//menampilkan variabel number = (20 == 10), dan akan menampilkan variabel
			System.out.println(number);
	}
}