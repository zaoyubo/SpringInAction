import concert.Performance;
import concert.PerformanceException;
import myaspects.CriticAspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class AspectTest {

    @Autowired
    Performance performance;

    @Test
    public void test() throws PerformanceException {
        performance.perform();

    }
}
