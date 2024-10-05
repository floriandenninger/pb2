package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsq implements Serializable {
    final amsr a;

    public amsq(amsr amsrVar) {
        this.a = amsrVar;
    }

    Object readResolve() {
        return this.a.j();
    }
}
