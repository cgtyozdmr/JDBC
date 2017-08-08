import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class JDBC_SORGULAMA {
	public static Connection c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				baglantiAc();
				sorgula();
				bagKapat();
			}
			
			public static void sorgula(){
				String sql = "select ogrAd,ogrSoyad from ogrenci";
				
				try {
					Statement st = c.createStatement();
					ResultSet sonuc=(ResultSet) st.executeQuery(sql);
					while(sonuc.next())
					{
						System.out.println("Ogrenci Adi : "+sonuc.getString("ogrAd"));
						System.out.println("Ogrenci SoyAdi : "+sonuc.getString("ogrSoyad"));
					}
					
					System.out.println("veri çekme basarili");
							
				} catch (SQLException e) {
					System.out.println(e.toString());
				}
			}
			
			public static void baglantiAc()
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String bag = "jdbc:mysql://localhost:3306/ornek";
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
