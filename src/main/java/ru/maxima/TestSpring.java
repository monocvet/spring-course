package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.player.Music;
import ru.maxima.player.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("music", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.play();

        context.close();
    }
}
