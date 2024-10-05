package defpackage;

import com.google.research.aimatter.drishti.DrishtiCache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awyd {
    public DrishtiCache a;
    private Long b;

    public final awye a() {
        Long l = this.b;
        if (l == null) {
            throw new IllegalStateException("Missing required properties: parentGlContextHandle");
        }
        return new awye(l.longValue(), this.a);
    }

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }
}
