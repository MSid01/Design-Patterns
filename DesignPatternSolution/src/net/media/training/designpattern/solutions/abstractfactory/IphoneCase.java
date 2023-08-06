package net.media.training.designpattern.solutions.abstractfactory;

public class IphoneCase implements Case{
    private MotherBoard motherBoard;
    private Screen screen;
    @Override
    public void attachMotherBoard(MotherBoard motherBoard) {
        if (motherBoard.State() != "running")
            throw new RuntimeException("Motherboard not functional");
        this.motherBoard = motherBoard;
    }

    @Override
    public void attachScreen(Screen screen) {
        this.screen =screen;
    }

    @Override
    public Screen getScreen() {
        return screen;
    }

    @Override
    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    @Override
    public Processor getProcessor() {
        return motherBoard.getProcessor();
    }

    @Override
    public Battery getBattery() {
        return motherBoard.getBattery();
    }
}
