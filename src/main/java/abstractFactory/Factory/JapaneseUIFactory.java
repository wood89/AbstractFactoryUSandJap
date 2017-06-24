package abstractFactory.Factory;

import abstractFactory.Implementation.JapaneseHelpImpl;
import abstractFactory.Implementation.JapaneseImagesImpl;
import abstractFactory.Implementation.JapaneseLocaleImpl;
import abstractFactory.UIInterfaces.Help;
import abstractFactory.UIInterfaces.Images;
import abstractFactory.UIInterfaces.Locate;

public class JapaneseUIFactory implements UIAbstractFactory {
    public Help getHelp(){
        return new JapaneseHelpImpl();
    }
    public Images getImages(){
        return new JapaneseImagesImpl();
    }
    public Locate getLocale(){
        return new JapaneseLocaleImpl();
    }
}
