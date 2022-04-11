package pet;
import java.lang.String;

public class Car {
	//3 private instance variables for class (Car)
	private String name;
	private int year;
	private String type;
	private String location;
	
	//empty constructor (Car)
	public Car(){
	 }
	 
		
	//Second constructor that uses 3 instance variables
	public Car(String name, int year, String type) {		
			//Methods which these will be access later
		this.name= name;
		this.year= year;
		this.type=type;
	 }
	
	//Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables 
	public void setName(String name) {
		this.name = name;
	}


	public void setYear(int age, int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	//Method that returns a boolean
	public boolean expensive() {
		return true; 
	}
	
	//Method that returns a string
	public String money() {
		return "I have a lot of money to get an expensive car!";
	}
 
	//the main method
		public static void main(String[] args) {
			Car vehicle = new Car("BMW", 2022, "Car");
			System.out.println(vehicle.money());
			System.out.println(vehicle.getType()); //calling a method
		}
	//It is important to have a main in order to run the class for a specific page that you want to run.
	//If you don't have a main, you'll run a different class/page .
	//In classes we create objects and we call objects in the main method.
		//This is important so that other classes mains don't influence answers from the page you are working on
		
	 

}
