package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button.Button;
import DesignPatterns.Factory.Components.Dropdown.Dropdown;
import DesignPatterns.Factory.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.WINDOWS);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
        Button button = uiFactory.createButton();
    }
}

//Steps for adding a new platform say MacOS
//Enum - add MacOS to SupportedPlatform Enum
//Create components for MacOS
//Create MacOSUIFactory which implements the UIFactory interface
//Update the switch case

