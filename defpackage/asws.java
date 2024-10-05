package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asws implements aonq {
    GENERATION_STATUS_UNKNOWN(0),
    GENERATION_STATUS_DONE(1);

    public final int c;

    asws(int i) {
        this.c = i;
    }

    public static aons a() {
        return asvv.f;
    }

    public static asws b(int i) {
        if (i == 0) {
            return GENERATION_STATUS_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GENERATION_STATUS_DONE;
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
