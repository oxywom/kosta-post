import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnect {
	// DB Connection
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // driver 설정
			conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb","root","1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn!=null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertUser(String id, String name) {
		Connection conn = getConnection();
		String sql = String.format("insert into user (id,name) values ('%s','%s')", id,name) ;
		Statement stmt = null;
		try {
			stmt=conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"개 데이터 삽입");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void main(String[] args) {
		insertUser("song", "송길동");
	}
}