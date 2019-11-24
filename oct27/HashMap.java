package oct27;
import java.util.ArrayList;
public class HashMap<K,V> 
{
	private int size; //n
	GenericLinkedlist<HMnode> [] bucket; // N
		private class HMnode
		{
			K key;
			V value;
			public HMnode(K key,V value)
			{
				this.key = key;
				this.value= value;
			}
		}
		public HashMap() 
		{
			bucket = new GenericLinkedlist[4];
			for(int i =0;i<bucket.length ;i++){
				bucket[i] = new GenericLinkedlist<>();
			}
			size=0;
		}	
		public void put(K key,V value)
		{
			int bi = hashing(key);
			int di = findwithingbucket(bi, key);
			if(di == -1){
				HMnode n = new HMnode(key, value);
				bucket[bi].addatlast(n);
				size++;
			}
			else
			{	
				HMnode ntoupdate = bucket[bi].getatindex(di);
				ntoupdate.value = value;
			}
			
			double lamda = (size* 1.0) / bucket.length;
			if(lamda>2){
				rehashing();
			}
		}
		public boolean containskey(K key){
			int bi = hashing(key);
			int di = findwithingbucket(bi, key);
			if(di == -1){
				return false;
			}
			else
			{
				return true;
			}
		}
		public V get(K key){
			int bi = hashing(key);
			int di = findwithingbucket(bi, key);
			if(di == -1)
			{
				return null;
			}
			else
			{
				HMnode ntoupdate = bucket[bi].getatindex(di);
				return ntoupdate.value;
			}
		}
		public V remove(K key){
			int bi = hashing(key);
			int di = findwithingbucket(bi, key);
			if(di == -1)
			{
				return null;
			}
			else
			{
				HMnode ntoupdate = bucket[bi].removeat(di);
				size--;
				return ntoupdate.value;
			}
		}
		
		public ArrayList<K> getkeyset(){
			ArrayList<K> keys = new ArrayList<>();
			for(int i =0;i<bucket.length;i++){
				for(int j= 0;j<bucket[i].size;j++){
					HMnode n = bucket[i].getatindex(j);
					keys.add(n.key);
				}
			}
			return keys;
		}
		public void display(){
			System.out.println("--------------------");
			for(int i =0;i<bucket.length;i++){
				System.out.println("B" + i);
				for(int j= 0;j<bucket[i].size;j++)
				{
					HMnode n = bucket[i].getatindex(j);
					System.out.println("key " + n.key +"value" + n.value + " " );
				}
			}
			System.out.println("--------------------");
		}
		public int size()
		{
			return this.size;
		}
		public boolean isEmpty(){
			return this.size == 0;
		}
		private int hashing(K key){
			int hc = key.hashCode();
			int cf = Math.abs(hc) % bucket.length;
			return cf;
		}
		private void rehashing()
		{
			GenericLinkedlist<HMnode>[] old =  bucket;
			bucket = new GenericLinkedlist[2 * old.length];
			for(int i =0;i<bucket.length ;i++){
				bucket[i] = new GenericLinkedlist<>();
			}
			size=0;
			for(int i =0;i<old.length;i++){
				for(int j= 0;j<old[i].size;j++){
					HMnode Node = old[i].getatindex(j);
					put(Node.key, Node.value);
				}
			}
		}
		private int findwithingbucket(int bi,K key){
			for(int di = 0;di<bucket[bi].size;di++){
				HMnode n = bucket[bi].getatindex(di);
				if(n.key.equals(key))
					return di;
			}
			return -1;
		}
}