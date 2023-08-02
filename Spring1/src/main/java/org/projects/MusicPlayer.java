package org.projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer{

    public MusicPlayer(){}

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List <Music> musicList = new ArrayList<>();;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void playMusicList(){
        for(Music music : musicList) {
            System.out.println("Playing: " + music.getsong());
        }

    }
}
