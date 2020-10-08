import java.util.List;

public interface IShareDebit {
    void splitMoney(Expense expense, List<User> currentUsersInGroup);
}
