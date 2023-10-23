package all_assignments.Inheritance;

public class Iphone extends Mobile {
    int screen;
    String version;

    Iphone(int screen, String version){
        super("iphone", 256);
        this.screen = screen;
        this.version = version;
    }
    public void print(){
        System.out.println("ScreenSize :"+screen);
        System.out.println("version :"+version);
    }

}
