package com.design.demo.adapter.impl;

import com.design.demo.adapter.AdvancedMediaPlayer;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. name："+filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
