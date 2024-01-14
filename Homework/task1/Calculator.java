package Homework.task1;

/**
 * Задаа:  Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 *         sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
 *         над которыми должна быть произведена операция.
 */
public class Calculator {
    /**
     * Метод сложения двух чисел разного типа, результат типа double
     * @param arg1 первый аргумент - число любого типа
     * @param arg2 второй аргумент - число любого типа
     * @return результат сумирования двух аргументов (значение типа double)
     * @param <T> параметр наследник класса Number
     * @param <V> параметр наследник класса Number
     */
    public static<T extends Number,V extends Number> double sum(T arg1, V arg2){
        double result =  arg1.doubleValue() + arg2.doubleValue();
        return result;
    }

    /**
     * Метод умножения двух чисел разного типа, результат типа double
     * @param arg1 первый аргумент - число любого типа
     * @param arg2 второй аргумент - число любого типа
     * @return результат умножения двух аргументов (значение типа double)
     * @param <T> параметр наследник класса Number
     * @param <V> параметр наследник класса Number
     */
    public static<T extends Number,V extends Number> double multiply(T arg1, V arg2){
        double result =  arg1.doubleValue() * arg2.doubleValue();
        return result;
    }

    /**
     * Метод деления двух чисел разного типа, результат типа double
     * @param arg1 первый аргумент - число любого типа
     * @param arg2 второй аргумент - число любого типа
     * @return результат деления двух аргументов (значение типа double)
     * @param <T> параметр наследник класса Number
     * @param <V> параметр наследник класса Number
     */
    public static<T extends Number,V extends Number> double divide(T arg1, V arg2){
        double result =  arg1.doubleValue() / arg2.doubleValue();
        return result;
    }

    /**
     * Метод вычетания двух чисел разного типа, результат типа double
     * @param arg1 первый аргумент - число любого типа
     * @param arg2 второй аргумент - число любого типа
     * @return результат вычетания двух аргументов (значение типа double)
     * @param <T> параметр наследник класса Number
     * @param <V> параметр наследник класса Number
     */
    public static<T extends Number,V extends Number> double subtract(T arg1, V arg2){
        double result =  arg1.doubleValue() - arg2.doubleValue();
        return result;
    }
}
