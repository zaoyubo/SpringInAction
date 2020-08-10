import aspect.Encoreable;
import bussiness.Performance;
import bussiness.PerformanceException;
import bussiness.Singer;
import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class EncoreableTest {
   @Autowired
   Performance singer;

    @Test
    public void Test() throws PerformanceException {
        singer.perform();
        Encoreable e = (Encoreable)singer;
        e.performEncore();
    }
}
