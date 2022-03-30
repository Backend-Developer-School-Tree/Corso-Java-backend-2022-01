import java.sql.*;

public class ConnectionHandler {
	public static final String DB_URL = "jdbc:postgresql://localhost:5432/my_db";
	
	private final String connectionUrl;
	
	private Connection connection;


	public ConnectionHandler(String dbUrl, String schema, String username, String password) throws ClassNotFoundException {
		this.connectionUrl = dbUrl 
				+ "?currentSchema="+ schema 
				+ "&user="+username
				+ "&password=" + password;
	
		// Occorre conoscere il nome del driver e il suo package
		Class.forName("org.postgresql.Driver");
	}
	
	public Connection getConnection() throws SQLException {
		if ( this.connection == null || this.connection.isClosed() ) {
			// Se la connessione non esiste o e' chiusa, la crea
			this.connection = DriverManager.getConnection(connectionUrl);
		}
		// Ritorna la connessione
		return this.connection;

	}

	public void closeConnection() throws SQLException {
		if ( this.connection != null && !this.connection.isClosed()) {
			this.connection.close();
			this.connection = null;
		}
	}
	
	public PreparedStatement getPreparedStatement(String query) throws SQLException {
		// Uso il metodo getConnection invece di accedere direttamente per
		// garantire che la connection sia attiva
		Connection conn = getConnection();
		
		PreparedStatement stmnt = conn.prepareStatement(query);
		
		return stmnt;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnectionHandler connectionHandler = new ConnectionHandler(
			ConnectionHandler.DB_URL, "public", "postgres", "postgres"
		);
		//Connection c = connectionHandler.getConnection();
		String query = "select * from tabella";
		PreparedStatement p = connectionHandler.getPreparedStatement(query);
		ResultSet rs = p.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("col"));
		}

	}

}
