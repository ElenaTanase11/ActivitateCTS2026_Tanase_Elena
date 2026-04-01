public class AudioGuide implements IAudioGuide{
    private String language;
    private int duration;

    public AudioGuide(String language, int duration) {
        this.language = language;
        this.duration = duration;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public int getDuration() {
        return duration;
    }
}
