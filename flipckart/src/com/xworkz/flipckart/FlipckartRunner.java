package com.xworkz.flipckart;

import com.xworkz.constent.FlipckartEnum;
import com.xworkz.constent.FoodEnum;
import com.xworkz.constent.GameEnum;

public class FlipckartRunner {

	public static void main(String[] args) {
		FlipckartDto flip=new FlipckartDto();
		flip.setName("Ravi");
		flip.setAge(24);
		flip.setAddress("btm2");
		flip.setChildName("vinod");
		flip.setDress(FlipckartEnum.BLACK);
		flip.setFatherAge(45);
		flip.setDress(FlipckartEnum.BLACK);
		flip.setFatherGame(GameEnum.CRICKET);
		flip.setFatherSurName("prakash");
		flip.setFatherNickName("vijay");
		flip.setFatherQualification("b.a");
		flip.setNickName("shyam");
		flip.setFevGame(GameEnum.FOOTBALL);
		flip.setFood(FoodEnum.FISH1);
		flip.setFatherFood(FoodEnum.NONVEG);
		flip.setMotherAge(45);
		flip.setMotherDress(FlipckartEnum.RED);
		flip.setMotherFood(FoodEnum.RICE);
		flip.setMotherGame(GameEnum.LUDU);
		flip.setMotherName("laltia");
		flip.setMotherQualification("12th");
		flip.setMotherSalary(5000);
		flip.setMotherSurName("singh");
		flip.setWifeAddress("micoLayout");
		flip.setWifeAge(23);
		flip.setWifeDress(FlipckartEnum.WHITE);
		flip.setWifeFood(FoodEnum.SWEET);
		flip.setWifeGame(GameEnum.BATMINTON);
		flip.setWifeName("Nandini");
		flip.setWifeQualification("b.a");
		flip.setWifeSalary(10000);
		flip.setFatherSalary(300000);
		flip.setFatherName("ram");
		flip.setQualification("b.tech");
		flip.setTotalChild(2);
		flip.setNoOfBussiness(4);
		flip.setNoOfCases(0);
		flip.setNoOfGOldMedol(5);
		flip.setNoOfPlayMatches(100);
		flip.setTotalMoeny(2000000000);
		flip.setTotalLooseMatch(20);
		flip.setTotalSiblings(4);
		flip.setTotalWinMatch(80);
		flip.setMotherNickName("sita");
		flip.setFatherDress(FlipckartEnum.ORANGE);
		
		System.out.println(flip);
		
		
		FlipckartDto flip2=new FlipckartDto();
		flip2.setName("Ravi");
		flip2.setAge(24);
		flip2.setAddress("btm2");
		flip2.setChildName("vinod");
		flip2.setDress(FlipckartEnum.BLACK);
		flip2.setFatherAge(45);
		flip2.setDress(FlipckartEnum.BLACK);
		flip2.setFatherGame(GameEnum.CRICKET);
		flip2.setFatherSurName("prakash");
		flip2.setFatherNickName("vijay");
		flip2.setFatherQualification("b.a");
		flip2.setNickName("shyam");
		flip2.setFevGame(GameEnum.FOOTBALL);
		flip2.setFood(FoodEnum.FISH1);
		flip2.setFatherFood(FoodEnum.NONVEG);
		flip2.setMotherAge(45);
		flip2.setMotherDress(FlipckartEnum.RED);
		flip2.setMotherFood(FoodEnum.RICE);
		flip2.setMotherGame(GameEnum.LUDU);
		flip2.setMotherName("laltia");
		flip2.setMotherQualification("12th");
		flip2.setMotherSalary(5000);
		flip2.setMotherSurName("singh");
		flip2.setWifeAddress("micoLayout");
		flip2.setWifeAge(23);
		flip2.setWifeDress(FlipckartEnum.WHITE);
		flip2.setWifeFood(FoodEnum.SWEET);
		flip2.setWifeGame(GameEnum.BATMINTON);
		flip2.setWifeName("Nandini");
		flip2.setWifeQualification("b.a");
		flip2.setWifeSalary(10000);
		flip2.setFatherSalary(300000);
		flip2.setFatherName("ram");
		flip2.setQualification("b.tech");
		flip2.setTotalChild(2);
		flip2.setNoOfBussiness(4);
		flip2.setNoOfCases(0);
		flip2.setNoOfGOldMedol(5);
		flip2.setNoOfPlayMatches(100);
		flip2.setTotalMoeny(2000000000);
		flip2.setTotalLooseMatch(20);
		flip2.setTotalSiblings(4);
		flip2.setTotalWinMatch(80);
		flip2.setMotherNickName("sita");
		flip2.setFatherDress(FlipckartEnum.ORANGE);
		
		System.out.println(flip2);
		boolean re=flip.equals(flip2);
		System.out.println(re);

	}

}
