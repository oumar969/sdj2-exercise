public class Start {
    public static void main(String[] args) {
        SoccerMatch match = new SoccerMatch();
        match.addPropertyChangeListener(new DreamTeamFan());
        match.addPropertyChangeListener(new OldBoysFan());
        match.addPropertyChangeListener(new Referee());
        match.addPropertyChangeListener(new ScoreBoard());
        match.startMatch();

    }
}
