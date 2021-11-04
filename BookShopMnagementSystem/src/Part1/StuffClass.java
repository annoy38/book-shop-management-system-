
package Part1;


public class StuffClass extends EmployeeClass{

    StuffClass(int s, int a){
        super(s,a);
    }
    @Override
    protected void bonus() {
        System.out.println("Your salary "+salary+" taka and your Bonus "+(8*salary)/100+" taka"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void getPromotion() {
        if(attendence>350){
            System.out.println("You got a promotion");
    }
    }
    
}
