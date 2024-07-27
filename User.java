//import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private String password;
    private Map<String, Product> cart;

    // Constructor
    public User(String username, String password,Map<String, Product> cart) {
        this.username = username;
        this.password = password;
        this.cart = cart;
    }

    // Getter for Username
    public String getUsername() {
        return username;
    }

    // Setter for Username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for Password
    public String getPassword() {
        return password;
    }

    // Setter for Password
    public void setPassword(String password) {
        this.password = password;
    }

    // Validate Password
    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    // Add product to cart
    public void addProductToCart(Product product) {
        cart.put(product.getName(), product); //change to username
    }

    // Get cart
    public Map<String, Product> getCart() {
        return cart;
    }
    public String toString() {
        return "User Name: " + username + "cart" + cart ;
    }
}
