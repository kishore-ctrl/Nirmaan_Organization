package day17;

	public interface IAnimal {
		String Category= "living Being";
		 	public static final String category ="living being";
		 	static boolean ismammal(String animalName) {
		 		return((animalName=="dog")||(animalName=="cat")||(animalName=="human"));
		 	}
		 	default void speak() {
		 		System.out.println("Animal is making a Sound");
		 	}
		 	abstract void move();
		 	
	}


