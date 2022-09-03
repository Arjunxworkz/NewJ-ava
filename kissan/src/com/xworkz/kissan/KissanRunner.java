package com.xworkz.kissan;

import com.xworkz.constent.FoodEnum;
import com.xworkz.constent.GameEnum;
import com.xworkz.constent.KissanEnum;

public class KissanRunner {
	
	public static void main(String[] args) {
	
	KissanDto kisan=new KissanDto();
	kisan.setName("Ravi");
	kisan.setAge(24);
	kisan.setAddress("btm2");
	kisan.setChildName("vinod");
	kisan.setDress(KissanEnum.BLACK);
	kisan.setFatherAge(45);
	kisan.setDress(KissanEnum.BLACK);
	kisan.setFatherGame(GameEnum.CRICKET);
	kisan.setFatherSurName("prakash");
	kisan.setFatherNickName("vijay");
	kisan.setFatherQualification("b.a");
	kisan.setNickName("shyam");
	kisan.setFevGame(GameEnum.FOOTBALL);
	kisan.setFood(FoodEnum.FISH1);
	kisan.setFatherFood(FoodEnum.NONVEG);
	kisan.setMotherAge(45);
	kisan.setMotherDress(KissanEnum.RED);
	kisan.setMotherFood(FoodEnum.RICE);
	kisan.setMotherGame(GameEnum.LUDU);
	kisan.setMotherName("laltia");
	kisan.setMotherQualification("12th");
	kisan.setMotherSalary(5000);
	kisan.setMotherSurName("singh");
	kisan.setWifeAddress("micoLayout");
	kisan.setWifeAge(23);
	kisan.setWifeDress(KissanEnum.WHITE);
	kisan.setWifeFood(FoodEnum.SWEET);
	kisan.setWifeGame(GameEnum.BATMINTON);
	kisan.setWifeName("Nandini");
	kisan.setWifeQualification("b.a");
	kisan.setWifeSalary(10000);
	kisan.setFatherSalary(300000);
	kisan.setFatherName("ram");
	kisan.setQualification("b.tech");
	kisan.setTotalChild(2);
	kisan.setNoOfBussiness(4);
	kisan.setNoOfCases(0);
	kisan.setNoOfGOldMedol(5);
	kisan.setNoOfPlayMatches(100);
	kisan.setTotalMoeny(2000000000);
	kisan.setTotalLooseMatch(20);
	kisan.setTotalSiblings(4);
	kisan.setTotalWinMatch(80);
	kisan.setMotherNickName("sita");
	kisan.setFatherDress(KissanEnum.ORANGE);
	
	System.out.println(kisan);
	
	KissanDto kisan2=new KissanDto();
	kisan2.setName("Ravi");
	kisan2.setAge(24);
	kisan2.setAddress("btm2");
	kisan2.setChildName("vinod");
	kisan2.setDress(KissanEnum.BLACK);
	kisan2.setFatherAge(45);
	kisan2.setDress(KissanEnum.BLACK);
	kisan2.setFatherGame(GameEnum.CRICKET);
	kisan2.setFatherSurName("prakash");
	kisan2.setFatherNickName("vijay");
	kisan2.setFatherQualification("b.a");
	kisan2.setNickName("shyam");
	kisan2.setFevGame(GameEnum.FOOTBALL);
	kisan2.setFood(FoodEnum.FISH1);
	kisan2.setFatherFood(FoodEnum.NONVEG);
	kisan2.setMotherAge(45);
	kisan2.setMotherDress(KissanEnum.RED);
	kisan2.setMotherFood(FoodEnum.RICE);
	kisan2.setMotherGame(GameEnum.LUDU);
	kisan2.setMotherName("laltia");
	kisan2.setMotherQualification("12th");
	kisan2.setMotherSalary(5000);
	kisan2.setMotherSurName("singh");
	kisan2.setWifeAddress("micoLayout");
	kisan2.setWifeAge(23);
	kisan2.setWifeDress(KissanEnum.WHITE);
	kisan2.setWifeFood(FoodEnum.SWEET);
	kisan2.setWifeGame(GameEnum.BATMINTON);
	kisan2.setWifeName("Nandini");
	kisan2.setWifeQualification("b.a");
	kisan2.setWifeSalary(10000);
	kisan2.setFatherSalary(300000);
	kisan2.setFatherName("ram");
	kisan2.setQualification("b.tech");
	kisan2.setTotalChild(2);
	kisan2.setNoOfBussiness(4);
	kisan2.setNoOfCases(0);
	kisan2.setNoOfGOldMedol(5);
	kisan2.setNoOfPlayMatches(100);
	kisan2.setTotalMoeny(2000000000);
	kisan2.setTotalLooseMatch(20);
	kisan2.setTotalSiblings(4);
	kisan2.setTotalWinMatch(80);
	kisan2.setMotherNickName("sita");
	kisan2.setFatherDress(KissanEnum.ORANGE);
	
	System.out.println(kisan2);
	
	boolean res=kisan.equals(kisan2);
	System.out.println(res);
	}
}
