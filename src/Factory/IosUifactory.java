package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.IosButton;
import Factory.Components.Button.Menu.IosMenu;
import Factory.Components.Button.Menu.Menu;

public class IosUifactory implements UiFactory{
    @Override
    public Button CreateButton() {
        return new IosButton();
    }

    @Override
    public Menu CreateMenu() {
        return new IosMenu();
    }


}
