package kyu8;

public class ConvertToBinary {
    public static int toBinary(int n) {
        String str = Integer.toBinaryString(n);

        return Integer.parseInt(str);
    }
}
