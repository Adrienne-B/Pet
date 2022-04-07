package pet;


//Create a Pet Class with the following instance variables: 
class Pet {
	private String name;
	private int age;
	private String location;
	private String type;

//Create two constructors: 1 empty and 
//1 that has all attributes from the above variables	
	
//1 empty constructor	
	public Pet() { //empty constructor
	
	}
	
//Second constructor that has attributes	
	public Pet(String name, int age, String location, String type) {
		
		//Methods which these will be access later
	this.name= name;
	this.age= age;
	this.location=location;
	this.type=type;
	}
	
	String getName() {
		return name;
	}
	
	
	//method which will cnange previous method answers
	int getAge() {
		return age;
	}
	
	String getType() {
		return type;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void setAge(int age) {
		this.age=age;
	}
	
	void setLocation(String location) {
		this.location=location;
	}
	
	
	public static void main(String[] args) {
		Pet tony = new Pet("Tony", 3, "Miami", "Bird");
		System.out.println(tony.getName());
		System.out.println(tony.getType()); //calling a method
	}
		
	 

}
