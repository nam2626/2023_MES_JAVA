package config;

public interface DBConfig {
	//드라이버 클래스
	public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	//접속주소
	public static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
	//아이디
	public static final String DB_USER = "scott"; 
	//암호
	public static final String DB_PASSWD = "tiger"; 
	
}
