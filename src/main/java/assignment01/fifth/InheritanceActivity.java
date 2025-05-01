package assignment01.fifth;


//Superclass
class Animal {
	// Properties
	String name;

	// Constructor
	public Animal(String name) {
		this.name = name;
	}

	// Method
	public void eat() {
		System.out.println(name + " is eating.");
	}
}

//Subclass inheriting from Animal
class Dog extends Animal {
	// Additional property
	String breed;

	// Constructor for Dog
	public Dog(String name, String breed) {
		// Call the superclass constructor using super()
		super(name);
		this.breed = breed;
	}

	// Additional method specific to Dog
	public void sound() {
		System.out.println(name + " is barking.");
	}
}

class Cat extends Animal{
	
	String breed;

	public Cat(String name, String breed) {
		super(name);
		this.breed = breed;
	}
	
	public void sound() {
		System.out.println(name + " is meowing.");
	}
	
}



public class InheritanceActivity {
	public static void main(String[] args) {
		// Creating an instance of the subclass (Dog)
		Dog myDog = new Dog("Buddy", "Golden Retriever");
		Cat mycat = new Cat("Luna", "Ragdoll");

		System.out.println("Name: " + myDog.name);
		myDog.eat();
		myDog.sound();
		System.out.print("Breed: " + myDog.breed + "\n\n\n" );		

		
		System.out.println("Name: " + mycat.name);
		mycat.eat();
		mycat.sound();
		System.out.print("Breed: " + mycat.breed);

		
	}
}

