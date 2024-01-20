import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService implements iPeopleService, Iterator<Employee> {
    private int count = 1;
    private int iterator;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    /**
     * Метод добавления человека
     * @param people человек
     * @param experience опыт
     */
    public void add(People people, int experience){
        Employee employee = new Employee(people.getFirstName(),people.getSecondName(),
                people.getAge(), people.getPhone(), experience,count++);
        employees.add(employee);
    }

    /**
     * Метод добавления сотрудника
     * @param employee
     */
    public void add(Employee employee){
        employees.add(employee);
    }

    /**
     * метод получить сотрудника по заданому опыту
     * @param exp
     * @return
     */
    public Employee getEmployeeExp(int exp){
        for (Employee employee: employees){
            if (employee.getExperience() == exp){
                return employee;
            }

        }
        return null;
    }

    /**
     * метод выдает номер телефона по заданому имени
     *
     * @param name имя
     * @return
     */
    public String getPhoneByName(String name){
        for (Employee employee: employees){
            if (employee.getFirstName().equals(name)){
                return name + ": " + employee.getPhone();
            }
        }
        for (Employee employee: employees){
            if (employee.getSecondName().equals(name)){
                return name + ": " + employee.getPhone();
            }
        }
        return null;
    }

    /**
     * метод выдает номер телефона по имени и фамилии
     * @param firstName
     * @param secondName
     * @return
     */
    public String getPhoneByName(String firstName, String secondName){
        for (Employee employee: employees){
            if (employee.getFirstName().equals(firstName) && employee.getSecondName().equals(secondName)){
                return firstName + " " + secondName + ": " + employee.getPhone();
            }

        }
        return null;
    }

    /**
     * Метод возвращает список телефонов сотрудников совподающие по имени или фамилии
     * @param name
     * @return
     */
    public List<String> getPhoneByNameList(String name){
        List<String> temp = new ArrayList<>();
        for (Employee employee: employees){
            if (employee.getFirstName().equals(name)){
                temp.add(name + ": " + employee.getPhone());
            }
        }
        if (temp.size() == 0){
            for (Employee employee: employees){
                if (employee.getSecondName().equals(name)){
                    temp.add(name + ": " + employee.getPhone());
                }
            }
        }

        return temp;
    }


    /**
     * метод получить список сотрудников с указанным опытом
     * @param exp
     * @return
     */
    public List<Employee> getEmployeeExpList(int exp){
        List<Employee> temp = new ArrayList<>();
        for (Employee employee: employees){
            if (employee.getExperience() == exp){
                temp.add(employee);
            }

        }
        return temp;
    }

    /**
     * метод получить список сотрудников в указанном диапозоне опыта
     * @param expMin
     * @param expMax
     * @return
     */
    public List<Employee> getEmployeeExpList(int expMin, int expMax){
        List<Employee> temp = new ArrayList<>();
        for (Employee employee: employees){
            if (employee.getExperience() >= expMin && employee.getExperience() <= expMax){
                temp.add(employee);
            }

        }
        return temp;
    }

    public Employee getEmployeeByID(int id){
        if (id <= count && id > 0){
            for (Employee employee: employees){
                if (employee.getReportCardID() == id){
                    return employee;
                }

            }
        }
        return null;
    }

    /**
     * Получить список
     *
     * @return
     */
    @Override
    public List getAll() {
        return employees;
    }

    /**
     * Добавить в список нового сотрудника
     *
     * @param firstName
     * @param secondName
     * @param age
     */
    @Override
    public void create(String firstName, String secondName, int age,String phone, int experience) {
        Employee employee = new Employee(firstName,secondName,age, phone, experience, count++);
        employees.add(employee);
    }

    @Override
    public boolean hasNext() {
        return iterator < employees.size();
    }

    @Override
    public Employee next() {
        if (!hasNext()){
            iterator = 0;
            return null;
        }
        return employees.get(iterator++);
    }
}
