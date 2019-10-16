package TestBoi;

import java.util.ArrayList;
import java.util.Date;


class Main {
    public static void main(String[] args) {
        AudioPlayer newAudioProduct = new AudioPlayer("DP-X1A", "Onkyo",
                "DSD/FLAC/ALAC/WAV/AIFF/MQA/Ogg-Vorbis/MP3/AAC", "M3U/PLS/WPL");
        Screen newScreen = new Screen("720x480", 40, 22);
        MoviePlayer newMovieProduct = new MoviePlayer("DBPOWER MK101", "OracleProduction", newScreen, MonitorType.LCD);
        ArrayList<MultimediaControl> productList = new ArrayList<MultimediaControl>();
        productList.add(newAudioProduct);
        productList.add(newMovieProduct);
        for (MultimediaControl p : productList) {
            System.out.println(p);
            p.play();
            p.stop();
            p.next();
            p.previous();
        }
        // test constructor used when creating production records from user interface
        Integer numProduced = 3;  // this will come from the combobox in the UI

        for (int productionRunProduct = 0; productionRunProduct < numProduced; productionRunProduct++) {
            ProductionRecord pr = new ProductionRecord(0,0,"0", new Date());
            System.out.println(pr.toString());
        }

        // test constructor used when creating production records from reading database
        ProductionRecord pr = new ProductionRecord(0, 3, "1", new Date());
        System.out.println(pr.toString());

        // testing accessors and mutators
        pr.setProductionNum(1);
        System.out.println(pr.getProductionNum());

        pr.setProductID(4);
        System.out.println(pr.getProductID());

        pr.setSerialNum("2");
        System.out.println(pr.getSerialNum());

        pr.setProdDate(new Date());
        System.out.println(pr.getProdDate());
    }
}