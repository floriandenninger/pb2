package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ot implements pk {
    public pm a;
    final SparseBooleanArray b = new SparseBooleanArray();
    public int c;
    public int d;
    public int e;
    public int f;
    final /* synthetic */ ow g;

    public ot(ow owVar) {
        this.g = owVar;
    }

    public final int a(int i) {
        return i - (i % this.g.b);
    }

    @Override // defpackage.pk
    public final void b(pm pmVar) {
        throw null;
    }

    public final void c(int i) {
        this.b.delete(i);
        ((pf) this.g.f).a(pj.a(3, this.c, i));
    }

    public final void d(int i, int i2, int i3, boolean z) {
        int i4 = i;
        while (i4 <= i2) {
            ((ph) this.g.g).a(pj.a(3, z ? (i2 + i) - i4 : i4, i3));
            i4 += this.g.b;
        }
    }
}
