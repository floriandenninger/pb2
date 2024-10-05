package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asum implements aonq {
    LOGGING_QUEUE_TYPE_UNKNOWN(0),
    LOGGING_QUEUE_TYPE_PIXIE_DUST(1),
    LOGGING_QUEUE_TYPE_CACHE_METADATA(2);

    public final int d;

    asum(int i) {
        this.d = i;
    }

    public static aons a() {
        return assi.o;
    }

    public static asum b(int i) {
        if (i == 0) {
            return LOGGING_QUEUE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return LOGGING_QUEUE_TYPE_PIXIE_DUST;
        }
        if (i != 2) {
            return null;
        }
        return LOGGING_QUEUE_TYPE_CACHE_METADATA;
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
