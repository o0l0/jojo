package wl;

public class Kdrw {
	private String kddh;//��ݵ���
	private double hwzl;//��������
	public Kdrw(String kddh,double hwzl)
	{
		this.kddh=kddh;
		this.hwzl=hwzl;
	}
	public String getKddh()
	{
		return kddh;
	}
	public void setKddh(String kddh)
	{
		this.kddh=kddh;
	}
	public double getHwzl()
	{
		return hwzl;
	}
	public void setHwzl(double hwzl)
	{
		this.hwzl=hwzl;
	}
	public void hwysq()
	{
		System.out.println("���������ֿ������..");
		System.out.println("����������"+this.getHwzl()+"kg");
		System.out.println("����������");
		System.out.println("������װ���");
		System.out.println("�˻�����֪ͨ");
		System.out.println("��ݵ���Ϊ��"+this.getKddh());
	}
	public void hwysz(ysff x,GPS y)
	{
		System.out.println("�˻���"+x.getFzr()+"��ʻ���Ϊ"+x.getBh()+"��"+x.getXh()+"���ͻ���");
		x.ys();
		String z=y.zb();
		System.out.println("���ﵱǰ����Ϊ:"+z);
	}
	public void hwysh(ysff x)
	{
		System.out.println("�����������.");
		System.out.println("�˻���"+x.getFzr()+"��ʻ���Ϊ"+x.getBh()+"��"+x.getXh()+"�ѹ黹");	
		x.bycf();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
