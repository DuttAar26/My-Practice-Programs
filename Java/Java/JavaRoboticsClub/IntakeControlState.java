package JavaRoboticsClub;

public class IntakeControlState {
    enum Instances {
        OFF (0, false),
        ON (1, true),
        OUTAKE (-10, false),
        RETRACT (10, true);
        int speed = 0;
        boolean Deploy = false;
        private Instances(int speed, boolean Deploy) {
            this.speed = speed;
            this.Deploy = Deploy;
        }
    }
    
    public static void main (String[] args) {

    }
    

}
