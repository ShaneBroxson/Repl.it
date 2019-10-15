package TestBoi;

import java.util.Arrays;

public class MoviePlayer extends Product implements MultimediaControl {
    private Screen screen;
    private MonitorType monitorType;


    public MoviePlayer(String n, String m, Screen scr, MonitorType mon) {
        super(n, m, "VISUAL");
        monitorType = mon;
        screen = scr;
    }

    public void play() {
        System.out.println("Playing Movie");
    }

    public void stop() {
        System.out.println("Stopping Movie");
    }

    public void previous() {
        System.out.println("Previous Movie");
    }

    public void next() {
        System.out.println("Next Movie");
    }

    public String toString() {
        return super.toString() + "\nScreen\n" + screen.toString() + "\nMonitor Type: " + monitorType.toString();
    }

}
