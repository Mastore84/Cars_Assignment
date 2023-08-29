package dat3.car.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Member extends AdminDetails{
    @Id
    String username;
    String email;
    String password;
    String firstName;
    String lastName;
    String street;
    String city;
    String zip;
    @Column(name = "approved", nullable = false)
    boolean approved;
    @Column(name = "ranking", nullable = false)
    int ranking;

    public Member(String user, String password, String email, String firstName,
                  String lastName, String street, String city, String zip, boolean approved, int ranking) {
        this.username = user;
        this.password= password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.approved = approved;
        this.ranking = ranking;

    }

    public Member(String username, String password, String email, String firstName, String lastName, String street, String city, String zip) {
        this.username = username;
        this.password= password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }
}
