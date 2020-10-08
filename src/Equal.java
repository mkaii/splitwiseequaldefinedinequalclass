import java.util.List;

public class Equal implements IShareDebit {

    //y was this made public
    @Override
    public void splitMoney(Expense expense, List<User> currentUsersInGroup) {

        // for all the users in this Expense object
        // increase debit for each user in this current users in group by amount/sizeof(current users in group)

        System.out.println("here at equally");
    }
}
