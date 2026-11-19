package com.dsa.nw.programs;

import java.util.HashMap;
import java.util.Map;

public class Non_Repeative_String {
	public static void main(String[] args) {
		String s= "sleeping";
		
		//create a map<chracter, integers>
		Map<Character,Integer> map=new HashMap();
		
		//convert into characters and count the frequency
		for(char ch:s.toCharArray())
		{
			
			map.put(ch, map.getOrDefault(ch,0)+1);
			
		}
		//first non repeative char
		
		for(int i=0;i<s.length();i++) 
		{
			if(map.get(s.charAt(i))==1) {
				System.out.println("index: "+i);
				return;

			}
		}
		System.out.println("none");

	}
	
	

}
