package TestBoi;

public class Screen implements ScreenSpec {
    private String resolution;
    private int refreshrate;
    private int responsetime;

    Screen(String reso, int refr, int resp) {
        resolution = reso;
        refreshrate = refr;
        responsetime = resp;
    }

    public String toString() {
        return "Resolution: " + resolution + "\nRefreshrate: " + refreshrate + "\nResponsetime: " + responsetime;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshrate;
    }

    @Override
    public int getResponseTime() {
        return responsetime;
    }
}
