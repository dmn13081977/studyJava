package org.projects;

public class PopMusic implements Music{
    @Override
    public String getsong() {
        return "La La La";
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
