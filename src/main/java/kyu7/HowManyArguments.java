package kyu7;

/*
args_count(1, 2, 3) -> 3
args_count(1, 2, 3, 10) -> 4

 */

public class HowManyArguments {
    public static int countArgs(Object... args) {
        //your code here
        return args.length;
    }
}
