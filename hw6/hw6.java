import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class hw6 {

	public static void main(String[] args) {
		String city = "Boston";
		Train trainObject = new Train(city,10,50,3);
		//Boxcar boxcarObject = new Boxcar(3);
		boolean depart = false;
		Person newperson = new Person();
		ArrayList<Person> personList = new ArrayList<Person>();
		 try{
	            Scanner input = new Scanner( new FileInputStream("train_commands.txt"));

	            while(input.hasNextLine())
	            {
	                String line = input.nextLine();
	                if(line.equals("PRINT")) {
	                	
	                	trainObject.print(depart, city);            
	                
	                }else if(line.equals("SPEEDUP")) {
	                	
	                	trainObject.speedUp(Integer.parseInt(input.nextLine()), depart);
	                	
	                }else if(line.equals("SLOWDOWN")){
	                	trainObject.slowDown(Integer.parseInt(input.nextLine()),depart);
	                	
	                }else if(line.equals("DEPART")) {
	                	System.out.println(line);
	                	String destination = input.nextLine();
	                	System.out.println(line+"  "+destination);
	                	depart = true;
	                	trainObject.print(depart, destination);
	                	
	                	
	                }else if(line.equals("ADDCAR")) { 
	                	String type = input.nextLine();
	                	int quantity = Integer.parseInt(input.nextLine());
	                	
	                	Boxcar boxcarObject = new Boxcar(quantity);
	                	System.out.println("ADDCAR "+type+" "+quantity);
	                	
	                	//boxcarObject.addCar(type,quantity);
	                
	                	
	                }else if(line.equals("REMOVECAR")) {
	                	
	                }else if(line.equals("PERSON")) {
	                	String position = input.nextLine();
	                	//Person newperson = new Person();
	                	newperson.setpid(input.nextLine());
	                	newperson.setName(input.nextLine());
	                	newperson.setAge(Integer.parseInt(input.nextLine()));
	                	
	                	//ArrayList<Person> personList = new ArrayList<Person>();
	                	//personList.add(newperson);
	                		
	                
	                	//String selectedName = personList.get(0).getName();
	                	
	                	//System.out.println(selectedName);
	                }else if(line.equals("LOAD")) {
	                	System.out.println("LOAD");
	                	personList.add(newperson);
	                	String selectedName = personList.get(0).getName();
	                	
	                	System.out.println(selectedName);
	              
	                	
	                }else if(line.equals("ARRIVE")) {
	                	System.out.println("ARRIVE");
	                	depart = false;
	                	
	                }else if(line.equals("LOAD")){	
	                	 
	                
	                	
	                }else if(line.equals("QUIT")) {
	                	System.out.println("QUITING....");
	                }
	            }
	            input.close();
	        }
		 
	        catch(FileNotFoundException e)
	        {
	            System.err.println("Could not open file");
	        }
		

	//trainObject.print();
	
	
		
	}
	
}
