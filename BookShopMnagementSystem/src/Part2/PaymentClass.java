
package Part2;
import Part1.CustomerClass;
import Part1.EmployeeClass;

public abstract class PaymentClass {
    public float cToe_money;
    public float eTos_money;
    public String word;
    public void check_pay_method(){
        System.out.println("You can pay your money with cash ");
    }
    public void check_pay_method(boolean a){
        System.out.println("Thank you for Card payment");
    }
    abstract void vatCalculation(CustomerClass c, EmployeeClass e, SupplierClass s);
    
    
}
