package defpackage;

import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amsu extends ampe implements Serializable {
    public static final amsu a = new amsu(amru.q());
    public static final amsu b = new amsu(amru.r(amvf.a));
    private final transient amru c;

    public amsu(amru amruVar) {
        this.c = amruVar;
    }

    public static vak d() {
        return new vak((byte[]) null, (short[]) null);
    }

    @Override // defpackage.amvh
    public final /* bridge */ /* synthetic */ Set c() {
        if (this.c.isEmpty()) {
            return amvs.a;
        }
        return new amvt(this.c, amvf.c());
    }

    Object writeReplace() {
        return new amst(this.c);
    }
}
