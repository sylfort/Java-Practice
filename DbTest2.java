import java.sql.*;

public class DbTest2 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:";
		final String PORT = "3306";
		final String DB = "/dbtest";
		final String USER = "root";
		final String PASS = "";
		final String SQL = "INSERT INTO 科目表(科目番号, 科目名) VALUES ('K60','調理自習'), ('K61','調理実習2')";
		
		final String FINAL_URL = URL + PORT + DB;
		
		try(
				Connection cnct = DriverManager.getConnection(FINAL_URL, USER, PASS);
				Statement stmt = cnct.createStatement();) {
			
			stmt.execute(SQL);
			System.out.println("処理をしました");
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
