package com.example.devmodel.single;

import android.util.Log;

public class AndroidManager {
    private static AndroidManager instance;

    public static AndroidManager getInstance() {
        if (instance == null) {
            synchronized (AndroidManager.class){
                if (instance == null) {
                    instance = new AndroidManager();
                }
            }
        }
        return instance;
    }

    public void  display() {
        Log.e("single", "display: "+this.toString());
    }


}
