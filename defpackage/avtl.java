package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avtl implements aonq {
    UPLOAD_CREATION_FLOW_UNKNOWN(0),
    UPLOAD_CREATION_FLOW_LEGACY(1),
    UPLOAD_CREATION_FLOW_EXTERNAL(2),
    UPLOAD_CREATION_FLOW_SHORTS(3);

    public final int e;

    avtl(int i) {
        this.e = i;
    }

    public static aons a() {
        return avhw.m;
    }

    public static avtl b(int i) {
        if (i == 0) {
            return UPLOAD_CREATION_FLOW_UNKNOWN;
        }
        if (i == 1) {
            return UPLOAD_CREATION_FLOW_LEGACY;
        }
        if (i == 2) {
            return UPLOAD_CREATION_FLOW_EXTERNAL;
        }
        if (i != 3) {
            return null;
        }
        return UPLOAD_CREATION_FLOW_SHORTS;
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
