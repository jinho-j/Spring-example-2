package com.miniP.aaa.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.miniP.aaa.model.Store;

public class SortByValue {
   public static List<Store> sortByValue(final Map<Store, Double> grade_sum){

        List<Store> list = new ArrayList<Store>();

        list.addAll(grade_sum.keySet());

        Collections.sort(list,new Comparator<Object>(){

         @SuppressWarnings("unchecked")

         public int compare(Object o1,Object o2){

                Object v1 = grade_sum.get(o1);

                Object v2 = grade_sum.get(o2);

                return ((Comparable<Object>) v2).compareTo(v1);

            }

        });

        return list;
    }

}