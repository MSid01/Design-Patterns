package solid.live.ocp;

public class TimeSlotHandler implements ResourceHandler{
        @Override
        public int findFreeSlot() {
            return 0;
        }

        @Override
        public void markSlotBusy(int resourceId) {
        }

        @Override
        public void markSlotFree(int resourceId) {
        }
    }

