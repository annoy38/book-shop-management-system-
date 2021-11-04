
package Part2;

import Part1.CustomerClass;
import Part1.EmployeeClass;


public class CashPaymentClass extends PaymentClass{

    public void set_word(String w){
        word = w;
    }
    @Override
    public void vatCalculation(CustomerClass c, EmployeeClass e, SupplierClass s) {
       if(word.equals("customer to admin")){
         
       cToe_money = (4*c.price)/100+c.price;
        System.out.println("Your new price with vat "+cToe_money);
       e.customer_money = cToe_money;
       }
       else{
        
        eTos_money = (4*e.supplier_money)/100+e.supplier_money;
        System.out.println("Your new price with vat "+eTos_money);
       s.money = eTos_money;
    }
    }
    
}
