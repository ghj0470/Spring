package vo;

public class DepartInfo {

	
	
	private Integer dinum;
	private String diname;
	private String dicode;
	private String didesc;

	public DepartInfo() {

	}

	public DepartInfo(Integer dinum, String diname, String dicode, String didesc) {
		super();
		this.dinum = dinum;
		this.diname = diname;
		this.dicode = dicode;
		this.didesc = didesc;
	}

	public Integer getDinum() {
		return dinum;
	}

	public void setDinum(Integer dinum) {
		this.dinum = dinum;
	}

	public String getDiname() {
		return diname;
	}

	public void setDiname(String diname) {
		this.diname = diname;
	}

	public String getDicode() {
		return dicode;
	}

	public void setDicode(String dicode) {
		this.dicode = dicode;
	}

	public String getDidesc() {
		return didesc;
	}

	public void setDidesc(String didesc) {
		this.didesc = didesc;
	}

	@Override
	public String toString() {
		return "DepartInfo [dinum=" + dinum + ", diname=" + diname + ", dicode=" + dicode + ", didesc=" + didesc + "]";
	}
}
