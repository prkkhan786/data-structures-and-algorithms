package RangeQueries;

public class RangeQuery {
	private int[] ba;
	private int[] sa;

	public RangeQuery(int[] ba) {
		this.ba = ba;
		int h = getlog(ba.length);
		int size = ((1 << (h + 1)) - 1);
		sa = new int[size];
		build(0, 0, ba.length - 1);
	}

	public void build(int si, int ss, int se) {
		if (ss == se) {
			sa[si] = ba[ss];
			return;
		}
		int mid = (ss + se) / 2;
		build((si * 2) + 1, ss, mid);
		build((si * 2) + 2, mid + 1, se);
		sa[si] = doOperation(sa[(2 * si) + 1], sa[(2 * si) + 2]);
	}

	private int getlog(int n) {
		int log = 0;
		while ((1 << log) < n) {
			log++;
		}
		return log;
	}

	public void update(int si, int ss, int se, int idx, int nv) {
		if (ss == se) {
			ba[ss] = nv;
			sa[si] = nv;
			return;
		}
		int mid = (ss + se) / 2;
		if (idx <= mid) {
			update((2 * si) + 1, ss, mid, idx, nv);
		} else {
			update((2 * si) + 2, mid + 1, se, idx, nv);
		}
	}

	public int query(int l, int r) {
		return queryhelper(0, 0, ba.length - 1, l, r);
	}

	private int queryhelper(int si, int ss, int se, int l, int r) {
		if (se < l || ss > r) {
			return getIdentity();
		} else if (ss >= l && se <= r) {
			return sa[si];
		} else {
			int mid = (ss + se) / 2;
			int left = queryhelper((si * 2) + 1, ss, mid, l, r);
			int right = queryhelper((si * 2) + 2, mid + 1, se, l, r);
			return doOperation(left, right);
		}
	}
	private int getIdentity(){
		return 1;
	}
	private int doOperation(int left,int right){
		return left+right;
	}
}
