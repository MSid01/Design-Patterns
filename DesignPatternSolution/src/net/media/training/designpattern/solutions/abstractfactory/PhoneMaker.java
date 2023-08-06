package net.media.training.designpattern.solutions.abstractfactory;

public class PhoneMaker {
    PhoneFactory factory;
    MotherBoard motherBoard;
    Screen screen;
    Case phoneCase;
    PhoneMaker(PhoneFactory factory){
        this.factory = factory;
    }

public Case buildPhone(){
    motherBoard =factory.createMotherBoard();
    screen = factory.createScreen();
    phoneCase = factory.createPhoneCase();
    return phoneCase;
}

}
