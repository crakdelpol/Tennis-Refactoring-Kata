public class SameScore implements Score {

    private final int m_score1;
    private final int m_score2;

    public SameScore(int m_score1, int m_score2) {
        this.m_score1 = m_score1;
        this.m_score2 = m_score2;
    }

    @Override
    public String retrieveName() {
        String score;
        switch (m_score1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}