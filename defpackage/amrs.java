package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amrs implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public amrs(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return amru.p(this.a);
    }
}
