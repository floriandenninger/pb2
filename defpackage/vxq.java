package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxq implements Iterable, Comparable {
    public final int a;
    public final int b;
    final /* synthetic */ vxr c;
    private final int d;

    public vxq(vxr vxrVar, int i, int i2, int i3) {
        this.c = vxrVar;
        vcp.g(i, vxrVar.b.length);
        this.a = i;
        boolean z = false;
        if (i2 > 0 && i + i2 <= vxrVar.b.length) {
            z = true;
        }
        vcp.b(z);
        this.b = i2;
        this.d = i3;
    }

    public final long a() {
        vxr vxrVar = this.c;
        long l = vxrVar.a.l(vxrVar.b[this.a]);
        vxr vxrVar2 = this.c;
        long l2 = vxrVar2.a.l(vxrVar2.b[(this.a + this.b) - 1]);
        vxr vxrVar3 = this.c;
        if (vxrVar3.e > l) {
            if (vxrVar3.d < l2) {
                long l3 = vxrVar3.a.l(vxrVar3.b[this.a]);
                vxr vxrVar4 = this.c;
                return Math.abs((r0 + ((r5 - r0) / 2)) - (l3 + ((vxrVar4.a.l(vxrVar4.b[(this.a + this.b) - 1]) - l3) / 2))) - Long.MIN_VALUE;
            }
        }
        return this.d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        vxq vxqVar = (vxq) obj;
        long a = a();
        long a2 = vxqVar.a();
        if (a != a2) {
            return a >= a2 ? -1 : 1;
        }
        int i = this.a;
        int i2 = vxqVar.a;
        if (i < i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vsa(this.c.b, this.a, this.b);
    }
}
