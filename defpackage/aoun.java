package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aoun implements aonq {
    ACCOUNT_SELECTOR_EVENT_API_UNKNOWN(0),
    ACCOUNT_SELECTOR_EVENT_API_GET_SELECTION(1),
    ACCOUNT_SELECTOR_EVENT_API_USE_SELECTION(2);

    public final int d;

    aoun(int i) {
        this.d = i;
    }

    public static aons a() {
        return aouo.b;
    }

    public static aoun b(int i) {
        if (i == 0) {
            return ACCOUNT_SELECTOR_EVENT_API_UNKNOWN;
        }
        if (i == 1) {
            return ACCOUNT_SELECTOR_EVENT_API_GET_SELECTION;
        }
        if (i != 2) {
            return null;
        }
        return ACCOUNT_SELECTOR_EVENT_API_USE_SELECTION;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
