package kyu8;

public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        if (cap - on - wait >= 0) {
            return 0;
        }
        return Math.abs(cap - on - wait);
    }
}
