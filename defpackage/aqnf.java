package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqnf implements aonq {
    FILTER_TYPE_UNSPECIFIED(0),
    FILTER_TYPE_NONE(1),
    FILTER_TYPE_PLAYLISTS_ONLY(2),
    FILTER_TYPE_VIDEOS_ONLY(3);

    public final int e;

    aqnf(int i) {
        this.e = i;
    }

    public static aons a() {
        return aqkw.k;
    }

    public static aqnf b(int i) {
        if (i == 0) {
            return FILTER_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return FILTER_TYPE_NONE;
        }
        if (i == 2) {
            return FILTER_TYPE_PLAYLISTS_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return FILTER_TYPE_VIDEOS_ONLY;
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
