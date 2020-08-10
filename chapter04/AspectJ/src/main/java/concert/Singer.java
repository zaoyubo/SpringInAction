package concert;

public class Singer implements Performance {
    private String name;
    private String song;


    public Singer(String name) {
        this(name, null);
    }

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
//        System.out.println("this Singer construct method");
    }

    public void perform() throws PerformanceException {
        if(song == null) {
            throw new PerformanceException(name + " doesn't have a song to sing.");
        }
        System.out.println(name + " is singing " + song);
    }

    public void setSong(String song) {
        this.song = song;
    }
}
