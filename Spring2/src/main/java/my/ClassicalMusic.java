package my;

import org.springframework.stereotype.Component;

@Component
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
