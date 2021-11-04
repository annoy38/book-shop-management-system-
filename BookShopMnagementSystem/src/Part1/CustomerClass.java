
package Part1;


public abstract class CustomerClass {
    
    protected String book_name;
    public int price;
    protected int total_book;
    protected String complaint;
    public int total_sold_book_price=100;
    CustomerClass(String name, int p,int total_b){
        book_name = name;
        price = p;
        total_book = total_b;
    }
    protected void set_complaint(String c){
        complaint = c;
    }
    protected void check_customer(){
        System.out.println("You are our new customer");
        System.out.println("You get one pen with your buying book");
    }
    protected void check_customer(boolean s){
        System.out.println("You are our Old Customer");
        System.out.println("You get one comic book with your buying book");
    }
    protected abstract void calculate_discount();
    protected abstract void calculate_price();
    
    
}
