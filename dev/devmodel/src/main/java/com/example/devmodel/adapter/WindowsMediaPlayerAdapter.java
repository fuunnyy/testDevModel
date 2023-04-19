package com.example.devmodel.adapter;

public class WindowsMediaPlayerAdapter implements AndroidTarget{

    private WindowsMediaPlayer mediaPlayer;

    public WindowsMediaPlayerAdapter(WindowsMediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play(String fileName) {
        mediaPlayer.playFile(fileName);
    }
}
