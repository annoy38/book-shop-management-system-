
package Part1;


public abstract class EmployeeClass {
    protected int salary;
    protected int attendence;
    public float customer_money;
    public int supplier_money;
    EmployeeClass(int s, int a){
        salary = s;
        attendence = a;
    }
    protected void set_supplier_money(int m){
        supplier_money = m;
    }
    protected  void getBook(){
        System.out.println("You have don't children that's why you don't get free book");
    }
    protected void getBook(boolean a){
        System.out.println("This books for your child ");
    }
    protected abstract void bonus();
    protected abstract void getPromotion();
    protected void print_customer_money(){
        System.out.println("Customer pay "+customer_money+" taka");
    }
    
}
