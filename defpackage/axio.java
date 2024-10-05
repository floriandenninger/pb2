package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axio implements aonq {
    UNKNOWN(0),
    VP8(1),
    VP9(2),
    H264(3),
    H265X(4),
    AV1X(5);

    public final int g;

    axio(int i) {
        this.g = i;
    }

    public static aons a() {
        return axcs.k;
    }

    public static axio b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VP8;
        }
        if (i == 2) {
            return VP9;
        }
        if (i == 3) {
            return H264;
        }
        if (i == 4) {
            return H265X;
        }
        if (i != 5) {
            return null;
        }
        return AV1X;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
