package com.xworkz.army;


import com.xworkz.constent.ArmyEnum;
import com.xworkz.constent.FoodEnum;
import com.xworkz.constent.GameEnum;

public class ArmyRunner {

	public static void main(String[] args) {
		ArmyDto army=new ArmyDto();
		army.setName("Ravi");
		army.setAge(24);
		army.setAddress("btm2");
		army.setChildName("vinod");
		army.setDress(ArmyEnum.BLACK);
		army.setFatherAge(45);
		army.setDress(ArmyEnum.BLACK);
		army.setFatherGame(GameEnum.CRICKET);
		army.setFatherSurName("prakash");
		army.setFatherNickName("vijay");
		army.setFatherQualification("b.a");
		army.setNickName("shyam");
		army.setFevGame(GameEnum.FOOTBALL);
		army.setFood(FoodEnum.FISH1);
		army.setFatherFood(FoodEnum.NONVEG);
		army.setMotherAge(45);
		army.setMotherDress(ArmyEnum.RED);
		army.setMotherFood(FoodEnum.RICE);
		army.setMotherGame(GameEnum.LUDU);
		army.setMotherName("laltia");
		army.setMotherQualification("12th");
		army.setMotherSalary(5000);
		army.setMotherSurName("singh");
		army.setWifeAddress("micoLayout");
		army.setWifeAge(23);
		army.setWifeDress(ArmyEnum.WHITE);
		army.setWifeFood(FoodEnum.SWEET);
		army.setWifeGame(GameEnum.BATMINTON);
		army.setWifeName("Nandini");
		army.setWifeQualification("b.a");
		army.setWifeSalary(10000);
		army.setFatherSalary(300000);
		army.setFatherName("ram");
		army.setQualification("b.tech");
		army.setTotalChild(2);
		army.setNoOfBussiness(4);
		army.setNoOfCases(0);
		army.setNoOfGOldMedol(5);
		army.setNoOfPlayMatches(100);
		army.setTotalMoeny(2000000000);
		army.setTotalLooseMatch(20);
		army.setTotalSiblings(4);
		army.setTotalWinMatch(80);
		army.setMotherNickName("sita");
		army.setFatherDress(ArmyEnum.ORANGE);
		
		System.out.println(army);
		
		ArmyDto army2=new ArmyDto();
		
		army2.setName("Ravi");
		army2.setAge(24);
		army2.setAddress("btm2");
		army2.setChildName("vinod");
		army2.setDress(ArmyEnum.BLUE);
		army2.setFatherAge(45);
		army2.setDress(ArmyEnum.BLACK);
		army2.setFatherGame(GameEnum.CRICKET);
		army2.setFatherSurName("prakash");
		army2.setFatherNickName("vijay");
		army2.setFatherQualification("b.a");
		army2.setNickName("shyam");
		army2.setFevGame(GameEnum.FOOTBALL);
		army2.setFood(FoodEnum.FISH);
		army2.setFatherFood(FoodEnum.NONVEG);
		army2.setMotherAge(45);
		army2.setMotherDress(ArmyEnum.RED);
		army2.setMotherFood(FoodEnum.RICE);
		army2.setMotherGame(GameEnum.LUDU);
		army2.setMotherName("laltia");
		army2.setMotherQualification("12th");
		army2.setMotherSalary(5000);
		army2.setMotherSurName("singh");
		army2.setWifeAddress("micoLayout");
		army2.setWifeAge(23);
		army2.setWifeDress(ArmyEnum.WHITE);
		army2.setWifeFood(FoodEnum.SWEET);
		army2.setWifeGame(GameEnum.BATMINTON);
		army2.setWifeName("Nandini");
		army2.setWifeQualification("b.a");
		army2.setWifeSalary(10000);
		army2.setFatherSalary(300000);
		army2.setFatherName("ram");
		army2.setQualification("b.tech");
		army2.setTotalChild(2);
		army2.setNoOfBussiness(4);
		army2.setNoOfCases(0);
		army2.setNoOfGOldMedol(5);
		army2.setNoOfPlayMatches(100);
		army2.setTotalMoeny(2000000000);
		army2.setTotalLooseMatch(20);
		army2.setTotalSiblings(4);
		army2.setTotalWinMatch(80);
		army2.setMotherNickName("sita");
		army2.setFatherDress(ArmyEnum.ORANGE);
		
		System.out.println(army2);
		boolean rs=army.equals(army2);
		System.out.println(rs);
	}

}
