package day17;
public class Bird implements IAnimal {

	@Override
	public void move() {
		System.out.println("the bird flies in the sky");
	}
	@Override
	public void speak() {
		System.out.println("the dog says woof woof");		
		System.out.println("the bird says chirp chirp");
	}
	
	public static void main(String args[]) {
		Dog dog=new Dog();
		dog.move();
		dog.speak();
		Bird B1= new Bird();
		B1.move();
		B1.speak();
		System.out.println(IAnimal.ismammal("dog"));
		System.out.println(IAnimal.category);
	}
	
}