package oct25;
public class heapclient {

	public static void main(String[] args) {
	heapp h = new heapp(true);
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(500);
		h.add(50);
		h.add(600);
		while(h.size()>0){
			System.out.println(h.remove());
		}
	}
}
