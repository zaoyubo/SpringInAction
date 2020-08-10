package soundsystem;


import concert.Singer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlankDisc implements CompactDisc {


    private List<String> tracks;

    public BlankDisc(List<String> tracks) {
        this.tracks = tracks;
    }


    @Override
    public void play() {
        for (String track : tracks) {
            System.out.println("-" + track);
        }
    }

    public void playTrack(int trackNum) {
        System.out.println(tracks.get(trackNum));
    }
}
