package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awwg implements aonq {
    UNKNOWN(0),
    UNMETERED_WIFI(1),
    UNMETERED_WIFI_OR_UNMETERED_MOBILE(2),
    ANY(3);

    public final int e;

    awwg(int i) {
        this.e = i;
    }

    public static aons a() {
        return awnx.u;
    }

    public static awwg b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UNMETERED_WIFI;
        }
        if (i == 2) {
            return UNMETERED_WIFI_OR_UNMETERED_MOBILE;
        }
        if (i != 3) {
            return null;
        }
        return ANY;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
