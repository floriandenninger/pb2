package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aric implements aonq {
    INLINE_SCRUBBING_UI_STYLE_UNKNOWN(0),
    INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER(1),
    INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD(2),
    INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_PEEK_ONLY(3),
    INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_ENHANCED_STORYBOARDCARD_PEEK_ONLY(4),
    INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_FULLSIZE_STORYBOARDCARD(5),
    INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_LIFTED(6),
    INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_FULL_LOCKUP(7);

    private final int j;

    aric(int i2) {
        this.j = i2;
    }

    public static aons a() {
        return argn.h;
    }

    public static aric b(int i2) {
        switch (i2) {
            case 0:
                return INLINE_SCRUBBING_UI_STYLE_UNKNOWN;
            case 1:
                return INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER;
            case 2:
                return INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD;
            case 3:
                return INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_PEEK_ONLY;
            case 4:
                return INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_ENHANCED_STORYBOARDCARD_PEEK_ONLY;
            case 5:
                return INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_FULLSIZE_STORYBOARDCARD;
            case 6:
                return INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_LIFTED;
            case 7:
                return INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_FULL_LOCKUP;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
