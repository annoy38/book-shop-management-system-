
package Part2;

import Part1.CustomerClass;

public class BuyCustomerBookClass extends SupplierClass implements IcustomerSoldBook{

   
   public int price;
    public BuyCustomerBookClass(int n) {
        super(n);
    }
    
        @Override
    public void soldBook(CustomerClass c) {
        price = c.total_sold_book_price; 
            
    }
    
    @Override
    public void bookPricecalculation() {
        if(number_of_book<10){
             total_money = number_of_book*price;
             System.out.println("Total price "+number_of_book*price+" taka");
         }
         else{
           total_money = number_of_book*price;
             System.out.println("total price "+number_of_book*price+" taka");
         }
    }






    
}
