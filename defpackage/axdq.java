package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axdq implements aonq {
    KEYFRAME_LABEL_UNSPECIFIED(0),
    KEYFRAME_LABEL_START(1),
    KEYFRAME_LABEL_END(2);

    public final int d;

    axdq(int i) {
        this.d = i;
    }

    public static aons a() {
        return axcs.e;
    }

    public static axdq b(int i) {
        if (i == 0) {
            return KEYFRAME_LABEL_UNSPECIFIED;
        }
        if (i == 1) {
            return KEYFRAME_LABEL_START;
        }
        if (i != 2) {
            return null;
        }
        return KEYFRAME_LABEL_END;
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
