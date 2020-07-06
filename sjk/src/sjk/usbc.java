package sjk;

public class usbc {
	
	public int id;
	public String fz;
	public usbc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public usbc(int id, String fz) {
		super();
		this.id = id;
		this.fz = fz;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFz() {
		return fz;
	}
	public void setFz(String fz) {
		this.fz = fz;
	}
	@Override
	public String toString() {
		return "usbc [id=" + id + ", fz=" + fz + "]";
	}
}
