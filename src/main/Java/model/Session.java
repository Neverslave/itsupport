package model;



import model.base.BaseSession;

public class Session extends BaseSession<Session> {
    private static final long serialVersionUID = 1L;
    public static final Session dao = new Session().dao();

    /**
     * 登录会话是否已过期
     */
    public boolean isExpired() {
        return getExpireAt() < System.currentTimeMillis();
    }

    /**
     * 登录会话是否未过期
     */
    public boolean notExpired() {
        return ! isExpired();
    }

}



