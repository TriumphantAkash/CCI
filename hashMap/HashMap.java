package hashMap;

import java.util.ArrayList;

public class HashMap {
	
	//an ArrayList of ArrayLists (each individual internal arraylist is basically a LinkedList of Nodes)
	//ArrayList<ArrayList<Node>> hashTab = new ArrayList<ArrayList<Node>>();

	ArrayList<Node>[] hashTab = new ArrayList[10];
	
	
	public void insertNode(String key, String value){
		int index = 0;
	
		Node node = new Node();
		node.setKey(key);
		node.setValue(value);
		index = (int)hash(key)%10;
		
		System.out.println("index is: "+index);
			//2 cases inside this
			//1) internal list is empty for this index
			if(hashTab[index]==null){
				ArrayList<Node> tempList = new ArrayList<Node>();
				hashTab[index] = tempList;
				tempList.add(node);
			}else{//2) internal list is not empty for this index
				hashTab[index].add(node);
			}
		
	}
	
	//return null if no such key value pair is found
	//else return the corresponding Value for the key
	
	public ArrayList<Node>[] getHashTab() {
		return hashTab;
	}

	public void setHashTab(ArrayList<Node>[] hashTab) {
		this.hashTab = hashTab;
	}

	public String getNode(String key){
		int index = (int)hash(key)%10;
		ArrayList<Node> tempList= hashTab[index];
		
		for(Node node: tempList){
			if(node.getKey().equals(key)){
				return node.getValue();
			}
		}
		return null;
	}
	
	 public long hash(String str){
		 long ret = 0;
		 for(int i=0; i<str.length(); i++){
			 ret = ret + str.charAt(i);
		 }
		 return ret;
	 }
}