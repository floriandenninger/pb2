package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum akzv implements aonq {
    PRIVATE(0),
    PUBLIC(1),
    UNLISTED(2);

    public final int d;

    akzv(int i) {
        this.d = i;
    }

    public static akzv a(int i) {
        if (i == 0) {
            return PRIVATE;
        }
        if (i == 1) {
            return PUBLIC;
        }
        if (i != 2) {
            return null;
        }
        return UNLISTED;
    }

    public static aons b() {
        return aduo.j;
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
