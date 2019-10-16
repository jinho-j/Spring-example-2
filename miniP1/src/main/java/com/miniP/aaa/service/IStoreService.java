package com.miniP.aaa.service;

import java.util.List;

import com.miniP.aaa.model.InputForm;
import com.miniP.aaa.model.Store;

public interface IStoreService {
	int getEmpCount();
	int getEmpCount(int deptid);
	List<Store> getcustList(InputForm imf);
	void print(List<Store> storeList);
	List<Store> getresult(List<Store> storeList);
}
