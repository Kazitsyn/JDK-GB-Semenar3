# Домашняя работа по 3 семинару курса по JDK в GeekBrains
### Задаа 1
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция.

***
```Java
    public class Calculator {
    
        public static<T extends Number,V extends Number> double sum(T arg1, V arg2){
            double result =  arg1.doubleValue() + arg2.doubleValue();
            return result;
        }
        public static<T extends Number,V extends Number> double multiply(T arg1, V arg2){
            double result =  arg1.doubleValue() * arg2.doubleValue();
            return result;
        }
    
        public static<T extends Number,V extends Number> double divide(T arg1, V arg2){
            double result =  arg1.doubleValue() / arg2.doubleValue();
            return result;
        }
    
        public static<T extends Number,V extends Number> double subtract(T arg1, V arg2){
            double result =  arg1.doubleValue() - arg2.doubleValue();
            return result;
        }
    }
```
*** 
### Задача 2
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы одного типа по парно.
***
```Java
    static <T extends Object, V extends Object> boolean compareArrays(T[]arr1, V[]arr2){
            if (arr1.length == arr2.length){
                for (int i = 0; i< arr1.length; i++){
                    if (!arr1[i].equals(arr2[i])){
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
```
***
### Задача 3
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. 
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, 
а также переопределение метода toString(), возвращающее строковое представление пары. 
***
```Java
public class Pair<T,V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
```