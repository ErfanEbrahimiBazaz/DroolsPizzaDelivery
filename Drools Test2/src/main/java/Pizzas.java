
import java.lang.*;

public class Pizzas {
	private String name;
	private String size;
	private String[] toppings = new String[10]; // a pizza cannot have more than 10 toppings
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String[] getToppings() {
		return toppings;
	}
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}
	
	//constructor
	public Pizzas(){
		
	}
	public Pizzas(String name, String size){
		this.name = name;
		this.size = size;
	}
	public Pizzas(String name, String size, String[] toppings){
		this.name = name;
		this.size = size;
		this.toppings = toppings;
	}
}
