package abstractFactory.Implementation;

import abstractFactory.UIInterfaces.Locate;

public class JapaneseLocaleImpl implements Locate {
    public String getLocateCountry(){
        return "Japan";
    }
}
