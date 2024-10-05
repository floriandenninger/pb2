package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamr {
    private final ArrayList a = new ArrayList();
    private Object b;

    private final Object E() {
        Object obj = this.b;
        if (obj == null) {
            if (this.a.size() == 2) {
                Object obj2 = this.a.get(0);
                Object obj3 = this.a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new bame(this.a);
            }
            this.b = obj;
        }
        return obj;
    }

    private static final boolean F(Object obj) {
        if (obj instanceof bams) {
            return ((obj instanceof bame) && ((bame) obj).b == null) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(StringBuffer stringBuffer, int i) {
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                stringBuffer.append((char) 65533);
            }
        }
    }

    public final void A(int i) {
        l(bajj.w, i, 2);
    }

    public final void B(int i) {
        l(bajj.m, i, 2);
    }

    public final void C(int i, int i2) {
        r(bajj.l, i, i2);
    }

    public final void D(int i, int i2) {
        r(bajj.g, i, i2);
    }

    public final bamc a() {
        Object E = E();
        bamw bamwVar = (!(E instanceof bamw) || ((E instanceof bame) && ((bame) E).a == null)) ? null : (bamw) E;
        bams bamsVar = F(E) ? (bams) E : null;
        if (bamwVar != null || bamsVar != null) {
            return new bamc(bamwVar, bamsVar);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    public final bams b() {
        Object E = E();
        if (F(E)) {
            return (bams) E;
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void d(Object obj) {
        this.b = null;
        this.a.add(obj);
        this.a.add(obj);
    }

    public final void e(bamw bamwVar, bams bamsVar) {
        this.b = null;
        this.a.add(bamwVar);
        this.a.add(bamsVar);
    }

    public final void f(bajj bajjVar) {
        d(new baml(bajjVar, true));
    }

    public final void g(bajj bajjVar) {
        d(new baml(bajjVar, false));
    }

    public final void h(boolean z) {
        d(new bamo(null, "Z", z, 2));
    }

    public final void i(bamc bamcVar) {
        if (bamcVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        e(bamcVar.a, bamcVar.b);
    }

    public final void j(bams bamsVar) {
        e(null, bamsVar);
    }

    public final void k(bams[] bamsVarArr) {
        int length = bamsVarArr.length;
        bams[] bamsVarArr2 = new bams[length];
        int i = 0;
        while (i < length - 1) {
            bams bamsVar = bamsVarArr[i];
            bamsVarArr2[i] = bamsVar;
            if (bamsVar == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i++;
        }
        bamsVarArr2[i] = bamsVarArr[i];
        e(null, new bamh(bamsVarArr2));
    }

    public final void l(bajj bajjVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i <= 1) {
            d(new bamq(bajjVar, i2, false));
        } else {
            d(new bamj(bajjVar, i2, false, i));
        }
    }

    public final void m(bajj bajjVar, int i) {
        d(new bamf(bajjVar, i));
    }

    public final void n(bajj bajjVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        d(new bamg(bajjVar, i, i2));
    }

    public final void o(char c) {
        d(new bamd(c));
    }

    public final void p(String str) {
        int length = str.length();
        if (length != 0) {
            if (length == 1) {
                d(new bamd(str.charAt(0)));
            } else {
                d(new bamk(str));
            }
        }
    }

    public final void r(bajj bajjVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i <= 1) {
            d(new bamq(bajjVar, i2, true));
        } else {
            d(new bamj(bajjVar, i2, true, i));
        }
    }

    public final void s(String str, boolean z, int i) {
        d(new bamo(str, str, z, i));
    }

    public final void t(int i) {
        l(bajj.j, i, 2);
    }

    public final void u(int i) {
        l(bajj.n, i, 1);
    }

    public final void v(int i) {
        l(bajj.h, i, 3);
    }

    public final void w(int i, int i2) {
        n(bajj.v, i, i2);
    }

    public final void x(int i) {
        l(bajj.s, i, 2);
    }

    public final void y(int i) {
        l(bajj.u, i, 2);
    }

    public final void z(int i) {
        l(bajj.i, i, 2);
    }

    public final void q(bams bamsVar) {
        if (bamsVar != null) {
            e(null, new bamh(new bams[]{bamsVar, null}));
            return;
        }
        throw new IllegalArgumentException("No parser supplied");
    }
}
