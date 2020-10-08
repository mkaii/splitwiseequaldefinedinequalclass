import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// group rx-80 -> 4 members -
public class group implements IGroup {
    //member variables

    /// list of expenses with all users involves - history management


    private double totalGroupExpense;
    //private IShareDebit i1;

    // current user list
    private List<User> currentUsersInGroup = new ArrayList<>();


    //constructor
    //evrey time a group object is created a constructor should be invoked
    group() {

    }

    //methods of the group class


    //add user to a group
    public void addUser(User user) {
        currentUsersInGroup.add(user);
    }

    //remove user from a group
    public void remove(String userName) {

        for (int i = 0; i < currentUsersInGroup.size(); i++) {
            if (currentUsersInGroup.get(i).getName() == userName) {//TODO error
                currentUsersInGroup.remove(i);
                break;
            }
        }
    }

    //display group members
    public void allGroupMembersRightNow() {
        for (int i = 0; i < currentUsersInGroup.size(); i++) {
            String name = currentUsersInGroup.get(i).getName();
            System.out.println(name + " is present");
        }
    }

    //set group transcation amount
    private void setGroupExpense(double amount) {
        System.out.println("State your group expense");
        //Scanner sc = new Scanner(System.in);
        //double x = sc.nextDouble();
        //this.groupExpense += x;
    }

    //display group_expense at any moment
    void displayCurrentGroupExpense() {
        System.out.println("Total Group Expense is " + totalGroupExpense + " right now!");
    }

    // show credit debit for users in group
    void displayCreditDebitTable() {
        for (int i = 0; i < currentUsersInGroup.size(); i++) {
            User user = currentUsersInGroup.get(i);
            //get this users name debit and credit
            String name = user.getName();
            int credit = user.getCredit();
            int debit = user.getDebit();

            //print these values
            System.out.println("User name : " + name);
            System.out.println(name + "'s debit : " + debit);
            System.out.println(name + "'s credit : " + credit);
            System.out.println();

        }
    }

    //someone paid // take input as pairs /map
    void settlement() {
        //if i take input here it gives me error ask doubt
        //if i take input here it gives me error ask doubt
        String match;
        int amount;

        //TODO settle amounts from various users by taking input
        Scanner sc = new Scanner(System.in);
        match = sc.next();
        amount = sc.nextInt();

        int i;
        for (i = 0; i < currentUsersInGroup.size(); i++) {

            if (currentUsersInGroup.get(i).getName().equals(match)) {
                System.out.println(match + " paid " + amount + " to the expense");
                System.out.println();
                break;
            }
        }


        currentUsersInGroup.get(i).setCredit(amount);

        this.totalGroupExpense -= amount;
    }

    @Override
    public List<User> getUsers() {
        return currentUsersInGroup;
    }

    @Override
    public void processDistribution(Expense expense, IShareDebit distributionStrategy) {
        /// take the expense ar argument
        // check if the expense.users == current users in group
        // if true
        //// store expense object in list of expense objects

        distributionStrategy.splitMoney(expense, currentUsersInGroup);
    }
}
