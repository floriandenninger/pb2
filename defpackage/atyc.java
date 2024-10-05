package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atyc implements aonq {
    UNKNOWN(0),
    OFF(1),
    ON(2),
    FORCED_ON(3),
    ON_WEAK(4),
    OFF_WEAK(5);

    private final int h;

    atyc(int i) {
        this.h = i;
    }

    public static aons a() {
        return atxj.i;
    }

    public static atyc b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OFF;
        }
        if (i == 2) {
            return ON;
        }
        if (i == 3) {
            return FORCED_ON;
        }
        if (i == 4) {
            return ON_WEAK;
        }
        if (i != 5) {
            return null;
        }
        return OFF_WEAK;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
