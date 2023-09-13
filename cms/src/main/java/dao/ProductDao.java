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
			
			while (rs.next()) {
				ProductDto producDto = new ProductDto(
						rs.getString(1), 
						rs.getInt(2), 
						rs.getInt(3), 
						rs.getInt(4), 
						rs.getInt(5), 
						rs.getInt(6)
						);
				list.add(producDto);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
}
