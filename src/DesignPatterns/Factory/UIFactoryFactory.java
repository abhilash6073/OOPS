package DesignPatterns.Factory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform platform){
        return switch (platform){
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}
