package oct20;

import java.util.ArrayList;
import java.util.HashMap;

import javax.sound.midi.Synthesizer;

public class ClientHM {

	public static void main(String[] args) {
//		HashMap<String, Integer> pmap = new HashMap<>();
//		pmap.put("India", 120);
//		pmap.put("China", 200);
//		pmap.put("Pak", 80);
//		pmap.put("US", 20);
//		pmap.put("UK", 25);
//		pmap.put("Aus", 30);
//		System.out.println(pmap);
//		System.out.println(pmap.get("US"));
//		System.out.println(pmap.get("Utopia"));
//		System.out.println(pmap.containsKey("US"));
//		System.out.println(pmap.containsKey("Utopia"));
//		System.out.println(pmap.remove("US"));
//		System.out.println(pmap);
//		System.out.println(pmap.remove("Utopia"));
//		pmap.put("India", 125);
//		System.out.println(pmap);
//		pmap.put("Utopia", 0);
//		System.out.println(pmap);
//		ArrayList<String> keys = new ArrayList<>(pmap.keySet());
//		System.out.println(keys);
//		hfc("abasdbfalksvzfghdlkf;hjmxqweoituqwoieufdjflkasdjf");
//		Integer[] one = {1, 1, 2, 2, 2, 3, 5};
//		Integer[] two = {1, 1, 1, 2, 2, 4, 5};
//		gce2(one, two);
		Integer[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
		lconsecutiveseq(arr);
	}

	public static void hfc(String word){
		HashMap<Character, Integer> fmap = new HashMap<>();
		for(char ch: word.toCharArray()){
			fmap.put(ch, fmap.containsKey(ch)? fmap.get(ch) + 1: 1);
		}
		
		ArrayList<Character> keys = new ArrayList<>(fmap.keySet());
		char mfc = keys.get(0);
		for(char key: keys){
			mfc = fmap.get(key) > fmap.get(mfc)? key: mfc;
		}
		
		System.out.println(mfc);
	}

	public static void gce1(Integer[] one, Integer[] two){
		HashMap<Integer, Integer> fmap = new HashMap<>();
		for(int val : one){
			fmap.put(val, fmap.containsKey(val)? fmap.get(val) + 1: 1);
		}
		
		for(int val: two){
			if(fmap.containsKey(val)){
				System.out.print(val + " ");
				fmap.remove(val);
			}
		}
		
		System.out.println(".");
	}
	
	public static void gce2(Integer[] one, Integer[] two){
		HashMap<Integer, Integer> fmap = new HashMap<>();
		for(int val : one){
			fmap.put(val, fmap.containsKey(val)? fmap.get(val) + 1: 1);
		}
		
		for(int val: two){
			if(fmap.containsKey(val) && fmap.get(val) > 0){
				System.out.print(val + " ");
				fmap.put(val, fmap.get(val) - 1);
			}
		}
		
		System.out.println(".");
	}
	
	public static void lconsecutiveseq(Integer[] arr){
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int val: arr){
			map.put(val, true);
		}
		
		for(int val: arr){
			if(map.containsKey(val - 1)){
				map.put(val, false);
			}
		}
		
		int msp = -1;
		int mlen = 0;
		for(int val: arr){
			if(map.get(val) == true){
				int tsp = val;
				int tlen = 1;
				while(map.containsKey(tsp + tlen)){
					tlen++;
				}
				
				if(tlen > mlen){
					mlen = tlen;
					msp = tsp;
				}
			}
		}
		
		for(int i = 0; i < mlen; i++){
			System.out.println(msp + i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
