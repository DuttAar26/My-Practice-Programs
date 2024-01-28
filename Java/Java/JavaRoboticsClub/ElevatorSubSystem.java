package JavaRoboticsClub;

enum Elevator {
    UP (12, 5, true, "red"),
    DOWN (23, 6, true, "blue"),
    OFF (0, 0,  false, "green");
    int speed = 0;
    int position = 0;
    boolean isMoving = false;
    String elevatorColor;
    private Elevator (int speed, int position, boolean isMoving, String elevatorColor) {
        this.speed = speed;
        this.position = position;
        this.isMoving = isMoving;
        this.elevatorColor = elevatorColor;
    }
    
    public String getColor() {
        return this.elevatorColor;
    }

    public int getSpeed() {
        return this.speed;
    }
    
    public int getPosition() {
        return this.position;
    }

    public boolean getisMoving() {
        return this.isMoving;
    }
}
public class ElevatorSubSystem {
    public static void main (String[] args) {
        Elevator elevator = Elevator.UP;
        System.out.println(elevator.getColor());
        System.out.println(elevator.getSpeed());
        System.out.println(elevator.getPosition());
        System.out.println(elevator.getisMoving());

        System.out.println("");

        Elevator elevator2 = Elevator.DOWN;
        System.out.println(elevator2.getColor());
        System.out.println(elevator2.getSpeed());
        System.out.println(elevator2.getPosition());
        System.out.println(elevator2.getisMoving());
        
        System.out.println("");

        Elevator elevator3 = Elevator.OFF;
        System.out.println(elevator3.getColor());
        System.out.println(elevator3.getSpeed());
        System.out.println(elevator3.getPosition());
        System.out.println(elevator3.getisMoving());
    }
    private Elevator elevator;

    private ElevatorSubSystem (Elevator elevator) {
        this.elevator = elevator;
    }

    
    
    private static ElevatorSubSystem instance = null;          
    public static ElevatorSubSystem getInstance() {
        if (instance == null) {
            instance = new ElevatorSubSystem(Elevator.OFF);
        }
        return instance;
    }
    
    
}