package Labs6;

public class Products {
    int id;
    String name;
    String descr;
    int price;
    int amount;

    public Products(int id, String name, String descr, int price, int amount) {
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.price = price;
        this.amount = amount;
    }

    public Products(String name, String descr, int price, int amount) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descr='" + descr + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
