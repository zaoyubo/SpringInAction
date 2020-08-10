package aspecttest;

import concert.Performance;
import concert.PerformanceException;
import concert.Singer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class AudienceTest {
    @Autowired
    Performance performer ;

    @Test
    public void test() throws PerformanceException {
        performer.perform();
    }
}
