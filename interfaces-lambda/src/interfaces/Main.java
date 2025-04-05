package interfaces;
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        runMusic(computer);
        runVideo(computer);
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
