package vo;

public class IngerInfo {

	private Integer innum;
	private String inname;
	private String indesc;

	public IngerInfo() {

	}

	public IngerInfo(Integer innum, String inname, String indesc) {
		super();
		this.innum = innum;
		this.inname = inname;
		this.indesc = indesc;
	}

	@Override
	public String toString() {
		return "IngerInfo [innum=" + innum + ", inname=" + inname + ", indesc=" + indesc + "]";
	}

	public Integer getInnum() {
		return innum;
	}

	public void setInnum(Integer innum) {
		this.innum = innum;
	}

	public String getInname() {
		return inname;
	}

	public void setInname(String inname) {
		this.inname = inname;
	}

	public String getIndesc() {
		return indesc;
	}

	public void setIndesc(String indesc) {
		this.indesc = indesc;
	}

}
