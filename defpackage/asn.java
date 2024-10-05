package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class asn implements plg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int i;
    public final int j;
    public final boolean k;
    public final amru l;
    public final amru m;
    public final int o;
    public final int p;
    public final amru q;
    public final amru r;
    public final int s;
    public final boolean v;
    public final amsx w;
    public final int e = 0;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;
    public final int n = 0;
    public final boolean t = false;
    public final boolean u = false;

    static {
        new asn(new asm());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public asn(asm asmVar) {
        this.a = asmVar.a;
        this.b = asmVar.b;
        this.c = asmVar.c;
        this.d = asmVar.d;
        this.i = asmVar.e;
        this.j = asmVar.f;
        this.k = asmVar.g;
        this.l = asmVar.h;
        this.m = asmVar.i;
        this.o = asmVar.j;
        this.p = asmVar.k;
        this.q = asmVar.l;
        this.r = asmVar.m;
        this.s = asmVar.n;
        this.v = asmVar.o;
        this.w = asmVar.p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asn asnVar = (asn) obj;
            if (this.a == asnVar.a && this.b == asnVar.b && this.c == asnVar.c && this.d == asnVar.d && this.k == asnVar.k && this.i == asnVar.i && this.j == asnVar.j && amkq.aV(this.l, asnVar.l) && amkq.aV(this.m, asnVar.m) && this.o == asnVar.o && this.p == asnVar.p && amkq.aV(this.q, asnVar.q) && amkq.aV(this.r, asnVar.r) && this.s == asnVar.s && this.v == asnVar.v && this.w.equals(asnVar.w)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 961) + this.o) * 31) + this.p) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s) * 29791) + (this.v ? 1 : 0)) * 31) + ((amvs) this.w).c;
    }
}
