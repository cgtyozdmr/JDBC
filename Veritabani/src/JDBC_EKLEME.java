import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC_EKLEME {
	public static Connection c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baglantiAc();
		ekle();
		bagKapat();
	}
	
	public static void ekle(){
		String sql = "INSERT INTO ogrenci(ogrNo,ogrAd,ogrSoyad) VALUES(6,'mehmet','kiraz')";
		
		try {
			Statement sta = c.createStatement();
			sta.execute(sql);
			System.out.println("Ekleme baþarýlý");			
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
