package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum babq implements aonq {
    UNKNOWN(0),
    CRONET(1);

    public final int c;

    babq(int i) {
        this.c = i;
    }

    public static aons a() {
        return axcs.r;
    }

    public static babq b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CRONET;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
