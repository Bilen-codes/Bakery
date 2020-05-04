public class Bakery {

    private String name;
    private int price;
    private String expirationDate;
    private String dietRestrictions;
    private int quantity;

    public Bakery(){ }

    public Bakery(String name, int price, String expirationDate,String dietRestrictions, int quantity){
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.dietRestrictions = dietRestrictions;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDietRestrictions() {
        return dietRestrictions;
    }

    public void setDietRestrictions(String dietRestrictions) {
        this.dietRestrictions = dietRestrictions;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
