public class Ingreadient {
	private boolean inStock;
	private String name;
	private double amountStock;
	
	public Ingreadient(boolean inStock, String name, double amountStock){
		this.inStock = false;
		this.name = name;
		this.amountStock = amountStock;
	}
	
	public void set(boolean inStock) {
		this.inStock = inStock;
	}
	public void setName(String nName) {
		this.name = nName;
	}
	public void setAmountStock(double amountStock) {
		this.amountStock = amountStock;
	}
	
	public boolean getInStock() {
		return(this.inStock);
	}
	public String getName() {
		return(this.name);
	}
	public double getAmountStock() {
		return(this.amountStock);
	}
	
	public String toString() {
		return(Boolean.toString(this.inStock) + "," + name + "," + amountStock);
	}
}
	

