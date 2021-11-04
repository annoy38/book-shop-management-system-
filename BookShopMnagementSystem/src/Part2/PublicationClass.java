
package Part2;


public class PublicationClass extends SupplierClass{

    public int price;
    
    public PublicationClass(int n){
        super(n);
    }
    public void set_price(int p){
         price = p;
    }
    @Override
    public void bookPricecalculation() {
        System.out.println("You buy "+number_of_book+" book every book price "+price+" taka");
        total_money = number_of_book*price;
        System.out.println("Total price "+number_of_book*price+" taka");
    }


    
}
