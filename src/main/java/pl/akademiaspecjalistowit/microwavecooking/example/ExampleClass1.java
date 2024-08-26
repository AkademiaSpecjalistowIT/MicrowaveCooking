package pl.akademiaspecjalistowit.microwavecooking.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ExampleClass1 implements ExampleInterface{

    @Override
    public void call() {
        System.out.println("PROD");
    }
}
