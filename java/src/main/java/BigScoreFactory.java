public class BigScoreFactory {

    public static Score buildScore(int m_score1, int m_score2) {
        if (m_score1 == m_score2) {
            return new SameScore(m_score1, m_score2);
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            return new AdvantageScore(m_score1, m_score2);
        } else {
            return new StandardScore(m_score1, m_score2);
        }
    }
}
