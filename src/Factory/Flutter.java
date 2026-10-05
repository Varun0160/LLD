package Factory;

import Factory.Components.Button.Menu.AndroidMenu;

public class Flutter {
    public void Refresh(){
        System.out.println("Flutter Refresh");
    }
    void setTheme(){
        System.out.println("Flutter Theme");
    }
    public UiFactory getUiFactory(String type){
        if(type.equals("Android")){
            return new AndroidUiFactory();
        }else if(type.equals("Ios")){
            return new IosUifactory();
        }
        return null;
    }
}
