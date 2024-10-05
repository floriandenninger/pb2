package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avtj implements aonq {
    UPLOAD_CONTENT_SOURCE_UNKNOWN(0),
    UPLOAD_CONTENT_SOURCE_LOCAL(1),
    UPLOAD_CONTENT_SOURCE_NONLOCAL(2);

    public final int d;

    avtj(int i) {
        this.d = i;
    }

    public static aons a() {
        return avhw.k;
    }

    public static avtj b(int i) {
        if (i == 0) {
            return UPLOAD_CONTENT_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return UPLOAD_CONTENT_SOURCE_LOCAL;
        }
        if (i != 2) {
            return null;
        }
        return UPLOAD_CONTENT_SOURCE_NONLOCAL;
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
