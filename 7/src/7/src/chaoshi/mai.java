package chaoshi;

public class mai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shangping x1=new shangping();
		shangping x2=new shangping();
		shangping x3=new shangping();
		shangping x4=new shangping();
		x1.setSp("������");
		x2.setSp("������");
		x3.setSp("������");
		x4.setSp("������");
		chaoshiming y=new chaoshiming();
		y.setCs("�����ҳ���");
		y.setCk(new shangping[] {x1,x2,x3,x4});
		renming z=new renming();
		z.setRm("С��");
		shangping o=z.maimai(y,"������");
		if(o!=null)
		{
			System.out.println(z.getRm()+"��"+y.getCs()+"����"+o.getSp());
		}else System.out.println(z.getRm()+"��"+y.getCs()+"û����Ҫ��");
		
	}

}
