package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Component
public class Spitters implements SpitterRepository{
    private List<Spitter> list = new ArrayList<>();

    public Spitters() {
        list.add(new Spitter("u1","p1","f","l","email"));
        list.add(new Spitter("u2","p2","f","l","email"));
    }

    @Override
    public Spitter save(Spitter spitter) {
        list.add(spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        for (Spitter s : list){
            if (s.getUsername().equals(username)){
                return s;
            }
        }
        return null;
    }
}
