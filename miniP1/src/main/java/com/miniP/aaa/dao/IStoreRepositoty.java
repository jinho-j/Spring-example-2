package com.miniP.aaa.dao;

import java.util.List;

import com.miniP.aaa.model.InputForm;
import com.miniP.aaa.model.Store;

public interface IStoreRepositoty {
	int getstoreCount();
	int getstoreCount(int deptid);
	List<Store> getcustList(InputForm imf);
	void print(List<Store> storeList);
	List<Store> getresult(List<Store> storeList);

}
