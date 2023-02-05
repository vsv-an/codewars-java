package kyu8;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        if (l == w) {
            return l * w;
        }
        return (l + w) * 2;
    }
}
