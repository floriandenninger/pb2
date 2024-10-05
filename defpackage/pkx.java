package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pkx extends pou {
    public final int a;
    public final pou[] b;
    private final int c;
    private final bdb e;
    private final int f;
    private final int[] g;
    private final int[] h;
    private final Object[] i;
    private final HashMap j;

    public pkx(Collection collection, bdb bdbVar) {
        this.e = bdbVar;
        this.c = bdbVar.a();
        int size = collection.size();
        this.g = new int[size];
        this.h = new int[size];
        this.b = new pou[size];
        this.i = new Object[size];
        this.j = new HashMap();
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            pnk pnkVar = (pnk) it.next();
            this.b[i3] = pnkVar.a();
            this.h[i3] = i;
            this.g[i3] = i2;
            i += this.b[i3].h();
            i2 += this.b[i3].g();
            this.i[i3] = pnkVar.b();
            this.j.put(this.i[i3], Integer.valueOf(i3));
            i3++;
        }
        this.a = i;
        this.f = i2;
    }

    private final int A(int i, boolean z) {
        if (!z) {
            if (i >= this.c - 1) {
                return -1;
            }
            return i + 1;
        }
        bdb bdbVar = this.e;
        int i2 = bdbVar.c[i] + 1;
        int[] iArr = bdbVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    private final int B(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        bdb bdbVar = this.e;
        int i2 = bdbVar.c[i] - 1;
        if (i2 >= 0) {
            return bdbVar.b[i2];
        }
        return -1;
    }

    public static Object l(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object m(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // defpackage.pou
    public final pos a(int i, pos posVar, boolean z) {
        int o = o(i);
        int r = r(o);
        s(o).a(i - q(o), posVar, z);
        posVar.c += r;
        if (z) {
            Object t = t(o);
            Object obj = posVar.b;
            pse.c(obj);
            posVar.b = Pair.create(t, obj);
        }
        return posVar;
    }

    @Override // defpackage.pou
    public final pot b(int i, pot potVar, long j) {
        int p = p(i);
        int r = r(p);
        int q = q(p);
        s(p).b(i - r, potVar, j);
        Object t = t(p);
        if (!pot.a.equals(potVar.b)) {
            t = Pair.create(t, potVar.b);
        }
        potVar.b = t;
        potVar.o += q;
        potVar.p += q;
        return potVar;
    }

    @Override // defpackage.pou
    public final int c(boolean z) {
        if (this.c == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.e.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        while (s(i).z()) {
            i = A(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return r(i) + s(i).c(z);
    }

    @Override // defpackage.pou
    public final int d(Object obj) {
        int d;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object m = m(obj);
        Object l = l(obj);
        int n = n(m);
        if (n == -1 || (d = s(n).d(l)) == -1) {
            return -1;
        }
        return q(n) + d;
    }

    @Override // defpackage.pou
    public final int e(boolean z) {
        int i;
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.e.b;
            int length = iArr.length;
            i = length > 0 ? iArr[length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        while (s(i).z()) {
            i = B(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return r(i) + s(i).e(z);
    }

    @Override // defpackage.pou
    public final int f(int i, int i2, boolean z) {
        int p = p(i);
        int r = r(p);
        int f = s(p).f(i - r, i2 == 2 ? 0 : i2, z);
        if (f != -1) {
            return r + f;
        }
        int A = A(p, z);
        while (A != -1 && s(A).z()) {
            A = A(A, z);
        }
        if (A != -1) {
            return r(A) + s(A).c(z);
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.pou
    public final int g() {
        return this.f;
    }

    @Override // defpackage.pou
    public final int h() {
        return this.a;
    }

    @Override // defpackage.pou
    public final Object i(int i) {
        int o = o(i);
        return Pair.create(t(o), s(o).i(i - q(o)));
    }

    @Override // defpackage.pou
    public final int j(int i, int i2) {
        int p = p(i);
        int r = r(p);
        int j = s(p).j(i - r, i2 == 2 ? 0 : i2);
        if (j != -1) {
            return r + j;
        }
        int B = B(p, false);
        while (B != -1 && s(B).z()) {
            B = B(B, false);
        }
        if (B != -1) {
            return r(B) + s(B).e(false);
        }
        if (i2 == 2) {
            return e(false);
        }
        return -1;
    }

    @Override // defpackage.pou
    public final pos jH(Object obj, pos posVar) {
        Object m = m(obj);
        Object l = l(obj);
        int n = n(m);
        int r = r(n);
        s(n).jH(l, posVar);
        posVar.c += r;
        posVar.b = obj;
        return posVar;
    }

    protected final int n(Object obj) {
        Integer num = (Integer) this.j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected final int o(int i) {
        return pts.am(this.g, i + 1);
    }

    protected final int p(int i) {
        return pts.am(this.h, i + 1);
    }

    protected final int q(int i) {
        return this.g[i];
    }

    protected final int r(int i) {
        return this.h[i];
    }

    protected final pou s(int i) {
        return this.b[i];
    }

    protected final Object t(int i) {
        return this.i[i];
    }
}
