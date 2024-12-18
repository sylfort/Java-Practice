import java.sql.*;

public class DbTest {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dbtest";
		final String USER = "root";
		final String PASS = "";
		final String SQL = "SELECT * FROM 学生表";
		
		try(	Connection conn = DriverManager.getConnection(URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL);) {

			while (rs.next()) {
				System.out.println(
						"学生番号：　" + rs.getString("学生番号"));
				System.out.println(
						"氏名：　" + rs.getString("氏名"));
				System.out.println(
						"性別：　" + rs.getString("性別"));
				System.out.println("");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("処理が完了しました");
		}

	}

}
