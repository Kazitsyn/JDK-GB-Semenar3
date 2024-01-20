public class Employee extends People implements Comparable<Employee>{
    private int experience;
    private int reportCardID;

    public Employee(String firstName, String secondName, int age, String phone, int experience, int reportCardID) {
        super(firstName, secondName, age, phone);
        this.experience = experience;
        this.reportCardID = reportCardID;
    }


    public int getExperience() {
        return experience;
    }

    public int getReportCardID() {
        return reportCardID;
    }
    @Override
    public String toString() {
        return "Сотрудник{Табельный номер = " +reportCardID +
                ", Имя='" + getFirstName() + '\'' +
                ", Фамилия='" + getSecondName() + '\'' +
                ", возвраст=" + getAge() +
                ", опыт=" + experience +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return reportCardID - o.reportCardID;
    }
}
