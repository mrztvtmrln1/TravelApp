public class SimpleUser extends User{
    public SimpleUser(String name, String surname, Integer age, String creditcard, Integer cvv, Double balance, Integer id, String password) {
        super(name, surname, age, creditcard, cvv, balance, id, password);
    }

    public SimpleUser(String name, String surname, Integer age, String creditcard, Integer cvv, Double balance, String password) {
        super(name, surname, age, creditcard, cvv, balance, password);
    }
}
