package wl;
//��ͨ��
public abstract class jtgg {
	private String bh;//���
	private String xh;//�ͺ�
	private String fzr;//������
	public jtgg(String bh,String xh,String fzr)
	{
		this.bh=bh;this.xh=xh;this.fzr=fzr;
	}
	public abstract void ys();
	public String getBh()
	{
		return bh;
	}
	public String getXh()
	{
		return xh;
	}
	public String getFzr()
	{
		return fzr;
	}
	public void setBh(String bh)
	{
		this.bh=bh;
	}
	public void setXh(String xh)
	{
		this.xh=xh;
	}
	public void setFzr(String fzr)
	{
		this.fzr=fzr;
	}
}
