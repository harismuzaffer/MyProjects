package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int countCountry(){
		String s= "select count(*) from countries";
		return template.queryForObject(s, Integer.class);
	}
	
	public boolean insertCountry(Country c){
		String s= "insert into countries values(?,?,?)";
		int count= template.update(s, c.getCountryId(), c.getCountryName(), c.getRegionId());
		if(count>0)
			return true;
		else
			return false;
	}
	
	public boolean deleteCountry(String CountryId){
		String s= "delete from countries where Country_Id=?";
		int count= template.update(s, CountryId);
		if(count>0)
			return true;
		else
			return false;
	}
	
	public Country getCountry(String CountryId){
		String s= "select * from countries where country_id=?";
		Country c= template.queryForObject(s, new CountryMapper(), CountryId);
		return c;
	}
	
	public List<Country> getCountries(){
		
		return template.query("select * from countries", new CountryMapper());
	}
	
	
	private static class CountryMapper implements RowMapper<Country>{

		@Override
		public Country mapRow(ResultSet res, int rownum) throws SQLException {
			Country c= new Country();
			c.setCountryId(res.getString("country_id"));
			c.setCountryName(res.getString("country_name"));
			c.setRegionId(res.getInt("region_id"));
			return c;
		}
		
	}
	
	
}
