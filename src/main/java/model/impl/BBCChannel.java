package model.impl;

import model.Channel;

public class BBCChannel implements Channel {
    @Override
    public void broadcast() {
        System.out.println("Broadcasting BBC channel...");
    }
}
