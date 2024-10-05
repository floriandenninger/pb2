package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aouq implements aonq {
    ACCOUNT_SELECTOR_EVENT_TYPE_UNKNOWN(0),
    ACCOUNT_SELECTOR_EVENT_TYPE_AUTO(1);

    public final int c;

    aouq(int i) {
        this.c = i;
    }

    public static aons a() {
        return aouo.c;
    }

    public static aouq b(int i) {
        if (i == 0) {
            return ACCOUNT_SELECTOR_EVENT_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return ACCOUNT_SELECTOR_EVENT_TYPE_AUTO;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
