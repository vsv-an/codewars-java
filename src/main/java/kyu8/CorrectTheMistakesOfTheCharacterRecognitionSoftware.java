package kyu8;

public class CorrectTheMistakesOfTheCharacterRecognitionSoftware {
    public static String correct(String string) {
        return string.replace("1", "I")
                .replace("0", "O")
                .replace("5", "S");
    }
}
