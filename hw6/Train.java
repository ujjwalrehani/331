
public class Train {
	private String city;
	private int minSpeed;
	private int maxSpeed;
	private int maxCars;
	private int currentSpeed;
	private int currentCars;
	
	
	
	public Train(String city, int minSpeed, int maxSpeed, int maxCars) {
		
		this.city = city;
		this.minSpeed = minSpeed;
		this.maxSpeed = maxSpeed;
		this.maxCars = maxCars;
		currentSpeed = 0;
		currentCars = 0;
		
		
	}
	
	
	public void print(boolean departed, String newCity) {
		String dest = newCity;
		System.out.println("PRINT");
		System.out.println("Train Status");
		System.out.println("------------");
		System.out.println("\t"+"Current Speed: "+ currentSpeed);
		System.out.println("\t"+"Minimum Speed: "+ minSpeed);
		System.out.println("\t"+"Maximum Speed: "+ maxSpeed);
		
		if (departed == false) {
			System.out.println("\t"+"Current Position:   "+"Stopped in " + city);
		}else {
			System.out.println("\t"+"Current Position:   "+"Traveling from "+city+" "+"to " + dest);
		}
		
		System.out.println("\t"+"Current Number of Boxcars: "+ currentCars);
		System.out.println("\t"+"Maximum number of Boxcars: "+ maxCars);
		
	}
	
	public void speedUp(int fastSpeed, boolean hasDeparted) {
		if (fastSpeed + currentSpeed <= maxSpeed && hasDeparted == true) {
			currentSpeed += fastSpeed;
			System.out.println("SPEEDUP "+fastSpeed);
			
		}else if (hasDeparted == true) {
			System.out.println("SPEEDUP "+fastSpeed);
			System.out.println("\t"+"ERROR: Speed can not be increased, it would exceed it's maximum speed.");
			
		}else {
			System.out.println("SPEEDUP "+fastSpeed);
			System.out.println("\t"+"ERROR: The Train has not departed yet.");
		}
		
	}
	
	public void slowDown(int slowSpeed, boolean hasDeparted) {
		if (currentSpeed - slowSpeed >= minSpeed && hasDeparted == true) {
			currentSpeed -= slowSpeed;
			System.out.println("SLOWDOWN "+slowSpeed);
			
		}else if (hasDeparted == true) {
			System.out.println("SLOWDOWN "+slowSpeed);
			
			System.out.println("\t"+"ERROR: Speed can not be decreased, it would fall below it's minimum speed.");
		}else {
			System.out.println("SLOWDOWN "+slowSpeed);
			System.out.println("\t"+"ERROR: The Train has not departed yet.");
		}
		
	
	}
}
