package chaoshi;

public class chaoshiming 
{
	private String cs;
	private shangping[] ck; 
	public String getCs()
	{
		return cs;
	}
	public void setCs(String cs)
	{
		this.cs=cs;
	}
	public shangping[] getCk()
	{
		return ck;
	}
	public void setCk(shangping[] ck)
	{
		this.ck=ck;
	}
	shangping mai(String sp1)
	{
		for(int i=0;i<ck.length;i++)
		{
			if(ck[i].getSp() == sp1)
				return ck[i];
		}	 return null;
	}
}
