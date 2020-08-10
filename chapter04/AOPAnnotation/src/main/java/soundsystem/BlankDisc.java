package soundsystem;

import bussiness.Helper;
import bussiness.HelperInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlankDisc implements CompactDisc {

    @Autowired
    Helper helper;
    public Helper getHelper() {
        return helper;
    }

    public void setHelper(Helper helper) {
        this.helper = helper;
    }


    private List<String> tracks;

    public BlankDisc(List<String> tracks) {
        this.tracks = tracks;
    }



    @Override
    public void play() {
        for (String track : tracks){
            System.out.println("-" + track);
        }
    }

    public void playTrack(int trackNum){
        System.out.println(tracks.get(trackNum));
    }
}
