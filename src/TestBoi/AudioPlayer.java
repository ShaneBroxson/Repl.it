package TestBoi;

public class AudioPlayer extends Product implements MultimediaControl {
    private String audioSpecification;
    private String mediaType;

    AudioPlayer(String n, String m, String audioSpecification, String mediaType) {
        super(n, m, "Audio");
        this.audioSpecification = audioSpecification;
        this.mediaType = mediaType;
    }

    public void play() {
        System.out.println("Playing");
    }

    public void stop() {
        System.out.println("Stopping");
    }

    public void previous() {
        System.out.println("Previous");
    }

    public void next() {
        System.out.println("Next");
    }

    public String toString() {
        return super.toString() + "\nSupported Audio Formats: " + audioSpecification + "\nSupported Playlist Formats: " + mediaType;
    }
}
