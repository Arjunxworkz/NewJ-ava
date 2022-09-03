package com.xworkz.apollo;

import com.xworkz.apollo.constent.ApolloEnum;
import com.xworkz.apollo.constent.FoodEnum;
import com.xworkz.apollo.constent.GameEnum;

public class ApolloRunner {

	public static void main(String[] args) {
		ApolloDto apollo=new ApolloDto();
		apollo.setName("Ravi");
		apollo.setAge(24);
		apollo.setAddress("btm");
		apollo.setChildName("vinod");
		apollo.setDress(ApolloEnum.BLUE);
		apollo.setFatherAge(45);
		apollo.setDress(ApolloEnum.BLACK);
		apollo.setFatherGame(GameEnum.CRICKET);
		apollo.setFatherSurName("prakash");
		apollo.setFatherNickName("vijay");
		apollo.setFatherQualification("b.a");
		apollo.setNickName("shyam");
		apollo.setFevGame(GameEnum.FOOTBALL);
		apollo.setFood(FoodEnum.FISH);
		apollo.setFatherFood(FoodEnum.NONVEG);
		apollo.setMotherAge(45);
		apollo.setMotherDress(ApolloEnum.RED);
		apollo.setMotherFood(FoodEnum.RICE);
		apollo.setMotherGame(GameEnum.LUDU);
		apollo.setMotherName("laltia");
		apollo.setMotherQualification("12th");
		apollo.setMotherSalary(5000);
		apollo.setMotherSurName("singh");
		apollo.setWifeAddress("micoLayout");
		apollo.setWifeAge(23);
		apollo.setWifeDress(ApolloEnum.WHITE);
		apollo.setWifeFood(FoodEnum.SWEET);
		apollo.setWifeGame(GameEnum.BATMINTON);
		apollo.setWifeName("Nandini");
		apollo.setWifeQualification("b.a");
		apollo.setWifeSalary(10000);
		apollo.setFatherSalary(300000);
		apollo.setFatherName("ram");
		apollo.setQualification("b.tech");
		apollo.setTotalChild(2);
		apollo.setNoOfBussiness(4);
		apollo.setNoOfCases(0);
		apollo.setNoOfGOldMedol(5);
		apollo.setNoOfPlayMatches(100);
		apollo.setTotalMoeny(2000000000);
		apollo.setTotalLooseMatch(20);
		apollo.setTotalSiblings(4);
		apollo.setTotalWinMatch(80);
		apollo.setMotherNickName("sita");
		apollo.setFatherDress(ApolloEnum.ORANGE);
		
		System.out.println(apollo);
		
		ApolloDto apollo2=new ApolloDto();
		apollo2.setName("Ravi");
		apollo2.setAge(24);
		apollo2.setAddress("btm2");
		apollo2.setChildName("vinod");
		apollo2.setDress(ApolloEnum.BLUE);
		apollo2.setFatherAge(45);
		apollo2.setDress(ApolloEnum.BLACK);
		apollo2.setFatherGame(GameEnum.CRICKET);
		apollo2.setFatherSurName("prakash");
		apollo2.setFatherNickName("vijay");
		apollo2.setFatherQualification("b.a");
		apollo2.setNickName("shyam");
		apollo2.setFevGame(GameEnum.FOOTBALL);
		apollo2.setFood(FoodEnum.FISH);
		apollo2.setFatherFood(FoodEnum.NONVEG);
		apollo2.setMotherAge(45);
		apollo2.setMotherDress(ApolloEnum.RED);
		apollo2.setMotherFood(FoodEnum.RICE);
		apollo.setMotherGame(GameEnum.LUDU);
		apollo2.setMotherName("laltia");
		apollo2.setMotherQualification("12th");
		apollo2.setMotherSalary(5000);
		apollo2.setMotherSurName("singh");
		apollo2.setWifeAddress("micoLayout");
		apollo2.setWifeAge(23);
		apollo2.setWifeDress(ApolloEnum.WHITE);
		apollo2.setWifeFood(FoodEnum.SWEET);
		apollo2.setWifeGame(GameEnum.BATMINTON);
		apollo2.setWifeName("Nandini");
		apollo2.setWifeQualification("b.a");
		apollo2.setWifeSalary(10000);
		apollo2.setFatherSalary(300000);
		apollo2.setFatherName("ram");
		apollo2.setQualification("b.tech");
		apollo2.setTotalChild(2);
		apollo2.setNoOfBussiness(4);
		apollo2.setNoOfCases(0);
		apollo2.setNoOfGOldMedol(5);
		apollo2.setNoOfPlayMatches(100);
		apollo2.setTotalMoeny(2000000000);
		apollo2.setTotalLooseMatch(20);
		apollo2.setTotalSiblings(4);
		apollo2.setTotalWinMatch(80);
		apollo2.setMotherNickName("sita");
		apollo2.setFatherDress(ApolloEnum.ORANGE);
		
		System.out.println(apollo2);
		boolean res=apollo.equals(apollo2);
		System.out.println(res);
		
	}

}
