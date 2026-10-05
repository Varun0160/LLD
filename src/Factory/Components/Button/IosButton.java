package Factory.Components.Button;

public class IosButton implements Button {
    @Override
    public void CreateButton() {
        System.out.println("Create IosButton");
    }
}
