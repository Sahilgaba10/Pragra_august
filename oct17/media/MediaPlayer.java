package oct17.media;

public abstract class MediaPlayer {
    int size;
    int capacity;
    String name;

    public MediaPlayer(int size, int capacity, String name) {
        this.size = size;
        this.capacity = capacity;
        this.name = name;
    }

    public void print(){
        System.out.println(name+" Player Features");
        System.out.println("Size :"+ size);
        System.out.println("capacity :"+ capacity);
    }
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}
