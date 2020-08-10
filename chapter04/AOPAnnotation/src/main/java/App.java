import bussiness.Performance;
import bussiness.PerformanceException;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import soundsystem.BlankDisc;
import soundsystem.CompactDisc;

public class App {
    public static void main(String[] args) throws PerformanceException {
        //下面两种选一种即可

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Performance p = (Performance) context.getBean("performance");
        p.perform();
        CompactDisc blankDisc = (CompactDisc) context.getBean("blankDisc");
        blankDisc.playTrack(0);
        blankDisc.playTrack(0);

        System.out.println("------------");

        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Performance p2 = (Performance) context2.getBean("performance");
        p2.perform();
        CompactDisc blankDisc2 = (CompactDisc) context2.getBean("blankDisc");
        blankDisc2.playTrack(1);
        blankDisc2.playTrack(1);

//开启@EnableAspectJAutoProxy，则会使用代理生成bean，下面会报转换错误
//        BlankDisc b = (BlankDisc) context2.getBean("blankDisc");
//        b.getHelper().help();


    }
}
