package com.dsa.nw.programs;

import java.util.HashMap;
import java.util.Map;

public class Majority_Of_Element {
	public static void main(String[] args) {
		int arr[]= {2,2,1,1,2,2,2};
		
		//create map
		Map<Integer,Integer> map=new HashMap();
		
		for(int num:arr){
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		//majority elments
		for(int key:map.keySet()) {
			if(map.get(key)>arr.length/2) {
				System.out.println("majority: "+key);
			}
		}
		
	}

}
