/* created by sushil kharel
student id : 30313203 
*/
package RoastDinnerShop;
import java.util.ArrayList;
import java.util.Scanner;
public class RoastDinnerShop {
	static Customer customer;	
	
	static ArrayList<String> meats=new ArrayList<String>();
	static ArrayList<String> sides=new ArrayList<String>();
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
	
	    setUpData();
	    
		welcome();
		
		boolean done=false;
		int choice=0;
		
		while(!done){
		      choice=menu();	
		      
		      switch(choice){
		         case 1: 
		        	 processSmall();break;
		         case 2: 
		        	 processMedium();break;
		         case 3: 
		        	 processLarge();break;	
		         case 4:
		         default:
		        	 done=true;
		      }
		      
		      System.out.println("\n");
		}
		
		showOrder();		
	}

	
	private static void setUpData() {
		meats.add("Beef");
		
	    meats.add("Chicken");
	    
	    meats.add("Pork");
	   
	    sides.add("Roast Potatoes");
	   
	    sides.add("Carrots");
	   
	    sides.add("Peas");
	   
	    sides.add("yorkshire pudding");
	    
	    sides.add("Gravy");
	   
	    sides.add("Broccoli");
	    
}
	private static void processSmall() {
		// TODO Auto-generated method stub
		System.out.println("Processing Small");
		Order order=new Order(1);	
		
		showMeats();								
		selectMeatChoices(1,order);//one choice
			
		showSides();			
		selectSideChoices(1,order);//one choices
		
		customer.addOrder(order);
	}

	private static void processMedium() {
		// TODO Auto-generated method stub
		System.out.println("Processing Medium");
		
		Order order=new Order(2);	
		
		showMeats();						
		selectMeatChoices(2,order);//Two choices
		
		showSides();
		selectSideChoices(2,order);//Two choices
		
		customer.addOrder(order);
	}
	
	private static void processLarge() {
		System.out.println("Processing Large");
		
		Order order=new Order(3);	
		
		showMeats();		
		selectMeatChoices(3,order);//Three choices
		
		showSides();	
		selectSideChoices(3,order);//Three choices
		
		customer.addOrder(order);
	}
	

	private static void showMeats() {
		System.out.println("What meat would you like with that?");
		System.out.println("BEEF..press 1 for Beef");
		System.out.println("CHICKEN..press 2 for Chicken");
		System.out.println("PORK..press 3 for Pork");
		for(int i=0;i<meats.size();i++){
			
		}
	}
	private static void selectMeatChoices(int totalChoices,Order order) {
		System.out.println("\n");
		for(int i=1;i<totalChoices + 1;i++){					
			System.out.print("Select Meat " + i + ":" );
			int choice=scanner.nextInt();
			order.addMeat(meats.get(choice-1));	
		}
	}	

	private static void showSides() {
		  System.out.println("press 1 for Roast Potatoes");
		  System.out.println("press 2 for Carrots");
		  System.out.println("press 3 for Peas");
		  System.out.println("press 4 for yorkshire pudding");
		  System.out.println("press 5 for Carrots");
		  System.out.println("press 6 for Broccoli");
		 
		for(int i=0;i<sides.size();i++){
			
		}
	}

	private static void selectSideChoices(int totalChoices,Order order) {
		System.out.println("\n");
		for(int i=1;i<totalChoices + 1;i++){					
			System.out.print("Select Side " + i + ":" );
			int choice=scanner.nextInt();
			order.addSide(sides.get(choice-1));	
		}
	}

	

	private static void showOrder() {
		// TODO Auto-generated method stub
		customer.printOrder();
	}

	private static int menu() {
		
		int ch=1;
		System.out.println("What size dinner would you like");
	    System.out.println();
	    
		do{			
			System.out.println("1.  Small.. "+"Press 1 to for Small size");
			System.out.println("2.  Large.. "+"Press 2 to for Large size");
			System.out.println("3.  Extra Large.. "+"Press 3 to for Extra Large size");			
			System.out.println("4.  Exit!.. "+"Press 4 to for Exit");
			
		    System.out.println("\nYour Choice: ");
		    ch=scanner.nextInt();
						
		}while(ch < 0 || ch>4);
		
		return ch;
	    
	}

	private static void welcome() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------");
		System.out.println("---- Welcome to FedUni Roast Dinners! ---");
		System.out.println("-----------------------------------------");
		System.out.println("Order Starts Here");
		System.out.println("Could I take your name please?");
		String name=scanner.nextLine();
		
		
		System.out.flush();
		System.out.println("And your phone number?");	
		String phone=scanner.nextLine();
		
		customer=new Customer(name,phone);
	}
		
}

