public class Main {
    public static void main(String[] args) {
        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        Fork fork4 = new Fork();
        Fork fork5 = new Fork();
        Philosopher philosopher1  = new Philosopher("Аристотель", fork1,fork2);
        Philosopher philosopher2  = new Philosopher("Сократ", fork2,fork3);
        Philosopher philosopher3  = new Philosopher("Платон", fork3,fork4);
        Philosopher philosopher4  = new Philosopher("Кант", fork4,fork5);
        Philosopher philosopher5  = new Philosopher("Пифагор", fork5,fork1);
        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
    }
}