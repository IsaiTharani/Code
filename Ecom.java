import java.util.*;
//import java.util.Map.Entry;

public class Ecom {
    private static Scanner scan = new Scanner(System.in);
    private static String Username =null;
    private static String Password =null;
    static Product product;
    static User loginuser;
    static Cart carto=new Cart();
    static Map<String, User> UserAccounts= new HashMap<>();
    static List<Product> prolist= new ArrayList<>();
    static Map<Category,List<Product>> catpro = new HashMap<>();
    static Map<String,Product> usercart = new HashMap<>();
    public static void main(String[] args) {
        try {
            while(true){
                System.out.println("Select\n 1 for login\n 2 for Add new account ");
                int a =(Integer) utilities.getInput(Integer.class,scan);
                switch(a){
                    case 1:
                        System.out.println("Enter the Username");
                        Username = (String) utilities.getInput(String.class, scan);
                        System.out.println("Enter the Password");
                        Password =(String) utilities.getInput(String.class, scan);
                        loginuser =UserAccounts.get(Username);
                        if(UserAccounts.containsValue(loginuser) && loginuser.validatePassword(Password)){
                            Homepage();
                        }
                        else{
                            System.out.println("Incorrect Password");
                        }
                        break;
                    case 2:
                        System.out.println("Enter the Username");
                        Username = (String) utilities.getInput(String.class, scan);
                        System.out.println("Enter the Password");
                        Password =(String) utilities.getInput(String.class, scan);
                        User Newuser = new User(Username, Password,usercart);
                        UserAccounts.put(Username,Newuser);
                        //addnewaccount();
                        break;
                    default:
                        System.out.println("Invalid choise");
                        break;
                        }
                    }
                }
        catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
    public static void Homepage(){
            boolean bool=true; 
        while(bool){
            System.out.println("Select 1.Your Cart\n 2.Dealer\n 3.Categories\n 4.Back");
            int opt =(Integer) utilities.getInput(Integer.class,scan);
            switch (opt) {
                case 1:
                    System.out.println(carto.getProduct());
                    break;
                case 2:
                    Seller dealer = new Seller();
                    dealer.SellerPage(scan,prolist,catpro);
                    break;
                case 3:
                    System.out.println("Select the Category \n 1.Gadeget \n 2.Clothes");
                    int f=(Integer) utilities.getInput(Integer.class,scan);
                    switch (f){
                        case 1:
                            System.out.println("yes");
                            System.out.println(selectProducts(catpro,Category.GADGETS));
                            break;
                        default:
                            break;
                        }
                // showtheproducts();
                    //for (Map.Entry<String, Product> entry : userCart.entrySet()) {
                    //System.out.println("Product: " + entry.getValue());
                    //show the categories
                    // show the products 
                    break;
                case 4:
                    bool=false;
                default:
                    break;
            }
            
        } 
    } 
    public static String selectProducts(Map<Category, List<Product>> catpro2,Category category) {
        System.out.println("Select the product ");
        int select =(Integer) utilities.getInput(Integer.class, scan);
        List<Product> a =catpro2.get(category);
        switch (select){
            case 0:
              System.out.print(a.get(select));
              Product selected = a.get(select);
              carto.addtocart(selected,loginuser);
              System.out.println(loginuser +" 9");
              break;
        }
        return null;
    }
            
}
// StringBuilder result = new StringBuilder();
        // for (Entry<Category, List<Product>> entry : catpro2.entrySet()) {
        //     result.append("Category: ").append(entry.getKey()).append("\n");
        //     for (Product product : entry.getValue()) {
        //         result.append("  Product: ").append(product).append("\n");
        //     }
        // }
        // return result.toString();

 //login page --> Home page 
                        
                                   /*  -->cart page -->buy
                                    -->which has categories selection page -->products show()-->addtocart()
                                    -->Seller -->PANCARD number api/GST number api-->address--> 
                                    bank details-->category selection page -->add product()
                //product object 
                two map 
                Product has product Name, Description,amount
                User has Username , Password, cart
                Map<String,User> user 
                Map<String, Product> cart
                User username ="isai"
                User password="uiop"
                User user = new User(username,password)
                user.put(username,user);
                Product product=new Product("teaspoon","uses to grap food",9.0)
                cart.put(username,product)

                // create map for cetogory holds product category<type,product>
                        //Category page  */