package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button.Button;
import DesignPatterns.Factory.Components.Button.IOSButton;
import DesignPatterns.Factory.Components.Dropdown.Dropdown;
import DesignPatterns.Factory.Components.Dropdown.IOSDropdown;
import DesignPatterns.Factory.Components.Menu.IOSMenu;
import DesignPatterns.Factory.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
