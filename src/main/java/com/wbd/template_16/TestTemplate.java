package com.wbd.template_16;

public class TestTemplate {

	public static void main(String[] args) {
		//Ä£Äâjdbc
		String student="";
		final String SQL = "insert into student (id,studentNumber,firstName,lastName,gender,age,className,major) values (?,?,?,?,?,?,?,?)";

		JdbcTemplate  template = new JdbcTemplate2();
		
		template.operatorDB(SQL, student);
	}

}
