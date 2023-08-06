package net.media.training.designpattern.solutions.abstractfactory;

public interface Case {
    public void attachMotherBoard(MotherBoard motherBoard);
    public void attachScreen(Screen screen);
    public Screen getScreen();

    public MotherBoard getMotherBoard();

    public Processor getProcessor();

    public Battery getBattery();
}
