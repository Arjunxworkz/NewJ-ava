package com.xworkz.meesho;

import com.xworkz.constent.FoodEnum;
import com.xworkz.constent.GameEnum;
import com.xworkz.constent.MeeshoEnum;

public class MeeshoRunner {

	public static void main(String[] args) {
		MeeshoDto meesho=new MeeshoDto();
		meesho.setName("Ravi");
		meesho.setAge(24);
		meesho.setAddress("btm2");
		meesho.setChildName("vinod");
		meesho.setDress(MeeshoEnum.BLACK);
		meesho.setFatherAge(45);
		meesho.setDress(MeeshoEnum.BLACK);
		meesho.setFatherGame(GameEnum.CRICKET);
		meesho.setFatherSurName("prakash");
		meesho.setFatherNickName("vijay");
		meesho.setFatherQualification("b.a");
		meesho.setNickName("shyam");
		meesho.setFevGame(GameEnum.FOOTBALL);
		meesho.setFood(FoodEnum.FISH1);
		meesho.setFatherFood(FoodEnum.NONVEG);
		meesho.setMotherAge(45);
		meesho.setMotherDress(MeeshoEnum.RED);
		meesho.setMotherFood(FoodEnum.RICE);
		meesho.setMotherGame(GameEnum.LUDU);
		meesho.setMotherName("laltia");
		meesho.setMotherQualification("12th");
		meesho.setMotherSalary(5000);
		meesho.setMotherSurName("singh");
		meesho.setWifeAddress("micoLayout");
		meesho.setWifeAge(23);
		meesho.setWifeDress(MeeshoEnum.WHITE);
		meesho.setWifeFood(FoodEnum.SWEET);
		meesho.setWifeGame(GameEnum.BATMINTON);
		meesho.setWifeName("Nandini");
		meesho.setWifeQualification("b.a");
		meesho.setWifeSalary(10000);
		meesho.setFatherSalary(300000);
		meesho.setFatherName("ram");
		meesho.setQualification("b.tech");
		meesho.setTotalChild(2);
		meesho.setNoOfBussiness(4);
		meesho.setNoOfCases(0);
		meesho.setNoOfGOldMedol(5);
		meesho.setNoOfPlayMatches(100);
		meesho.setTotalMoeny(2000000000);
		meesho.setTotalLooseMatch(20);
		meesho.setTotalSiblings(4);
		meesho.setTotalWinMatch(80);
		meesho.setMotherNickName("sita");
		meesho.setFatherDress(MeeshoEnum.ORANGE);
		
		System.out.println(meesho);
		
   
		
		MeeshoDto meesho2=new MeeshoDto();
		meesho2.setName("Ravi");
		meesho2.setAge(24);
		meesho2.setAddress("btm2");
		meesho2.setChildName("vinod");
		meesho2.setDress(MeeshoEnum.BLACK);
		meesho2.setFatherAge(45);
		meesho2.setDress(MeeshoEnum.BLACK);
		meesho2.setFatherGame(GameEnum.CRICKET);
		meesho2.setFatherSurName("prakash");
		meesho2.setFatherNickName("vijay");
		meesho2.setFatherQualification("b.a");
		meesho2.setNickName("shyam");
		meesho2.setFevGame(GameEnum.FOOTBALL);
		meesho2.setFood(FoodEnum.FISH1);
		meesho2.setFatherFood(FoodEnum.NONVEG);
		meesho2.setMotherAge(45);
		meesho2.setMotherDress(MeeshoEnum.RED);
		meesho2.setMotherFood(FoodEnum.RICE);
		meesho2.setMotherGame(GameEnum.LUDU);
		meesho2.setMotherName("laltia");
		meesho2.setMotherQualification("12th");
		meesho2.setMotherSalary(5000);
		meesho2.setMotherSurName("singh");
		meesho2.setWifeAddress("micoLayout");
		meesho2.setWifeAge(23);
		meesho2.setWifeDress(MeeshoEnum.WHITE);
		meesho2.setWifeFood(FoodEnum.SWEET);
		meesho2.setWifeGame(GameEnum.BATMINTON);
		meesho2.setWifeName("Nandini");
		meesho2.setWifeQualification("b.a");
		meesho2.setWifeSalary(10000);
		meesho2.setFatherSalary(300000);
		meesho2.setFatherName("ram");
		meesho2.setQualification("b.tech");
		meesho2.setTotalChild(2);
		meesho2.setNoOfBussiness(4);
		meesho2.setNoOfCases(0);
		meesho2.setNoOfGOldMedol(5);
		meesho2.setNoOfPlayMatches(100);
		meesho2.setTotalMoeny(2000000000);
		meesho2.setTotalLooseMatch(20);
		meesho2.setTotalSiblings(4);
		meesho2.setTotalWinMatch(80);
		meesho2.setMotherNickName("sita");
		meesho2.setFatherDress(MeeshoEnum.ORANGE);
		
		System.out.println(meesho2);
		
		boolean res=meesho.equals(meesho2);
		System.out.println(res);

	}

}
