package abstractFactory.Factory;

import abstractFactory.UIInterfaces.Help;
import abstractFactory.UIInterfaces.Images;
import abstractFactory.UIInterfaces.Locate;

public interface UIAbstractFactory {
    public Help getHelp();
    public Images getImages();
    public Locate getLocale();
}
