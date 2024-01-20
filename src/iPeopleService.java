import java.util.List;

public interface iEmployeeService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
}
