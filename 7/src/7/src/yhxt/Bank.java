package yhxt;

public class Bank {
	static String yhmc;//��������
	private String name;//�û�����
	private int mm;//����
	private double zhye;//�˻����
	private double jye;//���׶�
	static void hy() {
		System.out.println("--------------------"+"��ӭ����"+yhmc+"--------------------");
	}

		public void yh(String name,int mm,double jye) {
		this.name=name;
		this.mm=mm;
		this.jye=jye;
		this.zhye=jye-10;
		//System.out.println(mm);
		//System.out.println(name+"�����ɹ����˻����"+zhye);
	}
	public int zhmm(int mm)
	{
		if(mm!=this.mm){System.out.print("���������������");
			return mm;}
		else return 0;
	}
	
	public void ck(double jye) {
		zhye=zhye+jye;
		System.out.println(name+"���ã����Ѵ���"+jye+"Ԫ���˻����"+zhye+"Ԫ");
	}
	
	public void qk(double jye) {
		if(zhye-jye>=0) {
			zhye=zhye-jye;
			System.out.println(name+"���ã�����ȡ��"+jye+"Ԫ���˻����"+zhye+"Ԫ");
		}else System.out.println("�Բ�������");
		
	}
	public void cx()
	{
		System.out.println(name+"���ã����˻����"+zhye+"Ԫ");
	}
	void gun()
	{
		System.out.println("---------"+"��ӭ�´�����"+yhmc+"---------");
	}

}
