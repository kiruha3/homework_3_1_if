import java.net.SocketOption;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        }

    private static void task1() {
        int age = 17;
        if (age > 18) {
            System.out.println("Если возраст человека равен "+ age +" то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен "+ age +" то он не достиг" +
                    " совершеннолетия, нужно немного подождать");
        }
    }
}