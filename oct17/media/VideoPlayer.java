package oct17.media;

public class VideoPlayer extends MediaPlayer{

    public VideoPlayer(int size, int capacity,String name) {
        super(size, capacity, name);
    }

    @Override
    public void play() {
        System.out.println("Play 1040MP video");
    }

    @Override
    public void pause() {
        System.out.println("Pause anytime");
    }

    @Override
    public void stop() {
        System.out.println("close video to stop");
    }
}
