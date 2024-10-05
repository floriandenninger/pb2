package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awje implements aonq {
    PLAYLIST_VISIBILITY_UNKNOWN(0),
    PLAYLIST_VISIBILITY_PUBLIC(1),
    PLAYLIST_VISIBILITY_PRIVATE(2),
    PLAYLIST_VISIBILITY_UNLISTED(3);

    private final int f;

    awje(int i) {
        this.f = i;
    }

    public static aons a() {
        return aweb.n;
    }

    public static awje b(int i) {
        if (i == 0) {
            return PLAYLIST_VISIBILITY_UNKNOWN;
        }
        if (i == 1) {
            return PLAYLIST_VISIBILITY_PUBLIC;
        }
        if (i == 2) {
            return PLAYLIST_VISIBILITY_PRIVATE;
        }
        if (i != 3) {
            return null;
        }
        return PLAYLIST_VISIBILITY_UNLISTED;
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
