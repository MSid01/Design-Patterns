package net.media.training.designpattern.solutions.abstractfactory;

public interface MotherBoard {
    public void attachBattery(Battery battery);
    public void attachProcessor(Processor processor);
    public String State();

    public Processor getProcessor();

    public Battery getBattery();

}
