/* created by sushil kharel
student id : 30313203 
*/
package RoastDinnerShop;
import java.util.ArrayList;
public class Order {
	public int size;
    public ArrayList<String> meats;
    public ArrayList<String> sides;
    
    private String[] sizes={"Small","Medium","Large"};
    
	public Order(int size) {	
		this.size = size-1; //size starts at 0
		
		sides=new ArrayList<String>();
		meats=new ArrayList<String>();		
	}
    
    public void addMeat(String meat){
    	meats.add(meat);
    }
    
    public void addSide(String side){
    	meats.add(side);
    }
    
    	public void print(){
    		
  	     System.out.println("Your order summary is:"+ sizes[size]+" dinner with");
  	    	  for(int i=0;i<meats.size();i++){
			  String meat=meats.get(i);
			  System.out.print(meat + ",");
		 }
    	 System.out.println();
    	 	  for(int i=0;i<sides.size();i++){
			  String side=sides.get(i);
			  System.out.print("and"+side + ",");
		 }
    	 	
    }
}

