
package Part2;


public abstract class SupplierClass {
   public int number_of_book;
   public float money;
   public int total_money;
   SupplierClass(int n){
       number_of_book = n;
       
   }
  public void checkSupplier(){
       System.out.println("You are our new supplier");
   }
  public void checkSupplier(boolean a){
       System.out.println("You are our Old Supplier");
   }
   public abstract void bookPricecalculation();
   public void print_employee_money(){
       System.out.println("Book Shop admin pay "+money+" taka");
   }

}
