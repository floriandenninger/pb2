package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axbw implements aonq {
    COMMENT_STICKER_SOURCE_UNKNOWN(0),
    COMMENT_STICKER_SOURCE_STORY_COMMENTS(1),
    COMMENT_STICKER_SOURCE_VOD_COMMENTS(2),
    COMMENT_STICKER_SOURCE_STORY_CAMERA(3);

    public final int e;

    axbw(int i) {
        this.e = i;
    }

    public static aons a() {
        return awwu.q;
    }

    public static axbw b(int i) {
        if (i == 0) {
            return COMMENT_STICKER_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return COMMENT_STICKER_SOURCE_STORY_COMMENTS;
        }
        if (i == 2) {
            return COMMENT_STICKER_SOURCE_VOD_COMMENTS;
        }
        if (i != 3) {
            return null;
        }
        return COMMENT_STICKER_SOURCE_STORY_CAMERA;
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
