package javabeans;

import java.io.Serializable;

public class Employee implements Serializable{

	private int eno;
	private String ename;
	private double esal;
	
	
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	public void setEno(int eno) {
		this.eno=eno;
		
	}
	public void setEsal(double esal) {
		this.esal=esal;
	}
	
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public double getEsal() {
		return esal;
	}
	
}


