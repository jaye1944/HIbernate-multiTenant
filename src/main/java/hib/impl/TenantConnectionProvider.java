package hib.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;


@SuppressWarnings("serial")
public class TenantConnectionProvider implements ConnectionProvider {
	
	private String tenantCode;
	private Connection connection;
	
	public TenantConnectionProvider(String tenantCode, Connection connection) {
		this.tenantCode = tenantCode;
		this.connection = connection;
	}

	public boolean isUnwrappableAs(Class unwrapType) {
		// TODO Auto-generated method stub
		return false;
	}

	public <T> T unwrap(Class<T> unwrapType) {
		// TODO Auto-generated method stub
		return null;
	}

	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return connection;
	}

	public void closeConnection(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		conn.close();

	}

	public boolean supportsAggressiveRelease() {
		// TODO Auto-generated method stub
		return false;
	}

}
