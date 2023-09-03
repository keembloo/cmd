package dto;

public class MemberDto {
	//필드
	private int clevel;
	private String cname;
	
	private int mno;
	private String mcategory;
	private String mname;
	private String mid;
	private String mpw;
	

	// 생성자
	public MemberDto() {}


	public MemberDto(int clevel, String cname, int mno, String mcategory, String mname, String mid, String mpw) {
		super();
		this.clevel = clevel;
		this.cname = cname;
		this.mno = mno;
		this.mcategory = mcategory;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
	}

	//회원가입생성자
	public MemberDto(int clevel, String mcategory, String mname, String mid, String mpw) {
		super();
		this.clevel = clevel;
		this.mcategory = mcategory;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
	}



	public int getclevel() {
		return clevel;
	}

	public void setclevel(int clevel) {
		this.clevel = clevel;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
	}


	public String getMcategory() {
		return mcategory;
	}


	public void setMcategory(String mcategory) {
		this.mcategory = mcategory;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMid() {
		return mid;
	}


	public void setMid(String mid) {
		this.mid = mid;
	}


	public String getMpw() {
		return mpw;
	}


	public void setMpw(String mpw) {
		this.mpw = mpw;
	}


	@Override
	public String toString() {
		return "MemberDto [clevel=" + clevel + ", cname=" + cname + ", mno=" + mno + ", mcategory=" + mcategory
				+ ", mname=" + mname + ", mid=" + mid + ", mpw=" + mpw + "]";
	}
	
	

	
}
