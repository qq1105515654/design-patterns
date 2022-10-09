package com.design.demo.adapter.impl;

import com.design.demo.adapter.AdvancedMediaPlayer;
import com.design.demo.adapter.MediaPlayer;
import com.design.demo.adapter.impl.Mp4Player;
import com.design.demo.adapter.impl.VlcPlayer;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(String audioType){
        if("vlc".equalsIgnoreCase(audioType))
            mediaPlayer=new VlcPlayer();
        else if ("mp4".equalsIgnoreCase(audioType))
            mediaPlayer=new Mp4Player();

    }

    @Override
    public void play(String audioType, String filename) {
        if ("vlc".equalsIgnoreCase(audioType))
            mediaPlayer.playVlc(filename);
        if ("mp4".equalsIgnoreCase(audioType))
            mediaPlayer.playMp4(filename);
    }
}
