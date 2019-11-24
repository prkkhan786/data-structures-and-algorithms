package RangeQueries;
public class queryclient {
	public static void main(String[] args) {
		int [] ba = {2,3,7,-1,3,11};
		RangeQuery st = new RangeQuery(ba);
		System.out.println(st.query(2, 5));
		System.out.println(st.query(3, 5));
		
	}

}
