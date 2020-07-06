package chaoshi;

public class mai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shangping x1=new shangping();
		shangping x2=new shangping();
		shangping x3=new shangping();
		shangping x4=new shangping();
		x1.setSp("棒棒糖");
		x2.setSp("口香糖");
		x3.setSp("榴莲糖");
		x4.setSp("泡泡糖");
		chaoshiming y=new chaoshiming();
		y.setCs("老王家超市");
		y.setCk(new shangping[] {x1,x2,x3,x4});
		renming z=new renming();
		z.setRm("小王");
		shangping o=z.maimai(y,"榴糖糖");
		if(o!=null)
		{
			System.out.println(z.getRm()+"在"+y.getCs()+"买到了"+o.getSp());
		}else System.out.println(z.getRm()+"在"+y.getCs()+"没买到想要的");
		
	}

}
