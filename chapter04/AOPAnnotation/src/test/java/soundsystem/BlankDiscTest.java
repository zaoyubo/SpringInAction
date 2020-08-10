package soundsystem;

import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class BlankDiscTest {

    @Autowired
    CompactDisc disc;

    @Test
    public void getHelper() {
        BlankDisc b = (BlankDisc) disc;
//        ((BlankDisc) disc).getHelper().help();
    }
}