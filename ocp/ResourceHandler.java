package solid.live.ocp;

public interface ResourceHandler {
    int findFreeSlot();
    void markSlotBusy(int resourceId);
    void markSlotFree(int resourceId);
}
