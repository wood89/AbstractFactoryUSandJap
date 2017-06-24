package abstractFactory.Factory;

import abstractFactory.Implementation.USHelpImpl;
import abstractFactory.Implementation.USImagesImpl;
import abstractFactory.Implementation.USLocalImpl;
import abstractFactory.UIInterfaces.Help;
import abstractFactory.UIInterfaces.Images;
import abstractFactory.UIInterfaces.Locate;

public class USUIFactory implements UIAbstractFactory {
    public Help getHelp() {
        return new USHelpImpl();
    }
    public Images getImages() {
        return new USImagesImpl();
    }
    public Locate getLocale() {
        return new USLocalImpl();
    }
}