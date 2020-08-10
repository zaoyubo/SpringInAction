package config;

import aspect.Audience;
import aspect.EncoreableIntroducer;
import aspect.TrackCounter;
import bussiness.Helper;
import bussiness.HelperInterface;
import bussiness.Performance;
import bussiness.Singer;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import soundsystem.BlankDisc;
import soundsystem.CompactDisc;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages ={"bussiness"} )
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public HelperInterface helper(){
        return new Helper();
    }

    @Bean
    public Audience audience(){
        Audience myaudience = new Audience();
        myaudience.setHelper(helper());
        return myaudience;
    }

    @Bean
    public Performance performance(){
        return new Singer("singer");
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }

    @Bean
    public CompactDisc blankDisc(){
        List<String> tracks = new ArrayList<>();
        tracks.add("The Beatles");
        tracks.add("Fixing a Hole");
        BlankDisc blankDisc = new BlankDisc(tracks);
//        Helper h = new Helper();
//        blankDisc.setHelper(h);
        return blankDisc;
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return new EncoreableIntroducer();
    }

}
