package oct27;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Hmap.Hmap;
//import oct27.HashMap.HMnode;
import sep9.brackets;

public class HashMapOwn<K, V> {
	GenericLinkedlist<HMnode>[] buckets; // N number of array
	int size;

	public class HMnode {
		K key;
		V value;

		public HMnode(K key, V value) {
			this.key = key;
			this.value = value;
		}

	}

	public HashMapOwn() {
		buckets = new GenericLinkedlist[4];
		for (int bi = 0; bi < buckets.length; bi++) {
			buckets[bi] = new GenericLinkedlist<>();
		}
	}

	public void put(K key, V value) {
		int bi = hashing(key);
		int di = findWithinBucket(bi, key);
		if (di == -1) {
			HMnode n = new HMnode(key, value);
			buckets[bi].addatlast(n);
			size++;
		} else {
			HMnode nodetoupdate = buckets[bi].getatindex(di);
			nodetoupdate.value = value;
		}
		double lamda = (this.size * 1.0) / buckets.length; // n/N

		if (lamda > 2) {
			reshashing(key);
		}

	}

	public ArrayList<K> getkeyset() {
		ArrayList<K> keys = new ArrayList<>();
		for (int i = 0; i < buckets.length; i++) {
			
			for (HMnode n : buckets[i]) {
				keys.add(n.key);
			}
		}
		return keys;
	}

	public void display() {
		System.out.println("--------------------------------");
		for (int bi = 0; bi < buckets.length; bi++) {
			System.out.print("bucket " + "->" + bi);
			for (HMnode node : buckets[bi]) {
				System.out.println("key " + node.key + "value" + node.value + " ");
			}
		}
	}

	public V get(K key) {
		int bi = hashing(key);
		int di = findWithinBucket(bi, key);
		if (di == -1) {
			return null;
		} else {
			return buckets[bi].getatindex(di).value;
		}

	}

	public V remove(K key) {
		int bi = hashing(key);
		int di = findWithinBucket(bi, key);
		if (di == -1) {
			return null;
		} else {
			return buckets[bi].removeat(di).value;
		}

	}

	public int size() {
		return 0;

	}

	public boolean containsKey(K key) {
		int bi = hashing(key);
		int di = findWithinBucket(bi, key);
		if (di == -1) {
			return false;
		} else {
			return true;
		}

	}

	public boolean isEmpty() {
		return false;

	}

	private int hashing(K key) {
		return size;
	}

	private void reshashing(K key) {
		GenericLinkedlist<HMnode>[] oldbuckets = buckets;
		buckets = new GenericLinkedlist[2 * oldbuckets.length];
		for (int bi = 0; bi < buckets.length; bi++) {
			buckets[bi] = new GenericLinkedlist<>();
		}
		size = 0;
		for (int bi = 0; bi < buckets.length; bi++) {
			for (HMnode n : oldbuckets[bi]) {
				put(key, n.value);
			}
		}
	}

	private int findWithinBucket(int i, K key) {
		for (int bi = 0; bi < buckets[i].size; bi++) {
			HMnode n = buckets[i].getatindex(bi);
			if (n.key.equals(key))
				return bi;
		}
		return -1;
	}

	private int HashFunction(K key) {
		int hc = key.hashCode();
		int cf = Math.abs(hc) % buckets.length;
		return cf;
	}

}
