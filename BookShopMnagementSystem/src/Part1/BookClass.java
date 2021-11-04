
package Part1;


public abstract class BookClass implements ICheckBook{
    
    protected int book_price;
    BookClass(int p){
        book_price = p;
    }
    protected void check_writer(){
        System.out.println("You buy other writer book");
        book_price = book_price-10;
    }
    protected void check_writer(boolean s){
        System.out.println("You buy zafor iqbal sir book that's why your book price cost low");
        book_price = book_price-50;
    }
    protected abstract void set_all_book_price();
    @Override
    public void check_book(CustomerClass c){
        if(c.book_name.equals("java")){
            System.out.println("Your book available here ");
        }
    }
    
}
