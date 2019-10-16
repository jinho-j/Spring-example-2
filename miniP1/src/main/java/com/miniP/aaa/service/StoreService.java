package com.miniP.aaa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.miniP.aaa.dao.IStoreRepositoty;
import com.miniP.aaa.dao.GetStore;
import com.miniP.aaa.model.InputForm;
import com.miniP.aaa.model.Store;

@Service
public class StoreService implements IStoreService{
	
	@Autowired
	IStoreRepositoty storeRepository;

	@Override
	public int getEmpCount() {
		return storeRepository.getstoreCount();
	}

	@Override
	public int getEmpCount(int deptid) {
		return storeRepository.getstoreCount(deptid);
	}

	@Override
	public List<Store> getcustList(InputForm imf) {
		return storeRepository.getcustList(imf);
	}

	@Override
	public void print(List<Store> storeList) {
		storeRepository.print(storeList);
	}

	@Override
	public List<Store> getresult(List<Store> storeList) {
		// TODO Auto-generated method stub
		return storeRepository.getresult(storeList);
	}


	
	
	
	
	
	
	
	/*@Override
	public String run(String name) {
		ArrayList<Store> storelist = new ArrayList<Store>();
		//기본 입력장치로부터 데이터를 입력받기 위해 Scanner객체 생성
		Scanner scan = new Scanner(System.in);
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		GetStore getStore = context.getBean(GetStore.class);
		while(true) {
			System.out.println("**************부산 맛집 찾아드립니다*************");
			System.out.println("원하시는 지역을 선택해주세요");
			System.out.println("(I)사직동dasdasdsa");
			System.out.println("**********************************************");
			String menu = scan.next();
			switch(menu.charAt(0)) {
			case 'i':
				getStore.print(getStore.getcustList());
				break;	
			default : 
				System.out.println("메뉴를 잘 못 입력했습니다.");	
			}//end switch
		}//end while
	}*/
}
