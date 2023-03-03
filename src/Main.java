import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        System.out.println("Добро пожаловать в приложение РОЗЫГРЫШ ИГРУШЕК");
        Lottery lottery = new Lottery();
        lottery.put(new Toys(1, "Конструктор", 10.0));
        lottery.put(new Toys(2, "Робот",  31.0));
        lottery.put(new Toys(3, "Машинка", 50.0));
        lottery.put(new Toys(4, "Мягкая игрушка", 17.0));
        lottery.put(new Toys(5, "Кукла",  16.5));
        lottery.put(new Toys(6, "Машинка",  30.0));
        lottery.put(new Toys(7, "Конструктор", 25.0));
        lottery.put(new Toys(8, "Мягкая игрушка", 20.0));
        lottery.put(new Toys(9, "Кукла",  14.0));
        lottery.put(new Toys(10, "Мягкая игрушка", 15.0));

        try {
            FileWriter writer = new FileWriter("lottery.txt");
            for (int i = 0; i < 10; i++) {
                Toys toys = lottery.get();
                writer.write(toys.getID() + " " + toys.getName() + " " + toys.getChance() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}