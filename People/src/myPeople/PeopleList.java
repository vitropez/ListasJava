package myPeople;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PeopleList {
		 

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	System.out.println("dime tu nombre");
	 	     String nombre = sc.nextLine();
	 	     System.out.println("dime tu apellido");
	 	    String apellido = sc.nextLine();
	    		 System.out.println("añade un comentario");
	    		 String comentario = sc.nextLine();
	    		 System.out.println("dime tu edad");
	    		 int edad = sc.nextInt();
	 	     sc.close();
	 	     Person persona=new Person(nombre,apellido,edad,comentario);
	 	     Person persona2=new Person("JUAN","GARCIA",52,"SOY UN BUEN PROGRAMADOR");
	 	     List<Person>personas=new LinkedList<> ();
	 	     personas.add(persona);
	 	     personas.add(persona2);
	 	     System.out.println(personas);
	}

	}
