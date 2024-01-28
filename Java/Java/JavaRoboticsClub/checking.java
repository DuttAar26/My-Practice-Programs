package JavaRoboticsClub;

public class checking extends bankAccount {
    private int Bal;
    public int paycheck() {
        Bal = Bal + 100;
        System.out.println(Bal);
        return Bal;
    }
    public int Bal() {
        return Bal;
    }
}
