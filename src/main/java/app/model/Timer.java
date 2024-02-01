package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Timer {
    private static Long nanoTime = System.nanoTime();

    @Autowired
    @Qualifier("animalsCage")
    public static Long getTime() {
        return nanoTime;
    }
}
