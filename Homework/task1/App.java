package Homework.task1;

public class App {
    public static void main(String[] args) {
        /*
        Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
        sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
        над которыми должна быть произведена операция.
         */


        System.out.println(Calculator.sum(15,85)); // 100.0
        System.out.println(Calculator.multiply(5,5)); //25
        System.out.println(Calculator.divide(1,0)); // Infinity
        System.out.println(Calculator.divide(100,20)); //5
        System.out.println(Calculator.subtract(50, 45)); // 5

        /*
        Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
        если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
        но должны иметь одинаковую длину и содержать элементы одного типа по парно.
         */

        Object[] arr1 = {1,2,"test",1.0};
        Object[] arr2 = {1,2,"test",1.0};
        Object[] arr3 = {1,6,"test",1.0};
        Object[] arr4 = {1,2,"test",1,5};

        System.out.println(compareArrays(arr1,arr2)); //true
        System.out.println(compareArrays(arr1,arr3)); //false
        System.out.println(compareArrays(arr1,arr4)); //false



    }
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
}
