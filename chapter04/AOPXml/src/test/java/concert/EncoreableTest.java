package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class EncoreableTest {
    @Autowired
    Performance performance;

    @Test
    public void test() throws PerformanceException {
        performance.perform();
        Encoreable encore = (Encoreable) performance;
        encore.performEncore();

    }

}