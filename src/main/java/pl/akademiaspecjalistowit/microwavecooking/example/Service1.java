package pl.akademiaspecjalistowit.microwavecooking.example;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

    private final ExampleInterface exampleInterface;

    public Service1(ExampleInterface exampleInterface) {
        this.exampleInterface = exampleInterface;
        exampleInterface.call();
    }
}
