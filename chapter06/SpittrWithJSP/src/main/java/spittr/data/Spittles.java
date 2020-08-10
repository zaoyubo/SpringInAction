package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Spittles implements SpittleRepository {

    private List<Spittle> list = new ArrayList<>();

    public Spittles() {
        list.add(new Spittle(1L,"m1",new Date(),1.1,2.2));
        list.add(new Spittle(2L, "m2",new Date(),1.1,2.2));
}

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> l = new ArrayList<>();
        for (Spittle s : list){
            if (s.getId() < max) l.add(s);
        }
        return l;
    }

    @Override
    public Spittle findOne(long spittleId) {
        for (Spittle s : list){
            if (s.getId() == spittleId) return s;
        }
        return null;
    }
}
