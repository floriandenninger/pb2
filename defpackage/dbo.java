package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbo implements Cloneable {
    public Drawable d;
    public int e;
    public Drawable f;
    public int g;
    public boolean l;
    public boolean q;
    public boolean s;
    private int t;
    private Drawable u;
    private int v;
    private boolean w;
    private Resources.Theme x;
    private boolean y;
    private boolean z;
    public float a = 1.0f;
    public csk b = csk.c;
    public cof c = cof.NORMAL;
    public boolean h = true;
    public int i = -1;
    public int j = -1;
    public cqi k = dcy.b;
    public boolean m = true;
    public cqn n = new cqn();
    public Map o = new ddd();
    public Class p = Object.class;
    public boolean r = true;

    private final dbo a(cxu cxuVar, cqr cqrVar) {
        return b(cxuVar, cqrVar, false);
    }

    private final dbo b(cxu cxuVar, cqr cqrVar, boolean z) {
        dbo D;
        if (z) {
            D = N(cxuVar, cqrVar);
        } else {
            D = D(cxuVar, cqrVar);
        }
        D.r = true;
        return D;
    }

    private static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    public dbo A() {
        return D(cxu.c, new cxi());
    }

    public dbo B() {
        return a(cxu.b, new cxj());
    }

    public dbo C() {
        return a(cxu.a, new cyc());
    }

    final dbo D(cxu cxuVar, cqr cqrVar) {
        if (this.q) {
            return clone().D(cxuVar, cqrVar);
        }
        w(cxuVar);
        return M(cqrVar, false);
    }

    public dbo E(int i, int i2) {
        if (this.q) {
            return clone().E(i, i2);
        }
        this.j = i;
        this.i = i2;
        this.t |= 512;
        S();
        return this;
    }

    public dbo F(int i) {
        if (this.q) {
            return clone().F(i);
        }
        this.g = i;
        int i2 = this.t;
        this.f = null;
        this.t = (i2 | 128) & (-65);
        S();
        return this;
    }

    public dbo G(Drawable drawable) {
        if (this.q) {
            return clone().G(drawable);
        }
        this.f = drawable;
        int i = this.t;
        this.g = 0;
        this.t = (i | 64) & (-129);
        S();
        return this;
    }

    public dbo H(cof cofVar) {
        if (this.q) {
            return clone().H(cofVar);
        }
        did.ap(cofVar);
        this.c = cofVar;
        this.t |= 8;
        S();
        return this;
    }

    public dbo I(cqm cqmVar, Object obj) {
        if (this.q) {
            return clone().I(cqmVar, obj);
        }
        did.ap(cqmVar);
        did.ap(obj);
        this.n.d(cqmVar, obj);
        S();
        return this;
    }

    public dbo J(cqi cqiVar) {
        if (this.q) {
            return clone().J(cqiVar);
        }
        did.ap(cqiVar);
        this.k = cqiVar;
        this.t |= 1024;
        S();
        return this;
    }

    public dbo K(cqr cqrVar) {
        return M(cqrVar, true);
    }

    public dbo L(cqr... cqrVarArr) {
        int length = cqrVarArr.length;
        if (length > 1) {
            return M(new cqj(cqrVarArr), true);
        }
        if (length == 1) {
            return K(cqrVarArr[0]);
        }
        S();
        return this;
    }

    final dbo M(cqr cqrVar, boolean z) {
        if (this.q) {
            return clone().M(cqrVar, z);
        }
        cya cyaVar = new cya(cqrVar, z);
        O(Bitmap.class, cqrVar, z);
        O(Drawable.class, cyaVar, z);
        O(BitmapDrawable.class, cyaVar, z);
        O(czl.class, new czo(cqrVar), z);
        S();
        return this;
    }

    final dbo N(cxu cxuVar, cqr cqrVar) {
        if (this.q) {
            return clone().N(cxuVar, cqrVar);
        }
        w(cxuVar);
        return K(cqrVar);
    }

    final dbo O(Class cls, cqr cqrVar, boolean z) {
        if (this.q) {
            return clone().O(cls, cqrVar, z);
        }
        did.ap(cls);
        did.ap(cqrVar);
        this.o.put(cls, cqrVar);
        int i = this.t;
        this.m = true;
        int i2 = i | 67584;
        this.t = i2;
        this.r = false;
        if (z) {
            this.t = i2 | 131072;
            this.l = true;
        }
        S();
        return this;
    }

    public final boolean P(int i) {
        return c(this.t, i);
    }

    public final boolean Q() {
        return ddn.p(this.j, this.i);
    }

    public dbo R() {
        if (this.q) {
            return clone().R();
        }
        this.s = true;
        this.t |= 1048576;
        S();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S() {
        if (this.w) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public dbo T() {
        if (this.q) {
            return clone().T();
        }
        this.h = false;
        this.t |= 256;
        S();
        return this;
    }

    public void U() {
        this.w = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbo) {
            dbo dboVar = (dbo) obj;
            if (Float.compare(dboVar.a, this.a) == 0 && this.e == dboVar.e && ddn.m(this.d, dboVar.d) && this.g == dboVar.g && ddn.m(this.f, dboVar.f)) {
                int i = dboVar.v;
                Drawable drawable = dboVar.u;
                if (ddn.m(null, null) && this.h == dboVar.h && this.i == dboVar.i && this.j == dboVar.j && this.l == dboVar.l && this.m == dboVar.m) {
                    boolean z = dboVar.y;
                    boolean z2 = dboVar.z;
                    if (this.b.equals(dboVar.b) && this.c == dboVar.c && this.n.equals(dboVar.n) && this.o.equals(dboVar.o) && this.p.equals(dboVar.p) && ddn.m(this.k, dboVar.k)) {
                        Resources.Theme theme = dboVar.x;
                        if (ddn.m(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int c = ddn.c(this.a);
        int f = ddn.f(this.d, ddn.e(this.e, c));
        int f2 = ddn.f(null, ddn.e(0, ddn.f(this.f, ddn.e(this.g, f))));
        boolean z = this.h;
        int i = this.i;
        int i2 = this.j;
        boolean z2 = this.l;
        boolean z3 = this.m;
        return ddn.f(null, ddn.f(this.k, ddn.f(this.p, ddn.f(this.o, ddn.f(this.n, ddn.f(this.c, ddn.f(this.b, ddn.e(0, ddn.e(0, ddn.e(z3 ? 1 : 0, ddn.e(z2 ? 1 : 0, ddn.e(i2, ddn.e(i, ddn.e(z ? 1 : 0, f2))))))))))))));
    }

    public dbo l(dbo dboVar) {
        if (this.q) {
            return clone().l(dboVar);
        }
        if (c(dboVar.t, 2)) {
            this.a = dboVar.a;
        }
        if (c(dboVar.t, 262144)) {
            boolean z = dboVar.y;
            this.y = false;
        }
        if (c(dboVar.t, 1048576)) {
            this.s = dboVar.s;
        }
        if (c(dboVar.t, 4)) {
            this.b = dboVar.b;
        }
        if (c(dboVar.t, 8)) {
            this.c = dboVar.c;
        }
        if (c(dboVar.t, 16)) {
            this.d = dboVar.d;
            this.e = 0;
            this.t &= -33;
        }
        if (c(dboVar.t, 32)) {
            this.e = dboVar.e;
            this.d = null;
            this.t &= -17;
        }
        if (c(dboVar.t, 64)) {
            this.f = dboVar.f;
            this.g = 0;
            this.t &= -129;
        }
        if (c(dboVar.t, 128)) {
            this.g = dboVar.g;
            this.f = null;
            this.t &= -65;
        }
        if (c(dboVar.t, 256)) {
            this.h = dboVar.h;
        }
        if (c(dboVar.t, 512)) {
            this.j = dboVar.j;
            this.i = dboVar.i;
        }
        if (c(dboVar.t, 1024)) {
            this.k = dboVar.k;
        }
        if (c(dboVar.t, 4096)) {
            this.p = dboVar.p;
        }
        if (c(dboVar.t, 8192)) {
            Drawable drawable = dboVar.u;
            this.u = null;
            this.v = 0;
            this.t &= -16385;
        }
        if (c(dboVar.t, 16384)) {
            int i = dboVar.v;
            this.v = 0;
            this.u = null;
            this.t &= -8193;
        }
        if (c(dboVar.t, 32768)) {
            Resources.Theme theme = dboVar.x;
            this.x = null;
        }
        if (c(dboVar.t, 65536)) {
            this.m = dboVar.m;
        }
        if (c(dboVar.t, 131072)) {
            this.l = dboVar.l;
        }
        if (c(dboVar.t, 2048)) {
            this.o.putAll(dboVar.o);
            this.r = dboVar.r;
        }
        if (c(dboVar.t, 524288)) {
            boolean z2 = dboVar.z;
            this.z = false;
        }
        if (!this.m) {
            this.o.clear();
            int i2 = this.t;
            this.l = false;
            this.t = i2 & (-133121);
            this.r = true;
        }
        this.t |= dboVar.t;
        this.n.c(dboVar.n);
        S();
        return this;
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public dbo clone() {
        try {
            dbo dboVar = (dbo) super.clone();
            cqn cqnVar = new cqn();
            dboVar.n = cqnVar;
            cqnVar.c(this.n);
            ddd dddVar = new ddd();
            dboVar.o = dddVar;
            dddVar.putAll(this.o);
            dboVar.w = false;
            dboVar.q = false;
            return dboVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public dbo s() {
        return b(cxu.b, new cxj(), true);
    }

    public dbo t(Class cls) {
        if (this.q) {
            return clone().t(cls);
        }
        did.ap(cls);
        this.p = cls;
        this.t |= 4096;
        S();
        return this;
    }

    public dbo u(csk cskVar) {
        if (this.q) {
            return clone().u(cskVar);
        }
        did.ap(cskVar);
        this.b = cskVar;
        this.t |= 4;
        S();
        return this;
    }

    public dbo v() {
        if (this.q) {
            return clone().v();
        }
        this.o.clear();
        int i = this.t;
        this.l = false;
        this.m = false;
        this.t = (i & (-133121)) | 65536;
        this.r = true;
        S();
        return this;
    }

    public dbo w(cxu cxuVar) {
        cqm cqmVar = cxu.f;
        did.ap(cxuVar);
        return I(cqmVar, cxuVar);
    }

    public dbo x(int i) {
        if (this.q) {
            return clone().x(i);
        }
        this.e = i;
        int i2 = this.t;
        this.d = null;
        this.t = (i2 | 32) & (-17);
        S();
        return this;
    }

    public dbo y(Drawable drawable) {
        if (this.q) {
            return clone().y(drawable);
        }
        this.d = drawable;
        int i = this.t;
        this.e = 0;
        this.t = (i | 16) & (-33);
        S();
        return this;
    }

    public dbo z(cpw cpwVar) {
        did.ap(cpwVar);
        return I(cxx.a, cpwVar).I(czu.a, cpwVar);
    }

    public dbo r() {
        if (this.w && !this.q) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.q = true;
        U();
        return this;
    }
}
