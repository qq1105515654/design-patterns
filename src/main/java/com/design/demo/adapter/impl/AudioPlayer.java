package com.design.demo.adapter.impl;

import com.design.demo.adapter.MediaPlayer;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if("mp3".equalsIgnoreCase(audioType))
            System.out.println("Playing mp3 file. Name："+filename);
        else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }
        else{
            System.out.println("Invalid media." + audioType + " format not support");
        }
    }
}
