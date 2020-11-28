
package gradleproject1.Main.domain;
public class Customer {
    private final int  ID = 1;
    private final boolean isNew = true;
    private final float total = 1000f;
   
    public void displayCustomerInfo () {
        System.out.println("Id - "+ID);
        System.out.println("is product new - "+isNew);
        System.out.println("total purchases are - "+total);
    }

}
