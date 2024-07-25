import java.util.*;

public class Ecom {
    private static Scanner scan = new Scanner(System.in);
    private static User user;
    static Product product;
    static Map<String, User> userac= new HashMap<>();
    static Map<Category,Product> catpro = new HashMap<>();
    public static void main(String[] args) {
        try {
            while(true){
                System.out.println("Select\n 1 for login\n 2 for Add new account ");
                String Username =null;
                String Password =null;
                int a =(Integer) utilities.getInput(Integer.class,scan);
                switch(a){
                    case 1:
                        System.out.println("Enter the Username");
                        Username = (String) utilities.getInput(String.class, scan);
                        System.out.println("Enter the Password");
                        Password =(String) utilities.getInput(String.class, scan);
                        if(user.validatePassword(Password)){
                            Homepage();
                        }
                        break;
                    case 2:
                        System.out.println("Enter the Username");
                        Username = (String) utilities.getInput(String.class, scan);
                        System.out.println("Enter the Password");
                        Password =(String) utilities.getInput(String.class, scan);
                        user = new User(Username, Password);
                        userac.put(Username,user );
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
        System.out.println("Select 1.Your Cart\n 2.Dealer\n 3.Categories");
        int opt =(Integer) utilities.getInput(Integer.class,scan);
        switch (opt) {
            case 1:
                Cart carto=new Cart();
                carto.getProduct();
                break;
            case 2:
                System.out.println("Product Name");
                String c =(String) utilities.getInput(String.class, scan);
                System.out.println("Product Description");
                String d =(String) utilities.getInput(String.class, scan);
                System.out.println("Amount");
                double e=(Double) utilities.getInput(Double.class,scan);
                System.out.println("Select the Category \n 1.Gadeget \n 2.Clothes");
                int b=(Integer) utilities.getInput(Integer.class,scan);
                switch (b) {
                    case 1:
                        System.out.println("Gadgets");
                        product=new Product(c,d,e,Category.GADGETS);
                        catpro.put(Category.GADGETS, product);
                        break;
                    case 2:
                        System.out.println("CLOTHES");
                        product=new Product(c, d, e, Category.CLOTHES);
                        catpro.put(Category.CLOTHES, product);
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("Select the Category \n 1.Gadeget \n 2.Clothes");
                int f=(Integer) utilities.getInput(Integer.class,scan);
                switch (f){
                    case 1:
                        System.out.println("yes");
                        System.out.println(showProducts(catpro));
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
            default:
                break;
        }
    } 
    public static String showProducts(Map<Category,Product> a){
        for (Map.Entry<Category, Product> entry : a.entrySet()) {
            return "Key: " + entry.getKey() + ", Value: " + entry.getValue();
        }
        return "hi";
    }         
}

 //login page --> Home page 
                        
                                   /*  -->cart page -->buy
                                    -->which has categories selection page -->products show()-->addtocart()
                                    -->dealor -->licence -->category selection page -->add product()
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