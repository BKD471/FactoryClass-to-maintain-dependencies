public class SpeakerFactory {

    public Spekers getSpeakers(String speaker) {
        if (speaker == null) return null;
        if (speaker.equalsIgnoreCase("BO")) return new BoseSPeakers();
        else if (speaker.equalsIgnoreCase("Bose")) return new BOSpeakers();
        return null;
    }
}
