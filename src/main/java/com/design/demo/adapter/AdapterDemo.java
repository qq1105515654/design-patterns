package com.design.demo.adapter;

import com.design.demo.adapter.impl.AudioPlayer;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public class AdapterDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","D:/test.mp3");
        audioPlayer.play("vlc","D:/test.vlc");
        audioPlayer.play("mp4","D:/test.mp4");
        audioPlayer.play("avi","D:/test.avi");
    }
}
