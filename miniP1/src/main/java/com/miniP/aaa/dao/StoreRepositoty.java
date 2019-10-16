package com.miniP.aaa.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.miniP.aaa.model.InputForm;


import com.miniP.aaa.model.Store;

@Repository
public class StoreRepositoty implements IStoreRepositoty {
	
	ArrayList<Store> storeList = new ArrayList<Store>();
	ArrayList<Store> list_sorted = new ArrayList<Store>();
	@Autowired
	JdbcTemplate jdbcTemplate;

	InputForm imf = new InputForm();

	@Override
	public int getstoreCount() {
		String sql = "select count(*) from store";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	@Override
	public int getstoreCount(int deptid) {
		String sql = "select count(*) from store where seq=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, deptid);
	}

	public void jjh(ArrayList<Store> storeList)
	{
		for(int i=0;i<storeList.size();i++)
		{
			System.out.println("음식점 이름"+storeList.get(i).getStoreName());
			System.out.println("음식점 종류"+storeList.get(i).getFood_type());
			System.out.println("음식점 위치"+storeList.get(i).getLocation());
		}
	}
	  
	public List<Store> getcustList(InputForm imf) 
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+imf.getLocation());
		   String sql = "select * from store where location = ? and food_type = ?";
		   System.out.println("done");
		  
		 
		   return jdbcTemplate.query(sql, new RowMapper<Store>() {
		      @Override
		      public Store mapRow(ResultSet rs, int count) throws SQLException {
		    	  
		    	  Store store = new Store();
		    	  store.setNumber(rs.getInt("seq"));
		    	  store.setStoreName(rs.getString("storename"));
		    	  store.setFood_type(rs.getString("food_type"));
		    	  store.setLocation(rs.getString("location"));
		    	  store.setGrade_taste(rs.getDouble("grade_taste"));
		    	  store.setGrade_price(rs.getDouble("grade_price"));
		    	  store.setGrade_clean(rs.getDouble("grade_clean"));
		    	  store.setGrade_service(rs.getDouble("grade_service"));
		    	  store.setEvent(rs.getString("event"));
		          return store;
		 76
		      }
		   },imf.getLocation(),imf.getFood_type());
		  }
	
	
	@Override
	public void print(List<Store> storeList) {
		for(int i=0;i<storeList.size();i++)
		{
			System.out.println("음식점 이름"+storeList.get(i).getStoreName());
			System.out.println("음식점 종류"+storeList.get(i).getFood_type());
			System.out.println("음식점 위치"+storeList.get(i).getLocation());
		}
		
	}
	@Override
	public List<Store> getresult(List<Store> storeList) { //made by 명건이햄
		 
          Map<Store, Double> grade_sum = new HashMap<Store, Double>();
          double rating[]= {0.6,0.2,0.1,0.1};
          double sum=0;
      
          
          for(int i=0;i<storeList.size();i++)
          {
             sum += rating[0]*storeList.get(i).getGrade_taste();
             sum += rating[1]*storeList.get(i).getGrade_price();
             sum += rating[2]*storeList.get(i).getGrade_clean();
             sum += rating[3]*storeList.get(i).getGrade_service();
             
             //만든 hashmap에 키값, 값넣기
             grade_sum.put(storeList.get(i),sum);
           sum=0;
          }      
          Iterator<Store> it = SortByValue.sortByValue(grade_sum).iterator();

          int count=0;
          while(it.hasNext() ) {
             if(count >1) {
                break;
             }
             Store key = it.next();
             list_sorted.add(key);
             count++;
          }
          return list_sorted;
	}
		  
}


