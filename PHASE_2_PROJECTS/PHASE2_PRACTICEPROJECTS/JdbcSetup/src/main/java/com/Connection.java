package com;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import com.mysql.cj.ServerVersion;
import com.mysql.cj.Session;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.ClientInfoProvider;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.jdbc.JdbcPreparedStatement;
import com.mysql.cj.jdbc.JdbcPropertySet;
import com.mysql.cj.jdbc.JdbcStatement;
import com.mysql.cj.jdbc.result.CachedResultSetMetaData;
import com.mysql.cj.jdbc.result.ResultSetInternalMethods;

public class Connection implements JdbcConnection {

	public Connection(String property, String property2, String property3) {
		// TODO Auto-generated constructor stub
	}

	public void Connection1(String property, String property2, String property3) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Statement createStatement() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nativeSQL(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void commit() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void rollback() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReadOnly(boolean readOnly) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isReadOnly() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCatalog(String catalog) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCatalog() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTransactionIsolation(int level) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setHoldability(int holdability) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Savepoint setSavepoint(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rollback(Savepoint savepoint) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clob createClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blob createBlob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NClob createNClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(int timeout) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getClientInfo(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSchema(String schema) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abort(Executor executor) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkClosed() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cleanup(Throwable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createNewIO(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getConnectionMutex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExceptionInterceptor getExceptionInterceptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void normalClose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void transactionBegun() {
		// TODO Auto-generated method stub

	}

	@Override
	public void transactionCompleted() {
		// TODO Auto-generated method stub

	}

	@Override
	public void abortInternal() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeUser(String arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearHasTriedMaster() {
		// TODO Auto-generated method stub

	}

	@Override
	public PreparedStatement clientPrepareStatement(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement clientPrepareStatement(String arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement clientPrepareStatement(String arg0, int[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement clientPrepareStatement(String arg0, String[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement clientPrepareStatement(String arg0, int arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement clientPrepareStatement(String arg0, int arg1, int arg2, int arg3) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void decachePreparedStatement(JdbcPreparedStatement arg0) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public JdbcConnection getActiveMySQLConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getActiveStatementCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAutoIncrementIncrement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CachedResultSetMetaData getCachedMetaData(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCharacterSetMetadata() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientInfoProvider getClientInfoProviderImpl() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatabase() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHostPortPair() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getIdleFor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Statement getMetadataSafeStatement() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JdbcConnection getMultiHostParentProxy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JdbcConnection getMultiHostSafeProxy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JdbcPropertySet getPropertySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QueryInterceptor> getQueryInterceptorsInstances() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerVersion getServerVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSessionMaxRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStatementComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasSameProperties(JdbcConnection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTriedMaster() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initializeResultsMetadataFromCache(String arg0, CachedResultSetMetaData arg1,
			ResultSetInternalMethods arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void initializeSafeQueryInterceptors() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isInGlobalTx() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMasterConnection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProxySet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isReadOnly(boolean arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSameResource(JdbcConnection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isServerLocal() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lowerCaseTableNames() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ping() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void pingInternal(boolean arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void realClose(boolean arg0, boolean arg1, boolean arg2, Throwable arg3) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void recachePreparedStatement(JdbcPreparedStatement arg0) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerStatement(JdbcStatement arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resetServerState() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public PreparedStatement serverPrepareStatement(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement serverPrepareStatement(String arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement serverPrepareStatement(String arg0, int[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement serverPrepareStatement(String arg0, String[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement serverPrepareStatement(String arg0, int arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement serverPrepareStatement(String arg0, int arg1, int arg2, int arg3) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDatabase(String arg0) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFailedOver(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInGlobalTx(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setProxy(JdbcConnection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setReadOnlyInternal(boolean arg0) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSessionMaxRows(int arg0) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setStatementComment(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutdownServer() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean storesLowerCaseTableName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void throwConnectionClosedException() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void unSafeQueryInterceptors() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregisterStatement(JdbcStatement arg0) {
		// TODO Auto-generated method stub

	}

}
