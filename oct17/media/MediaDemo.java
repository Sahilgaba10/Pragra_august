package oct17.media;

import java.awt.*;

public class MediaDemo {
    public static void main(String[] args) {

        MediaPlayer player = new AudioPlayer(30,500, "Audio");
        player.print();
        player.play();
        player.pause();
        player.stop();

        MediaPlayer player2 = new VideoPlayer(25,400, "Video");
        player2.print();
        player2.play();
        player2.pause();
        player2.stop();
    }
}
