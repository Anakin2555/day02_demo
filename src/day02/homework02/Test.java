package day02.homework02;

public class Test {

    static void showLongTime(CurrentTimePrinter timePrinter){
        timePrinter.printCurrentTime();
    }

    public static void main(String[] args) {
        showLongTime(()->System.out.println(System.currentTimeMillis()));
    }
}
