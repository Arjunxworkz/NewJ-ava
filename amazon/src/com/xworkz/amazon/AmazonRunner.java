package com.xworkz.amazon;

import com.xworkz.constent.AmazonEnum;
import com.xworkz.constent.FoodEnum;
import com.xworkz.constent.GameEnum;

public class AmazonRunner {

	public static void main(String[] args) {
		AmazonDto amz=new AmazonDto();
		amz.setName("Ravi");
		amz.setAge(24);
		amz.setAddress("btm");
		amz.setChildName("vinod");
		amz.setDress(AmazonEnum.BLUE);
		amz.setFatherAge(45);
		amz.setDress(AmazonEnum.BLACK);
		amz.setFatherGame(GameEnum.CRICKET);
		amz.setFatherSurName("prakash");
		amz.setFatherNickName("vijay");
		amz.setFatherQualification("b.a");
		amz.setNickName("shyam");
		amz.setFevGame(GameEnum.FOOTBALL);
		amz.setFood(FoodEnum.FISH);
		amz.setFatherFood(FoodEnum.NONVEG);
		amz.setMotherAge(45);
		amz.setMotherDress(AmazonEnum.RED);
		amz.setMotherFood(FoodEnum.RICE);
		amz.setMotherGame(GameEnum.LUDU);
		amz.setMotherName("laltia");
		amz.setMotherQualification("12th");
		amz.setMotherSalary(5000);
		amz.setMotherSurName("singh");
		amz.setWifeAddress("micoLayout");
		amz.setWifeAge(23);
		amz.setWifeDress(AmazonEnum.WHITE);
		amz.setWifeFood(FoodEnum.SWEET);
		amz.setWifeGame(GameEnum.BATMINTON);
		amz.setWifeName("Nandini");
		amz.setWifeQualification("b.a");
		amz.setWifeSalary(10000);
		amz.setFatherSalary(300000);
		amz.setFatherName("ram");
		amz.setQualification("b.tech");
		amz.setTotalChild(2);
		amz.setNoOfBussiness(4);
		amz.setNoOfCases(0);
		amz.setNoOfGOldMedol(5);
		amz.setNoOfPlayMatches(100);
		amz.setTotalMoeny(2000000000);
		amz.setTotalLooseMatch(20);
		amz.setTotalSiblings(4);
		amz.setTotalWinMatch(80);
		amz.setMotherNickName("sita");
		amz.setFatherDress(AmazonEnum.ORANGE);
		
		System.out.println(amz);
		
		AmazonDto amz2=new AmazonDto();
		amz2.setName("Raviraj");
		amz2.setAge(24);
		amz2.setAddress("btm");
		amz2.setChildName("vinu");
		amz2.setDress(AmazonEnum.BLUE);
		amz2.setFatherAge(45);
		amz2.setDress(AmazonEnum.BLACK);
		amz2.setFatherGame(GameEnum.CRICKET);
		amz2.setFatherSurName("prakash");
		amz2.setFatherNickName("vijay");
		amz2.setFatherQualification("b.a");
		amz2.setNickName("shyam");
		amz2.setFevGame(GameEnum.FOOTBALL);
		amz2.setFood(FoodEnum.FISH);
		amz2.setFatherFood(FoodEnum.NONVEG);
		amz2.setMotherAge(45);
		amz2.setMotherDress(AmazonEnum.RED);
		amz2.setMotherFood(FoodEnum.RICE);
		amz2.setMotherGame(GameEnum.LUDU);
		amz2.setMotherName("laltia");
		amz2.setMotherQualification("12th");
		amz2.setMotherSalary(5000);
		amz2.setMotherSurName("singh");
		amz2.setWifeAddress("micoLayout");
		amz2.setWifeAge(23);
		amz2.setWifeDress(AmazonEnum.WHITE);
		amz2.setWifeFood(FoodEnum.SWEET);
		amz2.setWifeGame(GameEnum.BATMINTON);
		amz2.setWifeName("Nandini");
		amz2.setWifeQualification("b.a");
		amz2.setWifeSalary(10000);
		amz2.setFatherSalary(300000);
		amz2.setFatherName("ram");
		amz2.setQualification("b.tech");
		amz2.setTotalChild(2);
		amz2.setNoOfBussiness(4);
		amz2.setNoOfCases(0);
		amz2.setNoOfGOldMedol(5);
		amz2.setNoOfPlayMatches(100);
		amz2.setTotalMoeny(2000000000);
		amz2.setTotalLooseMatch(20);
		amz2.setTotalSiblings(4);
		amz2.setTotalWinMatch(80);
		amz2.setMotherNickName("sita");
		amz2.setFatherDress(AmazonEnum.ORANGE);
		
		System.out.println(amz2);
         boolean res=amz.equals(amz2);
         System.out.println(res);
	}

}
