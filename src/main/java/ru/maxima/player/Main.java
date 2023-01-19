package ru.maxima.player;

public class Main {
    public static void main(String[] args) {
       Music music = new JazzMusic();
       MusicPlayer musicPlayer = new MusicPlayer(music);
       musicPlayer.play();

    }
}
