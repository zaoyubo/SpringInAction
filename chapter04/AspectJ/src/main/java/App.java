import concert.CriticismEngine;
import concert.Performance;
import concert.PerformanceException;
import concert.Singer;
import myaspects.CriticAspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws PerformanceException {
        //  TODO  有时运行正常，有时错误？

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Performance p = (Performance) context.getBean("singer");
        p.perform();
        System.out.println("---------");

//        CriticismEngine c = (CriticismEngine) context.getBean("criticismEngineImplementation");
//        System.out.println(c);
//        System.out.println(c.getCriticism());
//        System.out.println("---------");
//
//        CriticAspect cri = (CriticAspect) context.getBean("critic");
//        System.out.println(cri);
//        System.out.println(cri.criticismEngine);
    }
}
