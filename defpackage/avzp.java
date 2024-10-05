package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avzp implements aonq {
    UNKNOWN(0),
    WIFI(1),
    CELLULAR(2);

    private final int e;

    avzp(int i) {
        this.e = i;
    }

    public static aons a() {
        return avya.c;
    }

    public static avzp b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return WIFI;
        }
        if (i != 2) {
            return null;
        }
        return CELLULAR;
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
