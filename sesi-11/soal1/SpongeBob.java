class SpongeBob extends Hewan implements Manusia{
	public SpongeBob(){
		super("sponge bob",2,false);
	}
	public void bersuara(){
		System.out.println("\nhallo patrict...");
	}
	public void menyanyi(){
		System.out.println("nye..nye..nye..nye..wik..wik...");
	}
	public void ketawa(){
		System.out.println("ckckckckckckcckckck");
	}
	public static void makan(){
		System.out.println("enak banget....");
	}
	public void makan2(){
		super.makan();
	}
	public static void main(String[] args){
		SpongeBob s = new SpongeBob();
		s.isHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan2();
		Hewan.makan();
		makan();
	}
}