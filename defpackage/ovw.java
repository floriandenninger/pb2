package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum ovw implements aonq {
    TRACK_TYPE_AUDIO(1),
    TRACK_TYPE_VIDEO(2),
    TRACK_TYPE_TEXT(4);

    public final int d;

    ovw(int i) {
        this.d = i;
    }

    public static ovw a(int i) {
        if (i == 1) {
            return TRACK_TYPE_AUDIO;
        }
        if (i == 2) {
            return TRACK_TYPE_VIDEO;
        }
        if (i != 4) {
            return null;
        }
        return TRACK_TYPE_TEXT;
    }

    public static aons b() {
        return dvg.l;
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
