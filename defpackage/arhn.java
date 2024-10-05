package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum arhn implements aonq {
    INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN(0),
    INLINE_AUDIO_CONTROL_UI_STYLE_PER_PLAYER(1),
    INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED(2),
    INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_WITH_CAPTION_CONTROL(3),
    INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION(4),
    INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION(5);

    private final int h;

    arhn(int i) {
        this.h = i;
    }

    public static aons a() {
        return argn.d;
    }

    public static arhn b(int i) {
        if (i == 0) {
            return INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return INLINE_AUDIO_CONTROL_UI_STYLE_PER_PLAYER;
        }
        if (i == 2) {
            return INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED;
        }
        if (i == 3) {
            return INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_WITH_CAPTION_CONTROL;
        }
        if (i == 4) {
            return INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION;
        }
        if (i != 5) {
            return null;
        }
        return INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION;
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
