package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ansd implements aonq {
    NOT_ASKED(0),
    PREVIOUSLY_DENIED(1),
    PREVIOUSLY_GRANTED(2),
    GRANTED(3),
    DENIED(4);

    public final int f;

    ansd(int i) {
        this.f = i;
    }

    public static ansd a(int i) {
        if (i == 0) {
            return NOT_ASKED;
        }
        if (i == 1) {
            return PREVIOUSLY_DENIED;
        }
        if (i == 2) {
            return PREVIOUSLY_GRANTED;
        }
        if (i == 3) {
            return GRANTED;
        }
        if (i != 4) {
            return null;
        }
        return DENIED;
    }

    public static aons b() {
        return ancx.l;
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
