import java.util.HashMap;

public class StringCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = compress("aaaabbbb");
		System.out.println(str);
	}
	
	
	public static String compress(String original){
		String compressed = "";
		char ch;
		int count = 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<original.length();i++){
			ch = original.charAt(i);
			
			if(!map.containsKey(ch)){	//this is first time we are seeing this character
				map.put(ch, 1);
			}else {
				count = map.get(ch);
				map.put(ch, count+1);
			}
		}
		
		for(Character c: map.keySet()){
			compressed = compressed+c.toString()+map.get(c)+" ";
		}
		
		return compressed;
	}

}
