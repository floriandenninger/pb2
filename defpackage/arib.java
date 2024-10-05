package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum arib implements aonq {
    INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN(0),
    INLINE_PLAYBACK_TRIGGER_STYLE_USER(1);

    private final int d;

    arib(int i) {
        this.d = i;
    }

    public static aons a() {
        return argn.g;
    }

    public static arib b(int i) {
        if (i == 0) {
            return INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return INLINE_PLAYBACK_TRIGGER_STYLE_USER;
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
