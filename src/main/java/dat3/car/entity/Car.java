package dat3.car.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Car extends AdminDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "car_brand", length = 50, nullable = false)
    private String carName;
    @Column(name = "car_model", length = 60, nullable = false)
    private String model;
    @Column(name = "rental_price_day")
    private double pricePrDay;
    @Column(name = "max_discount")
    private int bestDiscount;

    public Car(String carName, String model, double pricePrDay, int bestDiscount){
        this.carName = carName;
        this.model = model;
        this.pricePrDay = pricePrDay;
        this.bestDiscount = bestDiscount;

    }
}
