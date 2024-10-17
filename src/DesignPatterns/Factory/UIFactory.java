package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button.Button;
import DesignPatterns.Factory.Components.Dropdown.Dropdown;
import DesignPatterns.Factory.Components.Menu.Menu;

public interface UIFactory {

    //interface only has abstract methods
    //abstract factory will have all the abstract creation methods
    Menu createMenu();
    Dropdown createDropdown();
    Button createButton();

}
