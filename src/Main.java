import java.net.SocketOption;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        // task3();
        task4();
        }

    private static void task1() {
        int age = 17;
        int age2 = 56;
        if (age > 18) {
            System.out.println("Если возраст человека равен "+ age +" то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен "+ age +" то он не достиг" +
                    " совершеннолетия, нужно немного подождать");
        }

        if (age2 > 18) {
            System.out.println("Если возраст человека равен "+ age2 +" то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен "+ age2 +" то он не достиг" +
                    " совершеннолетия, нужно немного подождать");
        }
    }
    private static void task2() {
        int temperatureOne = 5;
        int temperatureTwo = -5;

        if (temperatureOne > 4){
            System.out.println("На улице "+ temperatureOne+" градусов, можно идти без шапки");
        }else{
            System.out.println("На улице "+ temperatureOne+" градусов, нужно надеть шапку");
        }

        if (temperatureTwo > 5){
            System.out.println("На улице "+ temperatureTwo+" градусов, можно идти без шапки");
        }else{
            System.out.println("На улице "+ temperatureTwo+" градусов, нужно надеть шапку");

        }
    }
    private static void task3() {
        int speedMore = 65;
        int speedLow = 55;

        if (speedMore > 60){
            System.out.println("Если скорость "+ speedMore +", то придется заплатить штраф");
        }else{
            System.out.println("Если скорость "+ speedLow +", то можно ездить спокойно");
        }

        if (speedLow > 60){
            System.out.println("Если скорость "+ speedMore +", то придется заплатить штраф");
        }else{
            System.out.println("Если скорость "+ speedLow +", то можно ездить спокойно");
        }
    }
    private static void task4() {
        ///задача 4
        int human = 7;
        boolean childHome = human > 1 && human < 7;
        boolean childSchool = human > 6 && human < 19;
        boolean NotChildJustUniver = human > 18 && human < 25;
        boolean workHuman = human > 24 && human < 60;
        if (human < 2){
            System.out.println("Если возраст человека равен "+human+" ,то ему пора спать");
        }else {
            if (childHome) {
                System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в детсвкий сад");
            }else {
                if (childSchool) {
                    System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в школу");
                }else {
                    if (NotChildJustUniver) {
                        System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в Университет");
                    }else {
                        if (workHuman) {
                            System.out.println("Если возраст человека равен "+human+", то ему нужно ходить на работу");
                        }else {
                            System.out.println("Если возраст человека равен "+human+", то ему можно отдохнуть");
                        }
                    }
                }
            }
        }



    }
}