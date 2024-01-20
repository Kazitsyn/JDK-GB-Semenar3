import java.util.List;

public interface iPeopleService<T> {
    /**
     * Получить список
     * @return
     */
    List<T> getAll();

    /**
     * Добавить в список
     * @param firstName
     * @param secondName
     * @param age
     */
    void create(String firstName, String secondName, int age,String phone, int experience);
}
