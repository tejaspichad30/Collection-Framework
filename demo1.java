package Practice_day_25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class demo1 {

	public static void main(String[] args) {
		
		// Creating a arryalist for employees
		ArrayList<String> emp = new ArrayList<>();
		
		// Adding employee values 
		emp.add("Tejas");
		emp.add("Mansi");
		emp.add("Purva");
		emp.add("Gaurav");
		emp.add("Rajesh");
		emp.add("Raju");
		emp.add("Kiran");
		emp.add("Kaju");
		emp.add("Sarvesh");
		emp.add("Shraddha");
		
		//Displaying the values
		System.out.println("Employee List: \n" + emp);
		
		//Performing iteration via for each loop
		System.out.println("\nEmployee List-1: \n");
		for(String data : emp)
		{
			System.out.println(data);
		}
	
		// Iteration using iterate method
		System.out.println("\nEmployee List - 2");
		Iterator<String> itr = emp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// Sorting data using collection class
		Collections.sort(emp);
		System.out.println("\nEmployee List-3: " + emp);
		
		
		System.out.println("\nEmployee List-4: " + Collections.min(emp));
		
		
		// Methods
		// To get the value with index number
		System.out.println("\nEmployee List-5 : " + emp.get(1));
		
		// To get frist value in the list
		System.out.println("\nEmployee List-6 : " + emp.getFirst());
		
		
		// to get last value in list
		System.out.println("\nEmployee List-7 : " + emp.getLast());
		
		// To see the count of the list
		System.out.println("\nEmployee List-8 : " + emp.size());
		
		// To chekc is the list is empty or not 
		System.out.println("\nEmployee List-9 : " +emp.isEmpty()) ;
		
		// To check specific value is in the list or not
		System.out.println("\nEmployee List-10 : " + emp.contains("Tejas"));
		
		// To replace the value 
		emp.set(4, "Luffy");
		System.out.println("\nEmployee List-11 : " + emp);
		
		
		// to cler the list
		emp.clear();
		System.out.println(emp);
		
		
		// To chekc is the list is empty or not 
		System.out.println("\nEmployee List  : " +emp.isEmpty()) ;
		
	}

}
