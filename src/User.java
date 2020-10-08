public final class User {
    private final String name;
    private final String email;
    private final String mobileNo;
    private int debit;
    private int credit;

    //more constructors could be created by overloading
    public User(String name, String mobileNo) {
        this.name = name;
        this.email = "default@gmail.com";
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return this.name;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(double x) {
        this.credit += x;
    }

    public int getDebit() {
        return this.debit;
    }

    public void setDebit(double x) {
        this.debit += x;
    }
}
