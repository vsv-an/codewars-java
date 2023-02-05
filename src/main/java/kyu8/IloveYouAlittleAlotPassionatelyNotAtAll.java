package kyu8;

public class IloveYouAlittleAlotPassionatelyNotAtAll {
    public static String howMuchILoveYou(int nb_petals) {
        String[] arr = new String[]{"not at all", "I love you", "a little", "a lot", "passionately", "madly"};

        return arr[nb_petals % 6];

//        String[] arr = new String[]{"I love you", "a little", "a lot", "passionately", "madly", "not at all"};

//        if ((nb_petals + 6) % 6 == 1) {
//            return arr[0];
//        } else if ((nb_petals + 6) % 6 == 2) {
//            return arr[1];
//        } else if ((nb_petals + 6) % 6 == 3) {
//            return arr[2];
//        } else if ((nb_petals + 6) % 6 == 4) {
//            return arr[3];
//        } else if ((nb_petals + 6) % 6 == 5) {
//            return arr[4];
//        }
//        return arr[5];
    }
}
