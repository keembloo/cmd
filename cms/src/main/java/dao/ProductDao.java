package dao;

import java.util.ArrayList;

import dto.ProductDto;

public class ProductDao extends Dao{
	// 싱글톤 객체
	private static ProductDao productDao = new ProductDao();
	public static ProductDao getInstence() {return productDao;}
	private ProductDao() {}
	
	
	
	
	// 제품 출력
	public ArrayList<ProductDto> pview(){
		ArrayList<ProductDto> list = new ArrayList<>();
		try {
			String sql = "select * from stock";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			//System.out.println("다오실행됨"+rs.next());
			while (rs.next()) {
				ProductDto productDto = new ProductDto(
						rs.getString("scode"), 
						rs.getInt("scount"), 
						rs.getInt("cno"), 
						rs.getInt("colorno"), 
						rs.getInt("sno"), 
						rs.getInt("mno")
						);
				System.out.println("다오"+productDto);
				list.add(productDto);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
}
