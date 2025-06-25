public class Customer1
{       //variables
        int Customer_Id;
        String Customer_name;
        //method
        void getCustomer()
        {
        System.out.println(Customer_Id+"\n"+Customer_name);
        }
        public static void main(String args[])
        {
         Customer1 c =new Customer1();
         c.Customer_Id=12345;
         c.Customer_name="Latha";
         c.getCustomer();
        }
}
