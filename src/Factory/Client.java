package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.Menu.Menu;

public class Client {
    public static void main(String[] args) {
       Flutter flutter = new Flutter();
       UiFactory ui=flutter.getUiFactory("Android");
        Button b=ui.CreateButton();
        b.CreateButton();
        Menu menu=ui.CreateMenu();
        menu.CreateMenu();

    }

}
