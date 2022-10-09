package com.design.demo.adapter.impl;

import com.design.demo.adapter.AdvancedMediaPlayer;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. name："+filename);
    }
}
