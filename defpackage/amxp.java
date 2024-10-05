package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amxp implements amxz, amyo {
    private static final String a = new String();
    public final long b;
    public amxo c;
    private final Level d;
    private amxs e;
    private amzp f;
    private Object[] g;

    /* JADX INFO: Access modifiers changed from: protected */
    public amxp(Level level) {
        long b = amzn.b();
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        anaf.d(level, "level");
        this.d = level;
        this.b = b;
    }

    private final void C(String str, Object... objArr) {
        this.g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof amxk) {
                objArr[i] = ((amxk) obj).a();
            }
        }
        if (str != a) {
            this.f = new amzp(a(), str);
        }
        amxf c = c();
        try {
            anba anbaVar = (anba) anba.a.get();
            int i2 = anbaVar.b + 1;
            anbaVar.b = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    c.a.c(this);
                } else {
                    amxf.i("unbounded recursion in log statement", this);
                }
                if (anbaVar != null) {
                    anbaVar.close();
                }
            } catch (Throwable th) {
                if (anbaVar != null) {
                    try {
                        anbaVar.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            try {
                c.a.b(e, this);
            } catch (amyq e2) {
                throw e2;
            } catch (RuntimeException e3) {
                String name = e3.getClass().getName();
                String message = e3.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
                sb.append(name);
                sb.append(": ");
                sb.append(message);
                amxf.i(sb.toString(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused2) {
                }
            }
        }
    }

    private final boolean D() {
        amxt amxtVar;
        if (this.e == null) {
            this.e = amzn.g().a(amxp.class, 1);
        }
        if (this.e != amxs.a) {
            amxtVar = this.e;
            amxo amxoVar = this.c;
            if (amxoVar != null && amxoVar.b > 0) {
                anaf.d(amxtVar, "logSiteKey");
                int i = amxoVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (amxn.d.equals(amxoVar.c(i2))) {
                        Object e = amxoVar.e(i2);
                        if (!(e instanceof amya)) {
                            amxtVar = new amyd(amxtVar, e);
                        } else {
                            amxtVar = ((amya) e).b();
                        }
                    }
                }
            }
        } else {
            amxtVar = null;
        }
        if (!b(amxtVar)) {
            return false;
        }
        anam k = amzn.k();
        if (!k.c.isEmpty()) {
            n(amxn.f, k);
        }
        return true;
    }

    @Override // defpackage.amxz
    public final void A(int i, int i2) {
        if (D()) {
            C("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.amxz
    public final void B(boolean z) {
        if (D()) {
            C("#isAvailable(%d) - isAvailable = %b", 0, Boolean.valueOf(z));
        }
    }

    protected abstract anav a();

    protected boolean b(amxt amxtVar) {
        throw null;
    }

    protected abstract amxf c();

    protected abstract amxz d();

    @Override // defpackage.amyo
    public final long e() {
        return this.b;
    }

    @Override // defpackage.amyo
    public final amxs f() {
        amxs amxsVar = this.e;
        if (amxsVar != null) {
            return amxsVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.amxz
    public final amxz g(amyc amycVar, Object obj) {
        anaf.d(amycVar, "metadata key");
        if (obj != null) {
            n(amycVar, obj);
        }
        return d();
    }

    @Override // defpackage.amxz
    public final amxz h(Throwable th) {
        return g(amxn.a, th);
    }

    @Override // defpackage.amxz
    public final amxz i(String str, String str2, int i, String str3) {
        amxr amxrVar = new amxr(str, str2, i, str3);
        if (this.e == null) {
            this.e = amxrVar;
        }
        return d();
    }

    @Override // defpackage.amyo
    public final amyt j() {
        amxo amxoVar = this.c;
        return amxoVar != null ? amxoVar : amys.a;
    }

    @Override // defpackage.amyo
    public final amzp k() {
        return this.f;
    }

    @Override // defpackage.amyo
    public final Object l() {
        if (this.f != null) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        return this.g[0];
    }

    @Override // defpackage.amyo
    public final Level m() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(amyc amycVar, Object obj) {
        int a2;
        if (this.c == null) {
            this.c = new amxo();
        }
        amxo amxoVar = this.c;
        if (amycVar.b || (a2 = amxoVar.a(amycVar)) == -1) {
            int i = amxoVar.b + 1;
            Object[] objArr = amxoVar.a;
            int length = objArr.length;
            if (i + i > length) {
                amxoVar.a = Arrays.copyOf(objArr, length + length);
            }
            Object[] objArr2 = amxoVar.a;
            int i2 = amxoVar.b;
            anaf.d(amycVar, "metadata key");
            objArr2[i2 + i2] = amycVar;
            Object[] objArr3 = amxoVar.a;
            int i3 = amxoVar.b;
            anaf.d(obj, "metadata value");
            objArr3[i3 + i3 + 1] = obj;
            amxoVar.b++;
            return;
        }
        Object[] objArr4 = amxoVar.a;
        anaf.d(obj, "metadata value");
        objArr4[a2 + a2 + 1] = obj;
    }

    @Override // defpackage.amxz
    public final void o() {
        if (D()) {
            C(a, "");
        }
    }

    @Override // defpackage.amxz
    public final void p(Object obj) {
        if (D()) {
            C("%s", obj);
        }
    }

    @Override // defpackage.amxz
    public final void q(String str) {
        if (D()) {
            C(a, str);
        }
    }

    @Override // defpackage.amxz
    public final void r(String str, int i) {
        if (D()) {
            C(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.amxz
    public final void s(String str, Object obj) {
        if (D()) {
            C(str, obj);
        }
    }

    @Override // defpackage.amxz
    public final void t(String str, int i, Object obj) {
        if (D()) {
            C(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.amxz
    public final void u(String str, Object obj, Object obj2) {
        if (D()) {
            C(str, obj, obj2);
        }
    }

    @Override // defpackage.amxz
    public final void v(String str, Object obj, Object obj2, Object obj3) {
        if (D()) {
            C(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.amxz
    public final void w(String str, Object[] objArr) {
        if (D()) {
            C(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.amyo
    public final boolean x() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(amxn.e));
    }

    @Override // defpackage.amyo
    public final Object[] y() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // defpackage.amxz
    public final amxz z(TimeUnit timeUnit) {
        if (x()) {
            return d();
        }
        n(amxn.c, amxx.a(timeUnit));
        return d();
    }
}
