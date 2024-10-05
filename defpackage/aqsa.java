package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqsa implements aonq {
    EMBEDS_AD_BREAK_TYPE_UNKNOWN(0),
    EMBEDS_AD_BREAK_TYPE_PRE_ROLL(1),
    EMBEDS_AD_BREAK_TYPE_MID_ROLL(2),
    EMBEDS_AD_BREAK_TYPE_POST_ROLL(3);

    public final int e;

    aqsa(int i) {
        this.e = i;
    }

    public static aons a() {
        return aqkw.t;
    }

    public static aqsa b(int i) {
        if (i == 0) {
            return EMBEDS_AD_BREAK_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return EMBEDS_AD_BREAK_TYPE_PRE_ROLL;
        }
        if (i == 2) {
            return EMBEDS_AD_BREAK_TYPE_MID_ROLL;
        }
        if (i != 3) {
            return null;
        }
        return EMBEDS_AD_BREAK_TYPE_POST_ROLL;
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
