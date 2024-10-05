package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axin implements aonq {
    NONE(0),
    FRAMERATE(1),
    DYNAMIC(2);

    public final int d;

    axin(int i) {
        this.d = i;
    }

    public static aons a() {
        return axcs.j;
    }

    public static axin b(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return FRAMERATE;
        }
        if (i != 2) {
            return null;
        }
        return DYNAMIC;
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
