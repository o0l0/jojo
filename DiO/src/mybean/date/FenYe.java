package mybean.date;
import com.sun.rowset.*;
public class FenYe {

int dSpage=3;//ÿҳ��ʾ������ҪСд
int zgpage=1;//�ܹ���ҳ
int dqpage=1;//��ǰ�ڼ�ҳ
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
