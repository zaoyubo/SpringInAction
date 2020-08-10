package aspect;

import bussiness.HelperInterface;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class Audience {

    public HelperInterface getAudienceHelper() {
        return audienceHelper;
    }

    //@Autowired 不可以自动注入
    private HelperInterface audienceHelper;
    // 通过 xml property 也不能注入， 通过 JavaConfig 可以注入
    public void setHelper(HelperInterface helper) {
        this.audienceHelper = helper;
    }

    @Pointcut("execution( * bussiness.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        System.out.println("The audience is taking their seats.(In Around)");
        System.out.println("The audience is turning off their cellphones(In Around)");
        try {
            jp.proceed();
            System.out.println("CLAP CLAP CLAP CLAP CLAP(In Around)");
        } catch (Throwable throwable) {
            System.out.println("Boo! We want our money back!(In Around)");
        }
    }

    @Before("performance()")
    public void takeSeats() {

        System.out.println("The audience is taking their seats.");
        audienceHelper.help();
    }

    @Before("execution( * bussiness.Performance.perform(..))")
    public void silenceCellPhone() {
        System.out.println("The audience is turning off their cellphones");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

}
