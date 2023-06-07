import java.net.SocketOption;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
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
}