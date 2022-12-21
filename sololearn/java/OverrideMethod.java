/*
Anonymous Classes

You are a store manager.
You are offering a 10% discount on all items in the store. 
Today, you have had a total of two customers. To the first, you honored the 10% discount on all purchased items. 
The second customer, however, purchased a lot of items and you want to give him a bigger discount -- 20% -- to show your appreciation.
Complete the program by creating two Purchase objects - 1 for the regular customer, and 1 for a special one, and override the totalAmount() method for the special customer on the fly to set the proper 20% discount.
*/

public class Main
{
	public static void main(String[] args) {
        
       Purchase customer = new Purchase();
       Purchase specialCustomer = new Purchase(){
           //your code goes here
           @Override public int totalAmount(int price) {
               return price - (price*20)/100;
            }
        };
        
        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
	}
}

class Purchase {
    int price;
    
    public int totalAmount(int price) {
        return price - (price*10)/100;
    }
}
