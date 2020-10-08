import java.util.List;

public interface IGroup {

    List<User> getUsers();

    // process distribution
    void processDistribution(Expense expense, IShareDebit distributionStrategy);
}
