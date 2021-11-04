
package Part1;
import Part2.*;
public class MainClass {


    public static void main(String[] args) {
        
        YoungZoneClass young = new YoungZoneClass("java",500,1);
        KidzoneClass kid = new KidzoneClass("java",200,2);
        EducationPurposeBookClass educationalBook = new EducationPurposeBookClass(500);
        OthersBookClass otherBook = new OthersBookClass(200);
        ManagerClass manager = new ManagerClass(50000,332);
        StuffClass stuff = new StuffClass(15000,360);
        PublicationClass publication = new PublicationClass(300);
        BuyCustomerBookClass customer = new BuyCustomerBookClass(100);
        CashPaymentClass cash = new CashPaymentClass();
        CardPaymentClass card = new CardPaymentClass();
        int i=1;
        System.out.println("              Customer Part        ");
        System.out.println(" ");
        System.out.println("Which types of book you want kid or young");
        if(i == 1){
        System.out.println("Are you Old customer or new??");
        young.check_customer();
        young.calculate_discount();
        young.calculate_price();
        }
        else{
        System.out.println("Are you Old customer or new??");
        kid.check_customer(true);
        kid.calculate_discount();
        kid.calculate_price();
        }
        int j=1;
        System.out.println("press 1 if you want educational book otherwise press 2");
        if(j==1){
           System.out.println("Are you Buy zafor iqbal book?? then pass true or don't pass true");
           educationalBook.check_writer(true);
           educationalBook.set_all_book_price();
        }
        else{
            System.out.println("Are you Buy zafor iqbal book?? then pass true or don't pass true");
            otherBook.check_writer();
            otherBook.set_all_book_price();
            otherBook.check_book(kid);
        }
        System.out.println(" ");
        System.out.println("              Employee part        ");
        System.out.println(" ");
        int k=1;
        System.out.println("Are you Manager(press=1) or Stuff(press=2)");
        if(k==1){
            System.out.println("Do you have a kid then pass true or not pass true");
           manager.getBook(true);
           manager.bonus();
           manager.getPromotion();
        }
        else{
            System.out.println("Do you have a kid");
            stuff.getBook();
            stuff.bonus();
            stuff.getPromotion();
        }
        int g=1;
        System.out.println("Customer send money to admin");
        System.out.println(" Do you pay money with cash(press=1) or card(press=2)");
        if(g==1){
            cash.set_word("customer to admin");
            cash.vatCalculation(young, manager, publication);
             manager.print_customer_money();
        }
        else{
            card.set_word("customer to admin");
            card.vatCalculation(young, manager, publication);
             manager.print_customer_money();
        }
          young.set_complaint("you book is not good");
          manager.contact(young);
       // manager.set_supplier_money(20000);
        publication.set_price(200);
        customer.soldBook(kid);
        int m = 2;
        int n=2;
        System.out.println(" ");
        System.out.println("                Supplier Part        ");
        System.out.println(" ");
        System.out.println("If publication sell their book then press 1 otherwise press 2");
        if(m==1){
            publication.bookPricecalculation();
            System.out.println("Are you pay cash(press=1) or card(press=2)");
            if(n==1){
                manager.set_supplier_money(publication.total_money);
                cash.set_word("admin to supplier");
                cash.vatCalculation(young, manager, publication);
                publication.print_employee_money();
            }
            else{
                manager.set_supplier_money(publication.total_money);
                card.set_word("admin to supplier");
                card.vatCalculation(young, manager, publication);
                publication.print_employee_money();
            }
        }
        else{
            customer.bookPricecalculation();
            System.out.println("Are you pay cash(press=1) or card(press=2)");
            if(n==1){
                manager.set_supplier_money(customer.total_money);
                cash.set_word("admin to supplier");
                cash.vatCalculation(young, manager, publication);
                publication.print_employee_money();
            }
            else{
                manager.set_supplier_money(customer.total_money);
                card.set_word("admin to supplier");
                card.vatCalculation(young, manager, publication);
                publication.print_employee_money();
            }
        }
            
    }
    
}
