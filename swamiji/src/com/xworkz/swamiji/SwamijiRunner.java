package com.xworkz.swamiji;

import com.xworkz.swamiji.constent.SwamijiEnum;

public class SwamijiRunner {

	public static void main(String[] args) {
		SwamijiDto dto=new SwamijiDto();
		dto.setName("Manaaj");
		dto.setNickName("baba");
		dto.setAge(25);
		dto.setDressCode(SwamijiEnum.BLACK);
		dto.setNoOfCases(15);
		
	System.out.println("Name :"+dto.getName()+ "  NickName : "+dto.getNickName()
	+"  Age  :"+dto.getAge()+"  NamDressCode :"+dto.getDressCode()+"  NoOfCases :"+dto.getNoOfCases());
   

	SwamijiDto dto2=new SwamijiDto();
	dto2.setName("Manoj");
	dto2.setNickName("baba");
	dto2.setAge(25);
	dto2.setDressCode(SwamijiEnum.BLACK);
	dto2.setNoOfCases(15);
	System.out.println("Name :"+dto2.getName()+ "  NickName : "+dto2.getNickName()
	+"  Age  :"+dto2.getAge()+"  NamDressCode :"+dto2.getDressCode()+"  NoOfCases :"+dto2.getNoOfCases());
     Boolean b	=dto.equals(dto2);
	  System.out.println(b);
	//System.out.println(dto.equals(dto2));
	//System.out.println(dto.hashCode());
	//System.out.println(dto2.hashCode());
	}

}
