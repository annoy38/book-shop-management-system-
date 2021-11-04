
package Part1;


public class ManagerClass extends EmployeeClass implements IComplaint{

    ManagerClass(int s, int a){
        super(s,a);
    }
    @Override
    protected void bonus() {
        System.out.println("Your salary "+salary+" taka and your Bonus "+(15*salary)/100+" taka"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void getPromotion() {
         if(attendence>330){
            System.out.println("You got a promotion");
    } 
    }

    @Override
    public void contact(CustomerClass c) {
        System.out.println(c.complaint); //To change body of generated methods, choose Tools | Templates.
    }
    
}
