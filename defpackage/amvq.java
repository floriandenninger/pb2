package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amvq implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public amvq(amuw amuwVar) {
        amsr amsrVar = (amsr) amuwVar;
        int size = amsrVar.j().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (amux amuxVar : amsrVar.j()) {
            this.a[i] = amuxVar.a;
            this.b[i] = amuxVar.a();
            i++;
        }
    }

    Object readResolve() {
        amso amsoVar = new amso(this.a.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i < objArr.length) {
                amsoVar.b(objArr[i], this.b[i]);
                i++;
            } else {
                return amsoVar.a();
            }
        }
    }
}
