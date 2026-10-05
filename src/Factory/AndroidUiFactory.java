package Factory;

import Factory.Components.Button.AndroidButton;
import Factory.Components.Button.Button;
import Factory.Components.Button.Menu.AndroidMenu;
import Factory.Components.Button.Menu.Menu;

public class AndroidUiFactory implements UiFactory{


    @Override
    public Button CreateButton() {
        return new AndroidButton();
    }

    @Override
    public Menu CreateMenu() {
       return new AndroidMenu();
    }
}
