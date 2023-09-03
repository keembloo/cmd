package dao;

import dto.MemberDto;

public class MemberDao extends Dao{
	//싱글톤
	private static MemberDao memberDao = new MemberDao();
	public static MemberDao getInstence() {return memberDao;}
	private MemberDao() {}
	
	// 1. 회원가입
	public boolean signup(MemberDto memberDto) {
		try {
			String sql= "insert memberlist(mcategory, mname , mid , mpw , clevel ) values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, memberDto.getMcategory());
			ps.setString(2, memberDto.getMname());
			ps.setString(3, memberDto.getMid());
			ps.setString(4, memberDto.getMpw());
			ps.setInt(5, memberDto.getclevel());
			int row = ps.executeUpdate();
			//System.out.println("다오 row : "+row);
			if( row==1 ) return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
}
