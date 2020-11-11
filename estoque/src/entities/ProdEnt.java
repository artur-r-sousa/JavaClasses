package entities;

public class ProdEnt {
	
	private String prodName;
	private double prodPrice;
	
	
	public ProdEnt(String prodName, double prodPrice) { 
		
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		
	}	
	
	public void setProdName(String prodName) {
		
		this.prodName = prodName;
		
	}
	
	public String getProdName() {
		
		return prodName;
		
	}
	
	public void setProdPrice(double prodPrice) {
		
		this.prodPrice = prodPrice;
		
	}
	
	public double getProdPrice() {
		
		return prodPrice;
		
	}
}
