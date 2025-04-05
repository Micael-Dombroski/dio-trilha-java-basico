package interfaces;
public interface MusicPlayer {
    //public final static String music = "Happy birthday to you";
        //Mesma coisa que a de cima já que por padrão variáveis numa interface 
        //são public, final e static
    String music = "Happy birthday to you";

    void playMusic();
    void pauseMusic();
    void stopMusic();
}
