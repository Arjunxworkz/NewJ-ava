package com.xworkz.swamiji;

import java.util.Objects;

import com.xworkz.swamiji.constent.SwamijiEnum;

public class SwamijiDto {
private String name;
private String nickName;
private Integer age;
private SwamijiEnum dressCode;
private Integer noOfCases;

public SwamijiDto() {
	System.out.println("default constructor");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getNickName() {
	return nickName;
}

public void setNickName(String nickName) {
	this.nickName = nickName;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public SwamijiEnum getDressCode() {
	return dressCode;
}

public void setDressCode(SwamijiEnum dressCode) {
	this.dressCode = dressCode;
}

public Integer getNoOfCases() {
	return noOfCases;
}

public void setNoOfCases(Integer noOfCases) {
	this.noOfCases = noOfCases;
}

@Override
public String toString() {
	return "SwamijiDto [name=" + name + ", nickName=" + nickName + ", age=" + age + ", dressCode=" + dressCode
			+ ", noOfCases=" + noOfCases + "]";
}



@Override
public int hashCode() {
	return Objects.hash(nickName, noOfCases);
	//return 399;
	
}
@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof SwamijiDto) {
				SwamijiDto casted=(SwamijiDto)obj; //downcating
				if(casted.getName().equals(this.name) && casted.getNickName().equals(this.nickName)) {
					System.out.println("object are equal");
					return true;
				}
				else {
					System.out.println("Object are not equals");
				}
				
			}
		}
		else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}
}


