package de.ait.interfaces;

public class TestMediaPlayer {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer("Рамштайн, Mutter");
        mediaPlayer.pause("Рамштайн, Mutter");
        mediaPlayer.stop("Рамштайн, Mutter");

        mediaPlayer = new VideoPlayer();
        mediaPlayer.pause("Рамштайн, Mutter");
        mediaPlayer.stop("Рамштайн, Mutter");

        System.out.println("_______\uD83C\uDFCA\u200D♂\uFE0F________");
    }
}
