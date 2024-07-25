public class Product {
    Product(String name,String Description,double amount,Category category){
        this.Description=Description;
        this.name=name;
        this.amount=amount; 
        this.category=category;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    Category category;
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    String Description;
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    double amount=0.0;
    public String toString() {
        return "Product Name: " + name + ", Description: " + Description + ", Amount: " + amount;
    }
}
