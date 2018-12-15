package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.NewClass;

@Repository
public class NewClassDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from newclass";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	// newclass 테이블의 레코드(2019년 1학기에 신청할 예상 교과목리스트) 반환
	public List<NewClass> getNewClass() {
		String sqlStatements = "select * from newclass";
		return jdbcTemplate.query(sqlStatements, new RowMapper<NewClass>() {

			@Override
			public NewClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				NewClass newclass = new NewClass();

				newclass.setId(rs.getInt("class_id"));
				newclass.setClassname(rs.getString("classname"));
			
				return newclass;
			}

		});
	}
	
	// newclass 테이블에 입력한 2019년 1학기에 신청할 예상 교과목 저장
	public boolean insert(NewClass newclass) {

		String classname = newclass.getClassname();
		

		String sqlStatement = "insert into newclass (classname) values (?)";

		return (jdbcTemplate.update(sqlStatement, new Object[] { classname}) == 1);
	}


}
