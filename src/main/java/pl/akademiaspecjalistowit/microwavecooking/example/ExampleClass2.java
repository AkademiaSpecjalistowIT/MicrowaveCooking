package pl.akademiaspecjalistowit.microwavecooking.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class ExampleClass2 implements ExampleInterface{

    @Override
    public void call() {
        System.out.println("DEV");
    }
}
