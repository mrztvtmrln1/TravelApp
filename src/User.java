import java.sql.Date;
import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private Integer age;
    private String creditcard;
    private Integer cvv;
    private Double balance;
    private int id;
    private String password;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public Integer getCvv() {
        return cvv;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String surname, Integer age, String creditcard, Integer cvv, Double balance, Integer id, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.creditcard = creditcard;
        this.cvv = cvv;
        this.balance = balance;
        this.id = id;
        this.password = password;
    }

    public User(String name, String surname, Integer age, String creditcard, Integer cvv, Double balance,String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.creditcard = creditcard;
        this.cvv = cvv;
        this.balance = balance;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+age+" "+balance;
    }
}
