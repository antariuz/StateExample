import model.Channel;
import model.TV;
import model.impl.BBCChannel;

public class StateExample {
    public static void main(String[] args) {
        Channel channel = new BBCChannel();
        TV tv = new TV();
        tv.setChannel(channel);

        for (int i = 0; i < 6; i++) {
            tv.nextChannel();
            tv.broadcast();
        }

    }
}
