package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aver implements aonq {
    SCREEN_UNKNOWN(0),
    SCREEN_HOME_FEED(1);

    public final int c;

    aver(int i) {
        this.c = i;
    }

    public static aons a() {
        return avcl.k;
    }

    public static aver b(int i) {
        if (i == 0) {
            return SCREEN_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return SCREEN_HOME_FEED;
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
