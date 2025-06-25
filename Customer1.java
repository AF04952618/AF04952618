public class Customer1
{       //variables
        int Customer_Id;
        string Customer_name;
        //method
        void getCustomer()
        {
        system.out.println(Customer_Id+"\n"+Customer_name);
        }
        public static void main(String args[])
        {
         Customer1 c =new Customer1();
         c.CustomerId=12345;
         c.Customer_name="Latha";
         c.getCustomer();
        }
}