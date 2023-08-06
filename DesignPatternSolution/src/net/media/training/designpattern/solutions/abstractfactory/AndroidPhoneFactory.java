package net.media.training.designpattern.solutions.abstractfactory;

public class AndroidPhoneFactory implements PhoneFactory{
    MotherBoard motherBoard;
    Screen screen;
Case phoneCase;

    @Override
    public MotherBoard createMotherBoard() {
        this.motherBoard = new AndroidMotherBoard();
        this.motherBoard.attachBattery(new Battery());
        this.motherBoard.attachProcessor(new AndroidProcessor());
        return this.motherBoard;
    }

    @Override
    public Screen createScreen() {
        this.screen = new AndroidScreen();
        return this.screen;
    }

    @Override
    public Case createPhoneCase() {
        phoneCase = new AndroidCase();
        return phoneCase;
    }
}
