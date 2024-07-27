import java.util.*;

public class Seller {

    public void SellerPage(Scanner scan,List<Product> prolist,Map<Category,List<Product>> catpro){
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
                        prolist.add(new Product(c, d, e, Category.GADGETS));
                        catpro.put(Category.GADGETS, prolist);
                        System.out.println("It is Successfully added");
                        break;
                    case 2:
                        System.out.println("CLOTHES");
                        prolist.add(new Product(c, d, e, Category.CLOTHES));
                        catpro.put(Category.CLOTHES, prolist);
                        break;
                    default:
                        break;
                }
    }
}
