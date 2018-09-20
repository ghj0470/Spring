package vo;

public class Ticket {

	private Integer tmnum;
	private String tmname;
	private Integer tmprice;
	private String tmstartdat;
	private String tmenddat;
	private String tmcredate;
	private String tmdesc;
	private Integer tmcnt;
	private String tmimg;

	public Ticket() {

	}


	public Integer getTmnum() {
		return tmnum;
	}

	public void setTmnum(Integer tmnum) {
		this.tmnum = tmnum;
	}

	public String getTmname() {
		return tmname;
	}

	public void setTmname(String tmname) {
		this.tmname = tmname;
	}

	public Integer getTmprice() {
		return tmprice;
	}

	public void setTmprice(Integer tmprice) {
		this.tmprice = tmprice;
	}

	public String getTmstartdat() {
		return tmstartdat;
	}

	public void setTmstartdat(String tmstartdat) {
		this.tmstartdat = tmstartdat;
	}

	public String getTmenddat() {
		return tmenddat;
	}

	public void setTmenddat(String tmenddat) {
		this.tmenddat = tmenddat;
	}

	public String getTmcredate() {
		return tmcredate;
	}

	public void setTmcredate(String tmcredate) {
		this.tmcredate = tmcredate;
	}

	public String getTmdesc() {
		return tmdesc;
	}

	public void setTmdesc(String tmdesc) {
		this.tmdesc = tmdesc;
	}

	public Integer getTmcnt() {
		return tmcnt;
	}

	public void setTmcnt(Integer tmcnt) {
		this.tmcnt = tmcnt;
	}

	public String getTmimg() {
		return tmimg;
	}

	public void setTmimg(String tmimg) {
		this.tmimg = tmimg;
	}

	@Override
	public String toString() {
		return "Ticket [tmnum=" + tmnum + ", tmname=" + tmname + ", tmprice=" + tmprice + ", tmstartdat=" + tmstartdat
				+ ", tmenddat=" + tmenddat + ", tmcredate=" + tmcredate + ", tmdesc=" + tmdesc + ", tmcnt=" + tmcnt
				+ ", tmimg=" + tmimg + "]";
	}
	public Ticket(Integer tmnum, String tmname, Integer tmprice, String tmstartdat, String tmenddat, String tmcredate,
			String tmdesc, Integer tmcnt, String tmimg) {
		super();
		this.tmnum = tmnum;
		this.tmname = tmname;
		this.tmprice = tmprice;
		this.tmstartdat = tmstartdat;
		this.tmenddat = tmenddat;
		this.tmcredate = tmcredate;
		this.tmdesc = tmdesc;
		this.tmcnt = tmcnt;
		this.tmimg = tmimg;
	}

}
