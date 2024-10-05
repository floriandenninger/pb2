package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum amjl implements aonq {
    UNKNOWN(0),
    REALTIME(1),
    UPTIME(2);

    public final int d;

    amjl(int i) {
        this.d = i;
    }

    public static amjl a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return REALTIME;
        }
        if (i != 2) {
            return null;
        }
        return UPTIME;
    }

    public static aons b() {
        return aduo.n;
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
