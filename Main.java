import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Queue<Toy> ToysToWinQueue = new PriorityQueue<Toy>(dropFrequencyComparator);

        addNewToyToQueue(ToysToWinQueue, 1, "Конструктор", 1);
        addNewToyToQueue(ToysToWinQueue, 2, "Машинка", 2);
        addNewToyToQueue(ToysToWinQueue, 3, "Кукла", 1);
        giveOutAToy(ToysToWinQueue);
    }

    public static Comparator<Toy> dropFrequencyComparator = new Comparator<Toy>() {
        @Override
        public int compare(Toy o1, Toy o2) {
            return (int) (o2.getDropFrequency() - o1.getDropFrequency());
        }
    };

    private static void addNewToyToQueue(Queue<Toy> ToysToWinQueue, int id, String toyName, int quantity) {
        Random random = new Random();
        int dropFrequency = random.nextInt(100);
        ToysToWinQueue.add(new Toy(id, toyName, quantity, dropFrequency));
    }

    private static void giveOutAToy(Queue<Toy> ToysToWinQueue) {
        File file = new File("C:\\Users\\Светлана\\Desktop\\ToyLotteryStore\\resources\\Toys.txt");
        FileWriter fr = null;
        String text = ToysToWinQueue.poll().toString();
        try {
            fr = new FileWriter(file, true);
            fr.write(text);
            fr.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
