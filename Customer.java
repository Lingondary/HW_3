import lombok.Data;

@Data
public class Customer {
    private String fio;
    private int age;
    private String phone;
    private Gender gender;

    public Customer() {

    }
}