
package Part1;


public class EducationPurposeBookClass extends BookClass{
    
    EducationPurposeBookClass(int p){
        super(p);
    }
    
        @Override
    protected void set_all_book_price() {
         book_price = 400;
    }


}
