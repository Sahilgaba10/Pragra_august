package oct17.media;

import java.awt.*;

public class AudioPlayer extends MediaPlayer{


    public AudioPlayer(int size, int capacity, String name) {
        super(size, capacity, name);
    }

    @Override
    public void play() {
        System.out.println("Play Mp4 audio only");
    }

    @Override
    public void pause() {
        System.out.println("Pause anytime");
    }

    @Override
    public void stop() {
        System.out.println("Exit to stop music");
    }
}
