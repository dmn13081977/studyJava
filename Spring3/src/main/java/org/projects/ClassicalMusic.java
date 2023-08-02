package org.projects;

public class ClassicalMusic implements Music{
    @Override
    public String getsong() {
        return "Hungarian Rhapsody";
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
