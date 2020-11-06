package nija.webshop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ShoppingCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CardId;
    private int count;

    @ManyToOne
    User user;

    @OneToMany(mappedBy = "shoppingCard")
    List<Item> items;

    public ShoppingCard() {
    }

    public ShoppingCard(int count) {
        this.count = count;
    }

    public Long getId() {
        return CardId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
