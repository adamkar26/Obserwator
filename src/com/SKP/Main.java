package com.SKP;

import com.SKP.Editor.Editor;
import com.SKP.Listeners.EmailAlertsListener;
import com.SKP.Listeners.LogListener;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogListener("./log.txt"));
        editor.eventManager.subscribe("save", new EmailAlertsListener("mail@mail.com"));

        try{
            editor.openFile("text.txt");
            editor.saveFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
