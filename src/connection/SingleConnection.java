package connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * Responsável por fazer a conexao com o banco de dados.
 * @author Junior
 *
 */

public class SingleConnection {

	private static String url = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
	private static String user = "postgres";
	private static String password = "docker";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar() {
		try {
			if (connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				
			}
			
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar ao banco de dados!");
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	
}
