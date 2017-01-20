//import required packages
import java.lang.*;
import java.util.Date;

public class Orders {
	
	private int OrderNo;
	private int NumberOfPizzas;
	private String DeliveryTime;
	//private Date DeliveryDate = new Date();
	private float Discount; 
	private String OrderWeekDay;
	private boolean IsPayed;
	private boolean IsDelivered;
	
	//associations
	private Customers customer;
	private Pizzas pizza;
		
	// properties
	public int getOrderNo(){
		return this.OrderNo;
	}
	public void setOrderNo(int NumberOfPizzas){
		this.NumberOfPizzas = NumberOfPizzas;
	}
	
	public int getNumberOfPizzas() {
		return NumberOfPizzas;
	}
	public void setNumberOfPizzas(int numberOfPizzas) {
		NumberOfPizzas = numberOfPizzas;
	}
	
	public String getDeliveryTime(){
		return this.DeliveryTime;
	}
	public void setDeliveryTime(String DeliveryTime){
		this.DeliveryTime = DeliveryTime;
	}
	
	public float getDiscount() {
		return Discount;
	}
	public void setDiscount(float discount) {
		Discount = discount;
	}
	public String getOrderWeekDay() {
		return OrderWeekDay;
	}
	public void setOrderWeekDay(String orderWeekDay) {
		OrderWeekDay = orderWeekDay;
	}
	
	public boolean getIsPayed(){
		return this.IsPayed;
	}
	public void setIsPayed(boolean isPayed){
		this.IsPayed = isPayed;
	}
	
	public boolean getIsDelivered(){
		return this.IsDelivered;
	}
	public void setIsDelivered(boolean isDelivered){
		this.IsDelivered = isDelivered;
	}
	
	//constructors
	public Orders(){
		
	}
	public Orders(int orderNo, int numberOfPizzas, String deliveryTime,float discount,String orderWeekDay,boolean isPayed,boolean isDelivered){
		this.setOrderNo(orderNo);
		this.setNumberOfPizzas(numberOfPizzas);
		this.setDeliveryTime(deliveryTime);
		this.setDiscount(discount);
		this.setOrderWeekDay(orderWeekDay);
		this.setIsPayed(isPayed);
		this.setIsDelivered(isDelivered);
	}
	public Orders(Customers customer, Pizzas pizza){
		this.customer = customer;
		this.pizza = pizza;
	}
	
	//end of constructors
	public Customers getCustomer() {
		return customer;
	}
	//public void setCustomer(Customers customer) {
	//	this.customer = customer;
	//}
	public Pizzas getPizza(){
		return pizza;
	}
	public void setPizza(Pizzas pizza){
		this.pizza = pizza;
	}
	
	//methods
	public void TestRule1(){
		this.IsPayed=true;
	}
}
