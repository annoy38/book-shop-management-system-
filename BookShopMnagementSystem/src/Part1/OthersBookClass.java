
package Part1;


public class OthersBookClass extends BookClass {
    
    OthersBookClass(int p){
        super(p);
    }
    

    @Override
    protected void set_all_book_price() {
         book_price = 800;
    }


}
