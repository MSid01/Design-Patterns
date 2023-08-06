package net.media.training.designpattern.solutions.abstractfactory;

public class IphoneMotherBoard implements MotherBoard{
    private Battery battery;
    private String state;
    private Processor processor;
    @Override
    public void attachBattery(Battery battery) {
        this.battery = this.battery;
    }

    @Override
    public void attachProcessor(Processor processor) {
        if (battery == null)
            throw new RuntimeException("Cant attach processor without attaching battery");
        this.processor = processor;
        this.state = "running";
    }

    @Override
    public String State() {
        return null;
    }

    @Override
    public Processor getProcessor() {
        return null;
    }

    @Override
    public Battery getBattery() {
        return null;
    }
}
