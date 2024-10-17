package DesignPatterns.Factory;

public class Flutter {
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform){
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting some theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory(){
        //returns an object of UIFactory - either AndroidUIFactory or IOSUIFactory
        //depending on the choice of platform user makes
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
