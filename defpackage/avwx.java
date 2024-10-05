package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avwx implements aonq {
    EFFECT_SUBPACKAGE_ID_UNSPECIFIED(0),
    EFFECT_SUBPACKAGE_ID_EXPRESSIVE(1),
    EFFECT_SUBPACKAGE_ID_PRESET(2);

    public final int d;

    avwx(int i) {
        this.d = i;
    }

    public static aons a() {
        return avts.n;
    }

    public static avwx b(int i) {
        if (i == 0) {
            return EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        }
        if (i == 1) {
            return EFFECT_SUBPACKAGE_ID_EXPRESSIVE;
        }
        if (i != 2) {
            return null;
        }
        return EFFECT_SUBPACKAGE_ID_PRESET;
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
