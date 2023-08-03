package solid.live.srp;

public class LeaveInformation {
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;

    private int[] leavesLeftPreviously;

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }
}
