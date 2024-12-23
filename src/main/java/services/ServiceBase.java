package services;
import javax.persistence.EntityManager;

import utils.DBUtill;

/**
 * DB接続に関わる共通処理を行うクラス
 */
public class ServiceBase {
    /**
     * EntityManagerインスタンス
     */
    protected EntityManager em = DBUtill.createEntityManager();

    /**
     * EntityManagerのクローズ
     */
    public void close() {
        if (em.isOpen()) {
            em.close();
        }
    }
}
