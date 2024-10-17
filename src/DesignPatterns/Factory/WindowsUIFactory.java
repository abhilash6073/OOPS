package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button.Button;
import DesignPatterns.Factory.Components.Button.WindowsButton;
import DesignPatterns.Factory.Components.Dropdown.Dropdown;
import DesignPatterns.Factory.Components.Dropdown.WindowsDropdown;
import DesignPatterns.Factory.Components.Menu.Menu;
import DesignPatterns.Factory.Components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
