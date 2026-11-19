package com.dsa.nw.programs;

import java.util.HashMap;
import java.util.Map;

public class String_Frequency {
	public static void main(String[] args) {
		String s= "sleeping";
		
		//create a map<chracter, integers>
		Map<Character,Integer> map=new HashMap()
		
		//convert into characters and count the frequency
		for(char ch:s.toCharArray())
		{
			
			map.put(ch, map.getOrDefault(ch,0)+1);
			
		}
		
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		