public class StandardScore implements Score{

    private final int m_score1;
    private final int m_score2;

    public StandardScore(int m_score1, int m_score2) {
        this.m_score1 = m_score1;
        this.m_score2 = m_score2;
    }

    @Override
    public String retrieveName() {
        String score = "";
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = m_score1;
            else {
                score += "-";
                tempScore = m_score2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}