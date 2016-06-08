/* created by sushil kharel
student id : 30313203 
*/
package RoastDinnerShop;
import java.util.ArrayList;
public class Customer {
		public String name;
	    public String phone;
	    
	    ArrayList orders=new ArrayList();
	    
		public Customer(String name, String phone) {	
			this.name = name;
			this.phone = phone;
		}

		public ArrayList getOrders() {
			return orders;
		}

		public void addOrder(Order order) {
			this.orders.add(order);
		}
	    
		public void printOrder(){
			 System.out.println("----------------------------------------");
			 System.out.println("Thanks "+name+" ph num : "+phone);
			 System.out.println("======================");
		
			 for(int i=0;i<orders.size();i++){
				  Order order=(Order)orders.get(i);
				  order.print();
			 }
			 	System.out.println("Your order comes to:"+"$");
	    	 	System.out.println("----------------------------------------");
				System.out.println("--------------Have a nice day!----------");
				System.out.println("----------------------------------------");
		}
	    
	}
