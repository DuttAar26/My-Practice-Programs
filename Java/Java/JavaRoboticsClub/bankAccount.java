package JavaRoboticsClub;

public class bankAccount {
    public static void main (String[] args) {
        checking a = new checking();
        savings b = new savings();
        bankAccount c = new bankAccount();
        a.Bal();
        System.out.println(a.paycheck());
        System.out.println(c.deposit(360));

    }
    public double deposit(int money) {
        checking a = new checking();
        System.out.println(a.Bal() + money);
        return a.Bal() + money;
    }
    public double withdraw(int money) {
        checking a = new checking();
        System.out.println(a.Bal() - money);
        return a.Bal() - money;
    }
    public double checkbal() {
        checking a = new checking();
        System.out.println(a.Bal());
        return a.Bal();
    }
    

}
