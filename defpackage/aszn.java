package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aszn implements aonq {
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN(0),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_NORMAL(1),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_LOW(2),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW(3);

    private final int f;

    aszn(int i) {
        this.f = i;
    }

    public static aons a() {
        return asvv.h;
    }

    public static aszn b(int i) {
        if (i == 0) {
            return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
        }
        if (i == 1) {
            return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_NORMAL;
        }
        if (i == 2) {
            return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_LOW;
        }
        if (i != 3) {
            return null;
        }
        return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW;
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
