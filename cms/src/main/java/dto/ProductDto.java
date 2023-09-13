package dto;

public class ProductDto {
	
	private String scode;
	private int scount;
	private int cno;
	private int colorno;
	private int sno;
	private int mno;
	
	
	public ProductDto() {	}


	public ProductDto(String scode, int scount, int cno, int colorno, int sno, int mno) {
		super();
		this.scode = scode;
		this.scount = scount;
		this.cno = cno;
		this.colorno = colorno;
		this.sno = sno;
		this.mno = mno;
	}


	public String getScode() {
		return scode;
	}


	public void setScode(String scode) {
		this.scode = scode;
	}


	public int getScount() {
		return scount;
	}


	public void setScount(int scount) {
		this.scount = scount;
	}


	public int getCno() {
		return cno;
	}


	public void setCno(int cno) {
		this.cno = cno;
	}


	public int getColorno() {
		return colorno;
	}


	public void setColorno(int colorno) {
		this.colorno = colorno;
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
	}


	@Override
	public String toString() {
		return "ProductDto [scode=" + scode + ", scount=" + scount + ", cno=" + cno + ", colorno=" + colorno + ", sno="
				+ sno + ", mno=" + mno + "]";
	}
	
	
}
