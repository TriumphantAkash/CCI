import java.util.ArrayList;

import hashMap.*;
public class MainClass {
	
	
	
	public static void main(String[] args){
		
		HashMap ht = new HashMap();
		System.out.println("hash value of string Akash is: "+ht.hash("Akash"));
		
		ht.insertNode("Akash", "CHaturvedi");
		
		ht.insertNode("Mayank", "Agrawal");
		ht.insertNode("Apurva", "Imaandar");
		ht.insertNode("Saankya", "Ramdas");
		
		
		for(ArrayList<Node> list: ht.getHashTab()){
			for(Node node:list){
				System.out.print(node.getKey()+", "+node.getValue()+"  ");
			}
			System.out.print("\n");
		}
		
	}
}
