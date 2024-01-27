# JDK GeekBranch Homework 6 

### Задача:
В качестве задачи предлагаю вам реализовать код для демонстрации парадокса Монти Холла (Парадокс Монти Холла — Википедия ) и наглядно убедиться в верности парадокса (запустить игру в цикле на 1000 и вывести итоговый счет).

Необходимо:

* Создать свой Java Maven или Gradle проект;
* Самостоятельно реализовать прикладную задачу;
* Сохранить результат в HashMap<шаг теста, результат>
* Вывести на экран статистику по победам и поражениям

```Java
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean[] doors = new boolean[3];
        Random rnd = new Random();
        HashMap<Integer, Boolean> result = new HashMap<>();
        for (int i = 0; i < 1000; i++){
            int openDoor2 = -1; // Переменная индекса двери которая открывается после выбора - за ней нет приза.
            int prize = rnd.nextInt(3); //
            doors[prize]= true;
            int choiceDoor = rnd.nextInt(3);
            if (prize == choiceDoor){
                result.put(i,!doors[choiceDoor]);
                doors[prize]= false;
                continue;
            }
            for (int j = 0; j < doors.length; j++){
                if (j != choiceDoor && j != prize) {
                    openDoor2 = j;
                    break;
                }
            }
            for (int k = 0; k < 3; k++){
                if (k != choiceDoor && k != openDoor2){
                    if (doors[k]){
                        result.put(i, true);
                        break;
                    }
                }
            }
            doors[prize]= false;
        }

        System.out.printf( "Успешных открытий %d из %d" ,
                result
                        .entrySet()
                        .stream()
                        .filter(Map.Entry::getValue)
                        .toList()
                        .size(),
                result
                        .size()


        );
    }
}
```