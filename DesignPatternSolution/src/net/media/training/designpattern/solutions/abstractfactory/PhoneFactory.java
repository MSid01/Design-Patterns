package net.media.training.designpattern.solutions.abstractfactory;

public interface PhoneFactory {
    MotherBoard createMotherBoard();
    Screen createScreen();
    Case createPhoneCase();
}
