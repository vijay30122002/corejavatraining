package javabeans;

public class Product {

	private int pno;
	private String pname;
	private double pcost;
	
	public Product(int pno,String pname,double pcost) {
		this.pno=pno;
		this.pname=pname;
		this.pcost=pcost;
	}
	public int getPno() {
		return pno;
	}
	
	public String getPname() {
		return pname;
	}
	
	public double getPcost() {
		return pcost;
	}
	
	
	
	
	
}
