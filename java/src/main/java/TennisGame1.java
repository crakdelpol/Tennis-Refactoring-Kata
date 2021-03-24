
public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            this.m_score1 = m_score1 + 1;
        } else
            this.m_score2 = m_score2 + 1;
    }

    public String getScore() {
        return BigScoreFactory.buildScore(m_score1, m_score2).retrieveName();
    }
}
