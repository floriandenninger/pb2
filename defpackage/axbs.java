package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axbs implements aonq {
    CHANNEL_MENTION_STYLE_UNSPECIFIED(0),
    CHANNEL_MENTION_NORMAL(1),
    CHANNEL_MENTION_LIGHT(2);

    public final int d;

    axbs(int i) {
        this.d = i;
    }

    public static aons a() {
        return awwu.p;
    }

    public static axbs b(int i) {
        if (i == 0) {
            return CHANNEL_MENTION_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return CHANNEL_MENTION_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return CHANNEL_MENTION_LIGHT;
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
