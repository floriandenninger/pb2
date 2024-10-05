package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amsv extends amrj {
    Object[] d;
    private int e;

    public amsv() {
        super(4);
    }

    @Override // defpackage.amrj, defpackage.amrk
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int f = amsx.f(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (f <= length) {
                objArr.getClass();
                int i = length - 1;
                int hashCode = obj.hashCode();
                int bs = amkq.bs(hashCode);
                while (true) {
                    int i2 = bs & i;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i2];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return;
                        } else {
                            bs = i2 + 1;
                        }
                    } else {
                        objArr2[i2] = obj;
                        this.e += hashCode;
                        super.b(obj);
                        return;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void i(Object... objArr) {
        if (this.d == null) {
            super.d(objArr);
            return;
        }
        for (Object obj : objArr) {
            c(obj);
        }
    }

    public final void j(Iterable iterable) {
        iterable.getClass();
        if (this.d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            return;
        }
        super.e(iterable);
    }

    public final void k(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void l(amsv amsvVar) {
        if (this.d == null) {
            a(amsvVar.a, amsvVar.b);
            return;
        }
        for (int i = 0; i < amsvVar.b; i++) {
            Object obj = amsvVar.a[i];
            obj.getClass();
            c(obj);
        }
    }

    public amsv(int i) {
        super(i);
        this.d = new Object[amsx.f(i)];
    }

    public amsx g() {
        amsx n;
        int i = this.b;
        if (i == 0) {
            return amvs.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return amsx.r(obj);
        }
        if (this.d == null || amsx.f(i) != this.d.length) {
            n = amsx.n(this.b, this.a);
            this.b = n.size();
        } else {
            Object[] copyOf = amsx.x(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
            n = new amvs(copyOf, this.e, this.d, r5.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return n;
    }
}
