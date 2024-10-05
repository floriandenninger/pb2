package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum arhr implements aonq {
    INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN(0),
    INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_DEFAULT(1),
    INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_MAXIMIZED_WATCH_ON_EXIT(2);

    private final int e;

    arhr(int i) {
        this.e = i;
    }

    public static aons a() {
        return argn.f;
    }

    public static arhr b(int i) {
        if (i == 0) {
            return INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_MAXIMIZED_WATCH_ON_EXIT;
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
