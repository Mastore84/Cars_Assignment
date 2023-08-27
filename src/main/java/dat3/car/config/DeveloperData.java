package dat3.car.config;

import dat3.car.entity.Car;
import dat3.car.entity.Member;
import dat3.car.repositories.CarRepository;
import dat3.car.repositories.MemberRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeveloperData implements ApplicationRunner {

    CarRepository carRepository;
    MemberRepository memberRepository;

    public DeveloperData(CarRepository carRepository, MemberRepository memberRepository){
        this.carRepository = carRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 50, 5));
        cars.add(new Car("Honda", "Civic", 50, 5));
        cars.add(new Car("Ford", "F-150", 50, 5));
        cars.add(new Car("Chevrolet", "Silverado", 50, 5));
        cars.add(new Car("BMW", "3 Series", 50, 5));
        cars.add(new Car("Mercedes-Benz", "E-Class", 50, 5));
        cars.add(new Car("Audi", "A4", 50, 5));
        cars.add(new Car("Nissan", "Altima", 50, 5));
        cars.add(new Car("Hyundai", "Elantra", 50, 5));
        cars.add(new Car("Kia", "Optima", 50, 5));
        cars.add(new Car("Subaru", "Outback", 50, 5));
        cars.add(new Car("Mazda", "CX-5", 50, 5));
        cars.add(new Car("Volkswagen", "Passat", 50, 5));
        cars.add(new Car("Jeep", "Wrangler", 50, 5));
        cars.add(new Car("GMC", "Sierra", 50, 5));
        cars.add(new Car("Ram", "1500", 50, 5));
        cars.add(new Car("Lexus", "RX", 50, 5));
        cars.add(new Car("Porsche", "911", 50, 5));
        cars.add(new Car("Tesla", "Model S", 50, 5));
        cars.add(new Car("Chrysler", "300", 50, 5));
        cars.add(new Car("Ferrari", "488 GTB", 50, 5));
        cars.add(new Car("Land Rover", "Range Rover", 50, 5));
        cars.add(new Car("Jaguar", "F-PACE", 50, 5));
        cars.add(new Car("Maserati", "Ghibli", 50, 5));
        cars.add(new Car("Volvo", "XC90", 50, 5));
        cars.add(new Car("Mini", "Cooper", 50, 5));
        cars.add(new Car("Buick", "Enclave", 50, 5));
        cars.add(new Car("Acura", "TLX", 50, 5));
        cars.add(new Car("Lincoln", "Navigator", 50, 5));
        cars.add(new Car("Infiniti", "Q50", 50, 5));
        cars.add(new Car("Genesis", "G70", 50, 5));
        cars.add(new Car("Dodge", "Charger", 50, 5));
        cars.add(new Car("Alfa Romeo", "Giulia", 50, 5));
        cars.add(new Car("Nissan", "Maxima", 50, 5));
        cars.add(new Car("Lamborghini", "Huracán", 50, 5));
        cars.add(new Car("Cadillac", "XT5", 50, 5));
        cars.add(new Car("Subaru", "Forester", 50, 5));
        cars.add(new Car("Mazda", "Mazda3", 50, 5));
        cars.add(new Car("Toyota", "Rav4", 50, 5));
        cars.add(new Car("Honda", "CR-V", 50, 5));
        cars.add(new Car("Ford", "Mustang", 50, 5));
        cars.add(new Car("Chevrolet", "Corvette", 50, 5));
        cars.add(new Car("BMW", "5 Series", 50, 5));
        cars.add(new Car("Mercedes-Benz", "S-Class", 50, 5));
        cars.add(new Car("Audi", "Q7", 50, 5));
        cars.add(new Car("Nissan", "Rogue", 50, 5));
        cars.add(new Car("Hyundai", "Tucson", 50, 5));
        cars.add(new Car("Kia", "Sorento", 50, 5));
        cars.add(new Car("Subaru", "Impreza", 50, 5));
        cars.add(new Car("Mazda", "CX-9", 50, 5));
        carRepository.saveAll(cars);

        List<Member> members = new ArrayList<>();
        members.add(new Member("mastore", "1234", "email@site.dk", "Mark", "Petersen", "HomeStreet 1", "Niceville", "1234", true, 1));
        members.add(new Member("psypimp", "1234", "email23@site.dk", "Markus", "Petersson", "HomeStreet 2", "Evilville", "5678", false, 2));
        memberRepository.saveAll(members);
    }
}
