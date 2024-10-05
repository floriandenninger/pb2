package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum apho implements aonq {
    AUTOTAG_VISIBILITY_STATE_UNSPECIFIED(0),
    AUTOTAG_VISIBILITY_STATE_VISIBLE(1),
    AUTOTAG_VISIBILITY_STATE_HIDDEN(2);

    private final int e;

    apho(int i) {
        this.e = i;
    }

    public static aons a() {
        return apew.m;
    }

    public static apho b(int i) {
        if (i == 0) {
            return AUTOTAG_VISIBILITY_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return AUTOTAG_VISIBILITY_STATE_VISIBLE;
        }
        if (i != 2) {
            return null;
        }
        return AUTOTAG_VISIBILITY_STATE_HIDDEN;
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
