package aspecttest;

import aspect.TrackCounter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class TrackerTest {
    @Autowired
    CompactDisc disc;

    @Autowired
    TrackCounter counter;

    @Test
    public void test(){
        disc.playTrack(0);
        disc.playTrack(0);
        assertEquals(2,counter.getPlayCount(0));
    }


}
