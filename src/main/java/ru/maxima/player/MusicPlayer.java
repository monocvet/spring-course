package ru.maxima.player;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;
    private Music music1;
    private Music music2;
    private Music music3;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public  void play() {
        music1 = new JazzMusic();
        music2 = new RockMusic();
        music3 = new ClassicalMusic();
        List list = new ArrayList();
        list.add(0, music1.getSong());
        list.add(1, music2.getSong());
        list.add(2, music3.getSong());
        System.out.println("Now playing " + list);
    }
}
