package constructor;

public class User {
	public static void main(String[] args) {

		
		
		Car kia=new Car();
		kia.color="silver";
		kia.model="Seltos";
		kia.engine=1200;
		kia.wheels=4;		
		kia.features();
		
		Car vw= new Car();
		vw.color= "white";
		vw.model="Polo";
		vw.engine=1600; 
		vw.wheels=4;
		vw.features();
		
		
		Car honda= new Car();
		honda.color="black";
		honda.engine=1800;
		honda.model="City"; 
		honda.features();
		
		
		
	}
	
	
	
	
	

}
