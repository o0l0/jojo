package mybean.date;

import com.sun.rowset.CachedRowSetImpl;

public class FenYea {
	public int mye=3;
	public int yshu=1;
	public int dqye=1;
	CachedRowSetImpl rowset=null;
	public CachedRowSetImpl getRowset() {
		return rowset;
	}
	public void setRowset(CachedRowSetImpl rowset) {
		this.rowset = rowset;
	}
	public int getMye() {
		return mye;
	}
	public void setMye(int mye) {
		this.mye = mye;
	}
	public int getYshu() {
		return yshu;
	}
	public void setYshu(int yshu) {
		this.yshu = yshu;
	}
	public int getDqye() {
		return dqye;
	}
	public void setDqye(int dqye) {
		this.dqye = dqye;
	}
}
