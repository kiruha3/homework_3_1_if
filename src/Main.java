import java.net.SocketOption;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
        }else if (childHome) {
                System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в детсвкий сад");
            }else if (childSchool) {
                System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в школу");
                }else if (NotChildJustUniver) {
                        System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в Университет");
                    }else if (workHuman) {
                            System.out.println("Если возраст человека равен "+human+", то ему нужно ходить на работу");
                        }else {
                            System.out.println("Если возраст человека равен "+human+", то ему можно отдохнуть");
                        }
                    }


    private static void task5() {
        int ageChild = 4;
        boolean childDownFive = ageChild<5;
        boolean childWithParent = ageChild == 5|| ageChild > 5 && ageChild < 14;
        if (childDownFive){
            System.out.println("Если возраст ребенка равен "+ageChild+", то ему нельзя кататься на аттракционе");
            }else if (childWithParent){
                System.out.println("Если возраст ребенка равен "+ageChild+" ,то ему можно кататься на аттракционе в сопровождении");
                }else {
                System.out.println("Если возраст ребенка равен "+ageChild+" ,то ему можно кататься на аттракционе");
                 }
    }
    private static void task6() {

        int passanger = 4;

        int maxPassanger = 102;
        int allSitPlace = 60;

        boolean canEnter = passanger < (maxPassanger+1);
        boolean sitPlace = passanger < (allSitPlace+1);

        if (canEnter){
            System.out.printf("В вагоне вас есть ");
            if (sitPlace){
                System.out.println("сидячее место для вас");
            }else {
                System.out.println("стоячее место для вас");
            }
        } else if(passanger > maxPassanger){
            System.out.println("В вагоне нет мест, он збит");
        }
    }

    private static void task7(){
        int one = 13;
        int two = 22;
        int three = 33;
        int maxNumber ;
        if (one > two){
        maxNumber = one;
        }else if (two > three){
            maxNumber = two;
            }else{
                maxNumber = three;
            }
        System.out.println("Маскимальное число -> "+maxNumber);
    }
}