package abstractFactory;

import abstractFactory.Factory.JapaneseUIFactory;
import abstractFactory.Factory.UIAbstractFactory;
import abstractFactory.Factory.USUIFactory;
import abstractFactory.UIInterfaces.Locate;
import abstractFactory.UIInterfaces.Help;
import abstractFactory.UIInterfaces.Images;

public class TestClient {
    public void run(String countryId){//Параметр определяет страну
        UIAbstractFactory uiFactory = null; //Инициализируем фабрику
        if(countryId.equals("JP"))
            uiFactory = new JapaneseUIFactory(); // Создаем фабрику UI для Японии
        if(countryId.equals("US"))
            uiFactory = new USUIFactory(); // Создаем фабрику для США

        if(uiFactory != null){
            Help help = uiFactory.getHelp(); //Справка
            log("help created for: " + help.getHelpCountry());

            Images images = uiFactory.getImages(); // Баннеры
            log("UI images created for: " + images.getImagesCountry());

            Locate locale = uiFactory.getLocale(); // Локализация
            log("UI locale created for: " + locale.getLocateCountry());
        }else{
            log("Wrong country id");
        }
    }

    private void log(String msg){
        System.out.println(msg);
    }
}
