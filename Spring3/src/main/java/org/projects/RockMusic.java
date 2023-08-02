package org.projects;

public class RockMusic implements Music{
    private RockMusic(){}

    public static RockMusic createRockMusic(){
        return new RockMusic();
    }

    @Override
    public String getsong() {
        return "Wind cries Mary";
    }

    @Override
    public void doInit() {
        Music.super.doInit();
    }

    @Override
    public void doDestroy() {
        Music.super.doDestroy();
    }
}
