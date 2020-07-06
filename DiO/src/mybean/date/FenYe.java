package mybean.date;
import com.sun.rowset.*;
public class FenYe {

int dSpage=3;//每页显示属性名要小写
int zgpage=1;//总共几页
int dqpage=1;//当前第几页
CachedRowSetImpl rowset=null;
public int getdSpage() {
	return dSpage;
}
public void setdSpage(int dSpage) {
	this.dSpage = dSpage;
}
public int getZgpage() {
	return zgpage;
}
public void setZgpage(int zgpage) {
	this.zgpage = zgpage;
}
public int getDqpage() {
	return dqpage;
}
public void setDqpage(int dqpage) {
	this.dqpage = dqpage;
}
public CachedRowSetImpl getRowset() {
	return rowset;
}
public void setRowset(CachedRowSetImpl rowset) {
	this.rowset = rowset;
}


}
