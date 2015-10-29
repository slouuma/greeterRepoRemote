package edu.esprit.greeter;

public class Greeter {
	
	public String var1;


	/**
	 * 
	 * ajout d'un commentaire
	 * sayHello method 
	 * ajout tester sonar
	 * @param name
	 * @return "Hello "+name
	 */

	public String sayHello(String name){
		
		if(name.equals("MAN"))
			throw new IllegalArgumentException();
		
		return "Hello "+name;

	}

}
