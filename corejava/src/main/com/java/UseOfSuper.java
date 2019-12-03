package main.com.java;

class Animal {
	Animal(){
		System.out.println("animal is created");
	}  
}  

class Dog extends Animal{  
	Dog(){  
		System.out.println("dog is created");  
	}  
}  

public class UseOfSuper{  
	public static void main(String args[]){  
		Dog d=new Dog();  
	}


}
