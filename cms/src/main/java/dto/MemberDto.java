package dto;

public class MemberDto {
	//필드
	// 멤버 리스트
	private int mno;
	private String mcategory;
	private String mname;
	private String mid;
	private String mpw;
	private int clevel;
	
	
	// 생성자
	public MemberDto() { }


	public MemberDto(int mno, String mcategory, String mname, String mid, String mpw, int clevel) {
		super();
		this.mno = mno;
		this.mcategory = mcategory;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.clevel = clevel;
	}

	// 회원가입 하기 위한 생성자
	public MemberDto(String mcategory, String mname, String mid, String mpw, int clevel) {
		super();
		this.mcategory = mcategory;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.clevel = clevel;
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


	public int getClevel() {
		return clevel;
	}


	public void setClevel(int clevel) {
		this.clevel = clevel;
	}


	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mcategory=" + mcategory + ", mname=" + mname + ", mid=" + mid + ", mpw="
				+ mpw + ", clevel=" + clevel + "]";
	}

	
}
