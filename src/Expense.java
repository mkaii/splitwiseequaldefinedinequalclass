import java.util.List;

public class Expense {
    private final List<User> users;
    private final double amount;

    Expense(List<User> users, double amount) {
        this.users = users;
        this.amount = amount;
    }

    public List<User> getUsers() {
        return users;
    }

    public double getAmount() {
        return amount;
    }
}
