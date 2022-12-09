package com.anno.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOSupport extends JdbcDaoSupport implements CustomerDAO {
	@Autowired
	public CustomerDAOSupport(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}

	@Override
	public int addCustomer(Customer cust) {
		int rows = 0;
		String query = "insert into customer values(?, ?)";
		rows = getJdbcTemplate().update(query, cust.getCustId(), cust.getCustName());
		return rows;
	}

	@Override
	public int deleteCustomer(int id) {
		int rows = 0;
		String query = "delete from customer where custId = " + id;
		rows = getJdbcTemplate().update(query);
		return rows;
	}

	@Override
	public int updateCustomer(int id, String new_name) {
		int rows = 0;
		String query = "update customer set custName = '" + new_name + "' where custId = " + id;
		rows = getJdbcTemplate().update(query);
		return rows;
	}

	@Override
	public List<Customer> displayTable() {
		String query = "select * from customer";
		return getJdbcTemplate().query(query, new ResultSetExtractor<List<Customer>>() {
			List<Customer> list;

			@Override
			public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
				list = new ArrayList<Customer>();
				while (rs.next()) {
					Customer c = new Customer();
					c.setCustId(rs.getInt(1));
					c.setCustName(rs.getString(2));
					list.add(c);
				}

				return list;
			}

		});
	}
}
