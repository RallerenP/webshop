package nija.webshop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;
    private String Password;

    @OneToMany(mappedBy = "user")
    List<ShoppingCard> shoppingCards;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.Password = password;
    }

    public Long getId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
