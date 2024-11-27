
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Product {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public void GetAllProducts()   {
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost/sams", "root", "root");
			statement = connect.createStatement();
			rs = statement.executeQuery("Select * from product");
			
			while (rs.next()) {
				String name = rs.getString("name");
				float cost = rs.getFloat("cost");
				System.out.println("Name: " + name + ", Cost: " + cost);
			}
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
