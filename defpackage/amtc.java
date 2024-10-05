package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amtc implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public amtc(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        amtb amtbVar = new amtb(this.a);
        amtbVar.n(this.b);
        return amtbVar.g();
    }
}
