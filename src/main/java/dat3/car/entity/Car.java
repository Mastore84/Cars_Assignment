package dat3.car.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "car_brand", length = 50, nullable = false)
    String carName;
    @Column(name = "car_model", length = 60, nullable = false)
    String model;
    @Column(name = "rental_price_day")
    double pricePrDay;
    @Column(name = "max_discount")
    int bestDiscount;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public Car(String carName, String model, double pricePrDay, int bestDiscount){
        this.carName = carName;
        this.model = model;
        this.pricePrDay = pricePrDay;
        this.bestDiscount = bestDiscount;

    }
}
