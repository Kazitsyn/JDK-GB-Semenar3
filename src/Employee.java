public class Employee extends People{
    private int experience;

    public Employee(String firstName, String secondName, int age, int experience) {
        super(firstName, secondName, age);
        this.experience = experience;
    }


    public int getExperience() {
        return experience;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", age=" + getAge() +
                "experience=" + experience +
                '}';
    }
}
