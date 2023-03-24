package com.nt.imp;

import java.util.ArrayList;
import java.util.List;

public class Imp_02_ListtoStringDataConversion {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("sksaifuddin.pdf");
		System.out.println(list);
		
		for(String str:list) {
			System.out.println(str);
		}
	}

}
