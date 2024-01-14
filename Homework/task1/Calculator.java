package Homework.task1;

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
