package com.demoapp.api.context;

public class CallContext {
    private static final ThreadLocal<CallContext> Ongoing = ThreadLocal.withInitial(CallContext::new);

    private String userId;
    private boolean isAdmin;

    public static CallContext Ongoing() {
        return Ongoing.get();
    }

    public static void clear() {
        Ongoing.remove();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
