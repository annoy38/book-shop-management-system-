
package Part1;


public class YoungZoneClass extends CustomerClass {
    
    
    YoungZoneClass(String name, int p, int total_b){
        super(name,p,total_b);
    }

    @Override
    protected void calculate_discount() {
        System.out.println("You get 5% discount ");
        System.out.println("Your final Price "+(price*total_book-(5*price*total_book)/100));
    }

    @Override
    protected void calculate_price() {
        System.out.println("Your total Price "+price*total_book);
    }
}
