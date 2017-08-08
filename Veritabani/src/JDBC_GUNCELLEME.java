import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBC_GUNCELLEME {
	public static Connection c;

	public static void main(String[] args) {
		
		baglantiAc();
		guncelle();
		bagKapat();
	}
	
	public static void guncelle(){
		String sql = "UPDATE ogrenci SET ogrAd='fernando',ogrSoyad='muslera' WHERE ogrNo=4";
		
		try {
			Statement st = c.createStatement();
			st.execute(sql);
			System.out.println("guncelleme basarili");
					
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


