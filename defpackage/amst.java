package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amst implements Serializable {
    private final amru a;

    public amst(amru amruVar) {
        this.a = amruVar;
    }

    Object readResolve() {
        if (this.a.isEmpty()) {
            return amsu.a;
        }
        if (amkq.aV(this.a, amru.r(amvf.a))) {
            return amsu.b;
        }
        return new amsu(this.a);
    }
}
