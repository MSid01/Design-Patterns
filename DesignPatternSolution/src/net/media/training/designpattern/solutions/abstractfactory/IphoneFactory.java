package net.media.training.designpattern.solutions.abstractfactory;

public class IphoneFactory implements PhoneFactory{
    MotherBoard motherBoard;
    Screen screen;
    Case phoneCase;

    @Override
    public MotherBoard createMotherBoard() {
        this.motherBoard = new IphoneMotherBoard();
        this.motherBoard.attachBattery(new Battery());
        this.motherBoard.attachProcessor(new IphoneProcessor());
        return this.motherBoard;
    }

    @Override
    public Screen createScreen() {
        this.screen = new IphoneScreen();
        return this.screen;
    }

    @Override
    public Case createPhoneCase() {
        phoneCase = new IphoneCase();
        return phoneCase;
    }
}
