package com.wbd.template_16;

import java.sql.SQLException;

public class JdbcTemplate2 extends JdbcTemplate {

	@Override
	protected void crud(Object entity) throws SQLException {
		ps.setString(1, entity.toString());
		ps.setString(2, entity.toString());

	}

}
