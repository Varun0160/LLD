package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.Menu.Menu;

interface UiFactory {
    public Button CreateButton();
    public Menu CreateMenu();

}
