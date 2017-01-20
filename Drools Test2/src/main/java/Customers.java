
public class Customers{
	
	//erroreous code
	//an int that is constant for all instances of the class
	//public static final String Business;
    //public static final String Private;
    
	public static final int Business = 0;
	public static final int Private = 1;
	
	protected String name;
	protected String customerType;
	protected int orderCount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
		
	public int getOrderCount(){
		return this.orderCount;
	}
	public void setOrderCOunt( int orderCount){
		this.orderCount = orderCount;
	}
	
	public void setCustomerType(CustomerType customerType){
		this.customerType = customerType.toString();
	}
	
	//constructors
	public Customers(){
		
	}
	public Customers(String name, String cType){
		this.name = name;
		this.customerType = cType;
	}
	
}

