package com.miniP.aaa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.miniP.aaa.model.Store;

public class GetStore {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Store> getcustList() {
		   String sql = "select * from store where location = '사직동' and food_type = '한식' ";
		   return jdbcTemplate.query(sql, new RowMapper<Store>() {
		      @Override
		      public Store mapRow(ResultSet rs, int count) throws SQLException {
		    	  Store store = new Store();
		    	  store.setNumber(rs.getInt("seq"));
		    	  store.setStoreName(rs.getString("storename"));
		    	  store.setFood_type(rs.getString("food_type"));
		    	  store.setLocation(rs.getString("location"));
		    	  store.setGrade_taste(rs.getInt("grade_taste"));
		    	  store.setGrade_price(rs.getInt("grade_price"));
		    	  store.setGrade_clean(rs.getInt("grade_clean"));
		    	  store.setGrade_service(rs.getInt("grade_service"));
		    	  store.setEvent(rs.getString("event"));
		         return store;
		      }
		   });
		  }   
		   
		   public void print(List<Store> store)
		   {
		      for(int i=0;i<store.size();i++)
		      {
		    	  System.out.println("음식점이름 "+store.get(i).getStoreName());
		    	  System.out.println("위치 "+store.get(i).getLocation());
		      System.out.println("음식점 종류"+store.get(i).getFood_type());
		      System.out.println("청결도"+store.get(i).getGrade_clean());
		      }
		            
		   }

}
