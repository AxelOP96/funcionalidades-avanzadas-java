package javaAvanzado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
	  
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//Serializar 
		
		Person Michael = new Person();
		Person Peter = new Person();
		FileOutputStream fileOutputStream = new FileOutputStream("persons.txt");
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
	    objectOutputStream.writeObject(Michael);
	    objectOutputStream.writeObject(Peter);

		//Deserializar object a File
	    FileInputStream fileInputStream = new FileInputStream("persons.txt");
	    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	        
	    Person michaelCopy = (Person) objectInputStream.readObject();
	    Person peterCopy = (Person) objectInputStream.readObject();
	  }
	}
