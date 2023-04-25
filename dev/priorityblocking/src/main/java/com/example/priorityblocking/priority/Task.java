package com.example.priorityblocking.priority;

import static java.lang.Thread.sleep;

import android.util.Log;

public class Task implements Runnable{

    private int priority;

    public int getPriority() {
        return priority;
    }

    public Task(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.e("priority", "run: " + priority);
    }
}
