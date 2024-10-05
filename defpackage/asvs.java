package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asvs implements aonq {
    MAIN_APP_BROWSE_CACHE_EVENT_UNKNOWN(0),
    MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_CONSIDERED(1),
    MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_PERFORMED(2),
    MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_DECLINED(3);

    private static final aonr e = new ancw(3);
    private final int g;

    asvs(int i) {
        this.g = i;
    }

    public static aons a() {
        return assi.s;
    }

    public static asvs b(int i) {
        if (i == 0) {
            return MAIN_APP_BROWSE_CACHE_EVENT_UNKNOWN;
        }
        if (i == 1) {
            return MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_CONSIDERED;
        }
        if (i == 2) {
            return MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_PERFORMED;
        }
        if (i != 3) {
            return null;
        }
        return MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_DECLINED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
