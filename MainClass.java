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
		
		
//		for(ArrayList<Node> list: ht.getHashTab()){
//			for(Node node:list){
//				System.out.print(node.getKey()+", "+node.getValue()+"  ");
//			}
//			System.out.print("\n");
//		}
		
		ArrayList<Node>[] thisHashTab = new ArrayList[10];
		thisHashTab = ht.getHashTab();
		
		ArrayList<Node> temp = new ArrayList();
		for(int i=0; i<thisHashTab.length;i++){
			temp=thisHashTab[i];
			if(temp != null){
				System.out.println("list at index "+i+ " is");
				for(Node node: temp){
					System.out.print(node.getKey()+", "+node.getValue()+"  ");
				}
				System.out.print("\n");
			}else {
				System.out.println("list at index "+i+ " is null");
			}
		}
		
	}
}
