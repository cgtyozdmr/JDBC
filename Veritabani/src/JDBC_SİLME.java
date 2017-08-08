import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_SÝLME {
	public static Connection c;
	public static void main(String[] args) {
		baglantiAc();
		sil();
		bagKapat();
	}
	
	public static void sil(){
		String sql = "DELETE FROM ogrenci WHERE ogrNo=5";
		
		try {
			Statement st = c.createStatement();
			st.execute(sql);
			System.out.println("silme basarili");
					
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


