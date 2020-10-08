import java.util.ArrayList;
import java.util.List;


public class SplitWise {

    public static void main(String[] args) {
        // create some users
        User user1 = new User("mainak", "9899971695");// create first user
        User user2 = new User("lala", "9899971696");// create second user
        User user3 = new User("yash", "9899971697");// create third user
        User user4 = new User("anurag", "9899971690");
        User user5 = new User("akash", "9899971693");

        //create a group object

        group g1 = new group();
        g1.addUser(user1);//add user1
        g1.addUser(user2);//add user2
        g1.addUser(user3);//add user3
        g1.addUser(user4);//add user4
        g1.addUser(user5);//add user5

        System.out.println(" number of users in g1 group are " + g1.getUsers().size());
        g1.remove("yash");
        System.out.println(" number of users in g1 group are " + g1.getUsers().size());

        //print all group members
        g1.allGroupMembersRightNow();


        // involve money now
        //group expense: group ko itne paise dene hain
        //*************
        //g1.setGroupExpense();
        g1.displayCurrentGroupExpense();

        List<User> usersInEx1 = new ArrayList<User>();
        usersInEx1.add(user1);
        usersInEx1.add(user2);
        Expense ex1 = new Expense(usersInEx1, 50);

        //process the amount of the group
        g1.processDistribution(ex1, new Equal());//******************************
        //***************
        // g1.displayCreditDebitTable();

        //g1.paid();//someone paid something for the group_expense

        // g1.displayCreditDebitTable();to check changes

        //suppose there is an inter_group_transaction
        // best way is to create new group


        //g1.interTransaction("mainak","lala",100);
        //g1.displayCreditDebitTable();


    }
}















