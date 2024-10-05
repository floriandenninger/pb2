package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axec implements aonq {
    TOUCH_STATE_UNSPECIFIED(0),
    START(1),
    MOVE(2),
    END(3),
    CANCEL(4);

    public final int f;

    axec(int i) {
        this.f = i;
    }

    public static aons a() {
        return axcs.f;
    }

    public static axec b(int i) {
        if (i == 0) {
            return TOUCH_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return START;
        }
        if (i == 2) {
            return MOVE;
        }
        if (i == 3) {
            return END;
        }
        if (i != 4) {
            return null;
        }
        return CANCEL;
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
