package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum armw implements aonq {
    CAMERA_UNKNOWN(0),
    CAMERA_NONE(1),
    CAMERA_BACK(2),
    CAMERA_FRONT(3),
    CAMERA_FRONT_AND_BACK(4);

    public final int f;

    armw(int i) {
        this.f = i;
    }

    public static aons a() {
        return armv.a;
    }

    public static armw b(int i) {
        if (i == 0) {
            return CAMERA_UNKNOWN;
        }
        if (i == 1) {
            return CAMERA_NONE;
        }
        if (i == 2) {
            return CAMERA_BACK;
        }
        if (i == 3) {
            return CAMERA_FRONT;
        }
        if (i != 4) {
            return null;
        }
        return CAMERA_FRONT_AND_BACK;
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
