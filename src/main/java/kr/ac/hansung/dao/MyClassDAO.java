package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.MyClass;
import kr.ac.hansung.model.NewClass;

@Repository
public class MyClassDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from myclass";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	//년도와 학기를 매개변수로 받아 교과목 리스트 반환
	public List<MyClass> getMyClass(String year, String semester) {
		String sqlStatements = "select * from myclass where year=? and semester=?";
		return jdbcTemplate.query(sqlStatements, new Object[] { year, semester }, new RowMapper<MyClass>() {

			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyClass myclass = new MyClass();

				myclass.setYear(rs.getString("year"));
				myclass.setSemester(rs.getString("semester"));
				myclass.setCode(rs.getString("code"));
				myclass.setClassname(rs.getString("classname"));
				myclass.setDivide(rs.getString("divide"));
				myclass.setCredit(rs.getInt("credit"));

				return myclass;
			}

		});
	}
}
