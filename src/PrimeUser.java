public class PrimeUser extends User{
    private int cashbak;

    public PrimeUser(String name, String surname, Integer age, String creditcard, Integer cvv, Double balance, Integer id, String password, int cashbak) {
        super(name, surname, age, creditcard, cvv, balance, id, password);
        this.cashbak = cashbak;
    }

    public PrimeUser(String name, String surname, Integer age, String creditcard, Integer cvv, Double balance, String password, int cashbak) {
        super(name, surname, age, creditcard, cvv, balance, password);
        this.cashbak = cashbak;
    }

    public int getCashbak() {
        return cashbak;
    }

    public void setCashbak(int cashbak) {
        this.cashbak = cashbak;
    }

    @Override
    public String toString() {
        return "PrimeUser{" +
                "cashbak=" + cashbak +
                '}';
    }
}
