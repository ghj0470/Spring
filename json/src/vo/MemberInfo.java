package vo;

public class MemberInfo {
	private Integer mino;
	private String miid;
	private String mipwd;
	private Integer dino;
	private String miemail;
	private String mietc;
	private String credat;
	private String cretim;
	private Integer creusr;
	private String moddat;
	private String modtim;
	private Integer modusr;
	private Integer lvl;
    private String miname;
    
	public MemberInfo() {
		
	}

	public MemberInfo(Integer mino, String miid, String mipwd, Integer dino, String miemail, String mietc,
			String credat, String cretim, Integer creusr, String moddat, String modtim, Integer modusr, Integer lvl,
			String miname) {
		super();
		
		this.mino = mino;
		this.miid = miid;
		this.mipwd = mipwd;
		this.dino = dino;
		this.miemail = miemail;
		this.mietc = mietc;
		this.credat = credat;
		this.cretim = cretim;
		this.creusr = creusr;
		this.moddat = moddat;
		this.modtim = modtim;
		this.modusr = modusr;
		this.lvl = lvl;
		this.miname = miname;
	}

	@Override
	public String toString() {
		return "MemberInfo [mino=" + mino + ", miid=" + miid + ", mipwd=" + mipwd + ", dino=" + dino + ", miemail="
				+ miemail + ", mietc=" + mietc + ", credat=" + credat + ", cretim=" + cretim + ", creusr=" + creusr
				+ ", moddat=" + moddat + ", modtim=" + modtim + ", modusr=" + modusr + ", lvl=" + lvl + ", miname="
				+ miname + "]";
	}

	public Integer getMino() {
		return mino;
	}

	public void setMino(Integer mino) {
		this.mino = mino;
	}

	public String getMiid() {
		return miid;
	}

	public void setMiid(String miid) {
		this.miid = miid;
	}

	public String getMipwd() {
		return mipwd;
	}

	public void setMipwd(String mipwd) {
		this.mipwd = mipwd;
	}

	public Integer getDino() {
		return dino;
	}

	public void setDino(Integer dino) {
		this.dino = dino;
	}

	public String getMiemail() {
		return miemail;
	}

	public void setMiemail(String miemail) {
		this.miemail = miemail;
	}

	public String getMietc() {
		return mietc;
	}

	public void setMietc(String mietc) {
		this.mietc = mietc;
	}

	public String getCredat() {
		return credat;
	}

	public void setCredat(String credat) {
		this.credat = credat;
	}

	public String getCretim() {
		return cretim;
	}

	public void setCretim(String cretim) {
		this.cretim = cretim;
	}

	public Integer getCreusr() {
		return creusr;
	}

	public void setCreusr(Integer creusr) {
		this.creusr = creusr;
	}

	public String getModdat() {
		return moddat;
	}

	public void setModdat(String moddat) {
		this.moddat = moddat;
	}

	public String getModtim() {
		return modtim;
	}

	public void setModtim(String modtim) {
		this.modtim = modtim;
	}

	public Integer getModusr() {
		return modusr;
	}

	public void setModusr(Integer modusr) {
		this.modusr = modusr;
	}

	public Integer getLvl() {
		return lvl;
	}

	public void setLvl(Integer lvl) {
		this.lvl = lvl;
	}

	public String getMiname() {
		return miname;
	}

	public void setMiname(String miname) {
		this.miname = miname;
	}
}
