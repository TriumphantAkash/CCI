import java.util.ArrayList;

import hashMap.*;
public class MainClass {
	
	
	
	public static void main(String[] args){
		
		HashMap ht = new HashMap();
		//System.out.println("hash value of string Akash is: "+ht.hash("Akash"));
		
		ht.insert("Akash", "CHaturvedi");
		
		ht.insert("Mayank", "Agrawal");
		ht.insert("Apurva", "Imaandar");
		ht.insert("Saankya", "Ramdas");
		

		//ht.display();
		
		//ht.remove("Akash");
		
		ht.remove("alskjdlka");
		
		ht.display();
		
		//System.out.println(ht.get("Mayank"));
		
	}
}
