package task2;

public class App {
    public static void main(String[] args) {
        /*
        Описать собственную коллекцию – список на основе массива.
        Коллекция должна иметь возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
         */
        MyCollection <String> myCollection = new MyCollection<>();
        myCollection.add("Anna");
        myCollection.add("Anna2");
        myCollection.add("Anna3");
        myCollection.add("Anna4");

        myCollection.remove(1);
        myCollection.remove("Anna4");

        System.out.println(myCollection);
    }
}
