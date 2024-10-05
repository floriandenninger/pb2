package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsw implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public amsw(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return amsx.q(this.a);
    }
}
