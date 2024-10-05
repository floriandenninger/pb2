package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awjd implements aonq {
    PLAYLIST_THUMBNAIL_STYLE_UNKNOWN(0),
    PLAYLIST_THUMBNAIL_STYLE_FIRST_VIDEO(1),
    PLAYLIST_THUMBNAIL_STYLE_TWO_BY_TWO(2),
    PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO_AVATAR(3),
    PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO(4);

    public final int f;

    awjd(int i) {
        this.f = i;
    }

    public static aons a() {
        return aweb.m;
    }

    public static awjd b(int i) {
        if (i == 0) {
            return PLAYLIST_THUMBNAIL_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return PLAYLIST_THUMBNAIL_STYLE_FIRST_VIDEO;
        }
        if (i == 2) {
            return PLAYLIST_THUMBNAIL_STYLE_TWO_BY_TWO;
        }
        if (i == 3) {
            return PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO_AVATAR;
        }
        if (i != 4) {
            return null;
        }
        return PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO;
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
