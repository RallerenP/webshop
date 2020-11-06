package nija.webshop.model;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;
    private String itemDescription;
    private String imageDirectory;
    private int price;

    @ManyToOne
    ShoppingCard shoppingCard;

    public Item() {
    }

    public Item(int itemId, String itemDescription, String imageDirectory, int price) {
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.imageDirectory = imageDirectory;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getImageDirectory() {
        return imageDirectory;
    }

    public void setImageDirectory(String imageDirectory) {
        this.imageDirectory = imageDirectory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
