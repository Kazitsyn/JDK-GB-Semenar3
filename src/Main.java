import java.util.Comparator;

public class Main {
    /*
        Создать справочник сотрудников
    Необходимо:
    Создать класс справочник сотрудников, который содержит внутри
    коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
    Табельный номер
    Номер телефона
    Имя
    Стаж
    Добавить метод, который ищет сотрудника по стажу (может быть список)
    Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    Добавить метод, который ищет сотрудника по табельному номеру
    Добавить метод добавление нового сотрудника в справочник
     */
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.create("Анна", "Петрова",30,"+79995556633",8);
        employeeService.create("Инга", "Иванова",28,"+79996662211",6);
        employeeService.create("Пётр", "Калинин",35,"+79992221133",13);
        employeeService.create("Сергей", "Зверев",22,"+79997778899",2);
        employeeService.create("Алексей", "Петров",40,"+79995556633",18);
//        for (Object employee: employeeService.getAll()){
//            System.out.println(employee);
//        }

        System.out.println(employeeService.getEmployeeExp(6));
        System.out.println(employeeService.getEmployeeExpList(5,10));
        System.out.println(employeeService.getPhoneByName("Анна"));
        System.out.println(employeeService.getPhoneByName("Анна", "Петрова"));
        System.out.println(employeeService.getEmployeeByID(4));
    }
}