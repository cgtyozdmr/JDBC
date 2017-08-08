package isci;

import java.sql.*;


//import com.mysql.jdbc.PreparedStatement;

public class Ekleme 
{
	public static Connection c;
	public static void baglantiAc()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String bag = "jdbc:mysql://localhost:3306/isci";
			String kul = "root";
			String sif = "admin";
			
			c = DriverManager.getConnection(bag, kul, sif);
			System.out.println("Baðlantý baþarýlý");			
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}
	
	public  static void bagKapat(){
		try {
			c.close();
			System.out.println("Baðlantý baþarýyla kapatýldý.");			
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
	

	
	
	public void ekle(Ýsci i){
		baglantiAc();
		String sql = "INSERT INTO isci(tc,ad,soyad,maas,sehir,cinsiyet) VALUES(?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = (PreparedStatement) c.prepareStatement(sql);
			ps.setString(1,i.getTC());
			ps.setString(2,i.getAd() );
			ps.setString(3,i.getSoyad() );
			ps.setInt   (4,i.getMaas());
			ps.setString(5,i.getSehir());
			ps.setString(6,i.getCinsiyet());
			ps.executeUpdate();
			System.out.println("Ekleme baþarýlý");			
		} catch (SQLException e) {
			System.out.println("ekleme basarisiz nedeni :"+e.toString());
		}
		bagKapat();
	}
}
