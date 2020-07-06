package sjk;

public class share {
	public	int id;
	public String name;
	public String love;
	@Override
	public String toString() {
		return "share [id=" + id + ", name=" + name + ", love=" + love + "]";
	}
	public share() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLove() {
		return love;
	}
	public void setLove(String love) {
		this.love = love;
	}
}
