public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","Warriors");
        audioPlayer.play("mp4","Biały Miś");
        audioPlayer.play("vlc","Far Far Away");
        audioPlayer.play("avi","Rainman");
    }
}
