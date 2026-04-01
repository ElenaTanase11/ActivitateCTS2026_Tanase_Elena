//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        AudioGuide audio1 = new AudioGuide("Romana", 80);
        AudioGuide audio2 = new AudioGuide("Engleza", 100);

        AudioGuideRegistry.register("A1", audio1);
        AudioGuideRegistry.register("A2", audio2);

        AudioGuide audioCautat = AudioGuideRegistry.getAudioGuide("A1");

        System.out.println(audioCautat.getDuration());
        System.out.println(audioCautat.getLanguage());
    }
}