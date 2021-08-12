package model.impl;

import model.Channel;

public class HBOChannel implements Channel {
    @Override
    public void broadcast() {
        System.out.println("Broadcasting HBO channel...");
    }
}
