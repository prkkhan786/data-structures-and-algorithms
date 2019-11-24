package oct25;
import java.util.ArrayList;
public class heapp {
	private ArrayList<Integer> data = new ArrayList<>();
	private boolean ismin; // agr min waali chlani hai tu min chla wrna max chla  true max -> ismin false-> max
	public heapp(boolean ismin)
	{
		this.ismin = ismin; //
	}
	public void add(int val) 
	{
		data.add(val);
		upheapify(data.size() - 1);
	}
	private void upheapify(int ci) 
	{
		if (ci == 0) 
		{
			return;
		}
		int pi = (ci - 1) / 2;
		if (ishigh(ci, pi) > 0) 
		{
			swap(ci, pi);
			upheapify(pi);
		}
	}
	private void swap(int ci, int pi) {
		int ith = data.get(ci);
		int jth = data.get(pi);
		data.set(ci, jth);
		data.set(pi, ith);
	}
	private int ishigh(int ci, int pi) {
		if (ismin == true) {  //min heap
			return (data.get(ci) - data.get(pi)) * -1;
		} else {
			return data.get(ci) - data.get(pi);
		}
	}
	public int remove() 
	{
		swap(0, data.size() - 1);
		int val = data.remove(data.size() - 1);
		downheapify(0);
		return val;
	}
	private void downheapify(int pi) 
	{
		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;
		int maxi = pi;
		if (li < data.size() && ishigh(li, maxi) > 0) {
			maxi = li;
		}
		if (ri < data.size() && ishigh(ri, maxi) > 0) {
			maxi = ri;
		}
		if (maxi != pi) {
			swap(maxi, pi);
			downheapify(maxi);
		}
	}
	public int peek() 
	{
		return data.get(0);
	}
	public int size()
	{
		return data.size();
	}
}