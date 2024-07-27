public class Cart {
    public void addtocart(Product selected , User user){
        user.addProductToCart(selected);
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    Product product;
    public String toString(){
        return null;
    }
}
