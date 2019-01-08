package com.wbd.template_16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * 模板方法
 * @author jwh
 *
 */
public abstract class JdbcTemplate {

	//不可变，
	private DataSource dataSource;
	
	//不可变，
	private Connection connection;
	
	//可变
	protected PreparedStatement ps;
	
	//可变
	protected  ResultSet resultSet;
	
	//该方法声明为final表示子类不能继承， 即不能修改该方法的顺序
	public final void operatorDB(String sql,Object object) {
		
		try {
			getStatement(sql);
			crud(object);
			releaseResources();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	 protected void getStatement(String sql) throws SQLException {
	        connection = dataSource.getConnection();
	        this.ps = connection.prepareStatement(sql);
	    }
	    
	    //只有这个是变化的，所以让子类去实现
	    protected abstract void crud(Object entity) throws SQLException;
	    
	    private void releaseResources() throws SQLException {
	        if (resultSet != null)
	            resultSet.close();
	        if (ps != null)
	            ps.close();
	        if (connection != null)
	            connection.close();
	    }
}
