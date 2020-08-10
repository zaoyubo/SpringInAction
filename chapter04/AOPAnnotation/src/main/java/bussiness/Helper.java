package bussiness;

import org.springframework.stereotype.Component;

@Component
public class Helper implements HelperInterface {
    @Override
    public void help() {
        System.out.println("Help it");
    }
}
