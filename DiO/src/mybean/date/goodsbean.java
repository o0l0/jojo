package mybean.date;

import com.sun.rowset.CachedRowSetImpl;

public class goodsbean {
	String good_id;
	String good_name;
	String good_made;
	Float good_price;
	String good_message;
	int good_sl;
	String good_print;
	int id;
	CachedRowSetImpl rowset=null;

	public CachedRowSetImpl getRowset() {
		return rowset;
	}

	public void setRowset(CachedRowSetImpl rowset) {
		this.rowset = rowset;
	}

	@Override
	public String toString() {
		return "goodsbean [good_id=" + good_id + ", good_name=" + good_name + ", good_made=" + good_made
				+ ", good_price=" + good_price + ", good_message=" + good_message + ", good_sl=" + good_sl
				+ ", good_print=" + good_print + ", id=" + id + "]";
	}
	
	public String getGood_id() {
		return good_id;
	}
	public void setGood_id(String good_id) {
		this.good_id = good_id;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public String getGood_made() {
		return good_made;
	}
	public void setGood_made(String good_made) {
		this.good_made = good_made;
	}
	public Float getGood_price() {
		return good_price;
	}
	public void setGood_price(Float good_price) {
		this.good_price = good_price;
	}
	public String getGood_message() {
		return good_message;
	}
	public void setGood_message(String good_message) {
		this.good_message = good_message;
	}
	public int getGood_sl() {
		return good_sl;
	}
	public void setGood_sl(int good_sl) {
		this.good_sl = good_sl;
	}
	public String getGood_print() {
		return good_print;
	}
	public void setGood_print(String good_print) {
		this.good_print = good_print;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
