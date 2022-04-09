package com.SKP.Listeners;

import java.io.File;

public class LogListener implements EventListener{

    private File log;

    public LogListener(String log) {
        this.log = new File(log);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Zapisuje do logu  "+log+" ktos wykonal operacje "+ eventType + " na pliku "+ file.getName());
    }
}
