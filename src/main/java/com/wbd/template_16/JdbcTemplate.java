package com.wbd.template_16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * ģ�巽��
 * @author jwh
 *
 */
public abstract class JdbcTemplate {

	//���ɱ䣬
	private DataSource dataSource;
	
	//���ɱ䣬
	private Connection connection;
	
	//�ɱ�
	protected PreparedStatement ps;
	
	//�ɱ�
	protected  ResultSet resultSet;
	
	//�÷�������Ϊfinal��ʾ���಻�ܼ̳У� �������޸ĸ÷�����˳��
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
	    
	    //ֻ������Ǳ仯�ģ�����������ȥʵ��
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
