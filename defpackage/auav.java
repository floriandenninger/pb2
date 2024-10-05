package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum auav implements aonq {
    PAGE_SOURCE_UNKNOWN(0),
    PAGE_SOURCE_PLAYLIST_SUGGESTIONS(1);

    private final int d;

    auav(int i) {
        this.d = i;
    }

    public static aons a() {
        return atxj.n;
    }

    public static auav b(int i) {
        if (i == 0) {
            return PAGE_SOURCE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return PAGE_SOURCE_PLAYLIST_SUGGESTIONS;
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
