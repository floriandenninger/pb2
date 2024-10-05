package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aotk implements aonq {
    ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED(0),
    CLOSE(1),
    SKIP_AD(2),
    SKIP_AD_ON_CLOSE(3);

    private final int f;

    aotk(int i) {
        this.f = i;
    }

    public static aons a() {
        return aokr.s;
    }

    public static aotk b(int i) {
        if (i == 0) {
            return ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return CLOSE;
        }
        if (i == 2) {
            return SKIP_AD;
        }
        if (i != 3) {
            return null;
        }
        return SKIP_AD_ON_CLOSE;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
