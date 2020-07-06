package mybean.date;

import com.sun.rowset.CachedRowSetImpl;

public class Fz {
	public int id;
	public String fz;
	CachedRowSetImpl rowset=null;
	public CachedRowSetImpl getRowset() {
		return rowset;
	}
	public void setRowset(CachedRowSetImpl rowset) {
		this.rowset = rowset;
	}
	public Fz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFz() {
		return fz;
	}
	public void setFz(String fz) {
		this.fz = fz;
	}
	@Override
	public String toString() {
		return "" + id + "--" + fz + "";
	}
}
