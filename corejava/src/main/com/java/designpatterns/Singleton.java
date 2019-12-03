package main.com.java.designpatterns;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		
		try{
			instance = new Singleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
		return instance;
	}

}
