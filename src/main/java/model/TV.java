package model;

import model.impl.BBCChannel;
import model.impl.CNNChannel;
import model.impl.HBOChannel;

public class TV {
    Channel channel;

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void nextChannel() {
        if (channel instanceof BBCChannel) {
            setChannel(new CNNChannel());
        } else if (channel instanceof CNNChannel) {
            setChannel(new HBOChannel());
        } else if (channel instanceof HBOChannel) {
            setChannel(new BBCChannel());
        }
    }

    public void broadcast() {
        channel.broadcast();
    }

}
