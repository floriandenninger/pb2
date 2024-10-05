package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum dvh implements aonq {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);

    public final int d;

    dvh(int i) {
        this.d = i;
    }

    public static dvh a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return DISABLED;
    }

    public static aons b() {
        return dvg.a;
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
