package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum augr implements aonq {
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN(0),
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_NOOP(1),
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE(2),
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_ACTION_WEBSITE_URL(3),
    PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_CHANNEL(4);

    private final int g;

    augr(int i) {
        this.g = i;
    }

    public static aons a() {
        return aufb.i;
    }

    public static augr b(int i) {
        if (i == 0) {
            return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_NOOP;
        }
        if (i == 2) {
            return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE;
        }
        if (i == 3) {
            return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_ACTION_WEBSITE_URL;
        }
        if (i != 4) {
            return null;
        }
        return PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_CHANNEL;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
