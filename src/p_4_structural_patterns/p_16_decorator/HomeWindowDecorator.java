package p_4_structural_patterns.p_16_decorator;

public abstract class HomeWindowDecorator implements IHomePart{

    private IHomePart homeWindow = new HomeWindowImpl();

    public IHomePart getHomeWindow() {
        return homeWindow;
    }

    public void setHomeWindow(IHomePart homeWindow) {
        this.homeWindow = homeWindow;
    }
}
