package isci;

import java.sql.*;

public class MaasArtir
{
	public static Connection c;

	public static void guncelle(Ýsci i){
		
		baglantiAc();
		String sql = "UPDATE isci SET maas=maas+500 WHERE tc=?";
		
		try {
			PreparedStatement ps = (PreparedStatement) c.prepareStatement(sql);
			ps.setString(1,i.getTC());
			ps.execute(sql);
			System.out.println("guncelleme basarili");
					
		} catch (SQLException e) {
			System.out.println("guncelleme basarisiz nedeni :"+e.toString());
		}
		bagKapat();
	}
	
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
	
	public static void bagKapat(){
		try {
			c.close();
			System.out.println("Baðlantý baþarýyla kapatýldý.");			
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

	

}
