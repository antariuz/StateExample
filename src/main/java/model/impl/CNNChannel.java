package model.impl;

import model.Channel;

public class CNNChannel implements Channel {
    @Override
    public void broadcast() {
        System.out.println("Broadcasting CNN channel...");
    }
}
