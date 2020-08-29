package ru.duman.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("clasicalMusic", Music.class);
        MusicPlayer clasicalMusicPlayer = new MusicPlayer(music2);
        clasicalMusicPlayer.playMusic();
        context.close();
    }
}
