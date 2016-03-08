package hashMap;

import java.util.ArrayList;

public class HashMap {
	
	//an ArrayList of ArrayLists (each individual internal arraylist is basically a LinkedList of Nodes)
	ArrayList<ArrayList<Node>> hashTab = new ArrayList<ArrayList<Node>>();

	//ArrayList<Node>[] hashTable = new ArrayList[10];
	//ArrayList<Integer> list = new ArrayList<Integer>();
	
	
	
	
	public void insertNode(String key, String value){
		int index = 0;
	
		Node node = new Node();
		node.setKey(key);
		node.setValue(value);
		index = (int)hash(key)%10;
		
		System.out.println("index is: "+index);
		
		if(hashTab.size() < 10){
			//2 cases inside this
			//1) internal list is empty for this index
			if(index>=hashTab.size()){
				ArrayList<Node> tempList = new ArrayList<Node>();
				hashTab.add(0, tempList);
				tempList.add(node);
			}else{//2) internal list is not empty for this index
				hashTab.get(index).add(node);
			}
		}else {	//size of hashTab is already 10
			hashTab.get(index).add(node);
		}
	}
	
	//return null if no such key value pair is found
	//else return the corresponding Value for the key
	
	public ArrayList<ArrayList<Node>> getHashTab() {
		return hashTab;
	}

	public void setHashTab(ArrayList<ArrayList<Node>> hashTab) {
		this.hashTab = hashTab;
	}

	public String getNode(String key){
		int index = (int)hash(key)%hashTab.size();
		ArrayList<Node> tempList= hashTab.get(index);
		
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