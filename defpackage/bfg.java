package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfg {
    public final int a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final pdp[] f;
    private pdp[] g;

    public bfg(boolean z, int i) {
        pse.e(i > 0);
        pse.e(true);
        this.b = z;
        this.a = i;
        this.e = 0;
        this.g = new pdp[100];
        this.f = new pdp[1];
    }

    public final synchronized int a() {
        return this.d * this.a;
    }

    public final synchronized void b() {
        if (this.b) {
            c(0);
        }
    }

    public final synchronized void c(int i) {
        int i2 = this.c;
        this.c = i;
        if (i < i2) {
            d();
        }
    }

    public final synchronized void d() {
        int max = Math.max(0, pts.b(this.c, this.a) - this.d);
        int i = this.e;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.g, max, i, (Object) null);
        this.e = max;
    }

    public final synchronized pdp e() {
        pdp pdpVar;
        this.d++;
        int i = this.e;
        if (i > 0) {
            pdp[] pdpVarArr = this.g;
            int i2 = i - 1;
            this.e = i2;
            pdpVar = pdpVarArr[i2];
            pse.c(pdpVar);
            this.g[this.e] = null;
        } else {
            pdpVar = new pdp(new byte[this.a]);
        }
        return pdpVar;
    }

    public final synchronized void f(pdp pdpVar) {
        pdp[] pdpVarArr = this.f;
        pdpVarArr[0] = pdpVar;
        g(pdpVarArr);
    }

    public final synchronized void g(pdp[] pdpVarArr) {
        int length = this.e + pdpVarArr.length;
        pdp[] pdpVarArr2 = this.g;
        int length2 = pdpVarArr2.length;
        if (length >= length2) {
            this.g = (pdp[]) Arrays.copyOf(pdpVarArr2, Math.max(length2 + length2, length));
        }
        for (pdp pdpVar : pdpVarArr) {
            pdp[] pdpVarArr3 = this.g;
            int i = this.e;
            this.e = i + 1;
            pdpVarArr3[i] = pdpVar;
        }
        this.d -= pdpVarArr.length;
        notifyAll();
    }
}
