public class AdvantageScore implements Score {

    private final int m_score1;
    private final int m_score2;

    public AdvantageScore(int m_score1, int m_score2) {
        this.m_score1 = m_score1;

        this.m_score2 = m_score2;
    }

    @Override
    public String retrieveName() {
        String score;
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}