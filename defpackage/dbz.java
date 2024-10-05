package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbz implements dbs, dck, dby {
    private final Object a;
    private final dbw b;
    private final dbu c;
    private final Context d;
    private final cod e;
    private final Object f;
    private final Class g;
    private final dbo h;
    private final int i;
    private final int j;
    private final cof k;
    private final dcl l;
    private final List m;
    private final dct n;
    private final Executor o;
    private ctd p;
    private csq q;
    private long r;
    private volatile csr s;
    private Drawable t;
    private Drawable u;
    private int v;
    private int w;
    private boolean x;
    private RuntimeException y;
    private final aldo A = aldo.c();
    private int z = 1;

    public dbz(Context context, cod codVar, Object obj, Object obj2, Class cls, dbo dboVar, int i, int i2, cof cofVar, dcl dclVar, dbw dbwVar, List list, dbu dbuVar, csr csrVar, dct dctVar, Executor executor) {
        this.a = obj;
        this.d = context;
        this.e = codVar;
        this.f = obj2;
        this.g = cls;
        this.h = dboVar;
        this.i = i;
        this.j = i2;
        this.k = cofVar;
        this.l = dclVar;
        this.b = dbwVar;
        this.m = list;
        this.c = dbuVar;
        this.s = csrVar;
        this.n = dctVar;
        this.o = executor;
        if (this.y == null && codVar.h.C(cnz.class)) {
            this.y = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        return i == Integer.MIN_VALUE ? CellularSignalStrengthError.ERROR_NOT_SUPPORTED : Math.round(f * i);
    }

    private final Drawable i() {
        int i;
        if (this.u == null) {
            dbo dboVar = this.h;
            Drawable drawable = dboVar.f;
            this.u = drawable;
            if (drawable == null && (i = dboVar.g) > 0) {
                this.u = o(i);
            }
        }
        return this.u;
    }

    private final Drawable o(int i) {
        Resources.Theme theme = this.d.getTheme();
        cod codVar = this.e;
        return czd.a(codVar, codVar, i, theme);
    }

    private final void p() {
        if (this.x) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final boolean q() {
        dbu dbuVar = this.c;
        return dbuVar == null || dbuVar.h(this);
    }

    private final boolean r() {
        dbu dbuVar = this.c;
        return dbuVar == null || !dbuVar.a().j();
    }

    private final void s(csz cszVar) {
        boolean z;
        int i;
        this.A.b();
        synchronized (this.a) {
            String valueOf = String.valueOf(this.f);
            int i2 = this.v;
            int i3 = this.w;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Load failed for ");
            sb.append(valueOf);
            sb.append(" with size [");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("]");
            Log.w("Glide", sb.toString(), cszVar);
            List a = cszVar.a();
            int size = a.size();
            for (int i4 = 0; i4 < size; i4++) {
            }
            this.q = null;
            this.z = 5;
            this.x = true;
            try {
                List list = this.m;
                if (list != null) {
                    Iterator it = list.iterator();
                    z = false;
                    while (it.hasNext()) {
                        z |= ((dbw) it.next()).a(cszVar, this.f, this.l, r());
                    }
                } else {
                    z = false;
                }
                dbw dbwVar = this.b;
                if (dbwVar != null) {
                    dbwVar.a(cszVar, this.f, this.l, r());
                }
                if (!z && q()) {
                    if (this.t == null) {
                        dbo dboVar = this.h;
                        Drawable drawable = dboVar.d;
                        this.t = drawable;
                        if (drawable == null && (i = dboVar.e) > 0) {
                            this.t = o(i);
                        }
                    }
                    Drawable drawable2 = this.t;
                    if (drawable2 == null) {
                        drawable2 = i();
                    }
                    this.l.a(drawable2);
                }
                this.x = false;
                dbu dbuVar = this.c;
                if (dbuVar != null) {
                    dbuVar.d(this);
                }
            } catch (Throwable th) {
                this.x = false;
                throw th;
            }
        }
    }

    @Override // defpackage.dby
    public final Object a() {
        this.A.b();
        return this.a;
    }

    @Override // defpackage.dbs
    public final void b() {
        synchronized (this.a) {
            p();
            this.A.b();
            this.r = ddi.b();
            if (this.f == null) {
                if (ddn.p(this.i, this.j)) {
                    this.v = this.i;
                    this.w = this.j;
                }
                s(new csz("Received null model"));
                return;
            }
            int i = this.z;
            if (i == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i != 4) {
                this.z = 3;
                if (ddn.p(this.i, this.j)) {
                    g(this.i, this.j);
                } else {
                    this.l.e(this);
                }
                int i2 = this.z;
                if ((i2 == 2 || i2 == 3) && q()) {
                    this.l.f(i());
                }
                return;
            }
            e(this.p, 5);
        }
    }

    @Override // defpackage.dbs
    public final void c() {
        synchronized (this.a) {
            p();
            this.A.b();
            if (this.z != 6) {
                p();
                this.A.b();
                this.l.g(this);
                csq csqVar = this.q;
                ctd ctdVar = null;
                if (csqVar != null) {
                    synchronized (csqVar.c) {
                        csqVar.a.g(csqVar.b);
                    }
                    this.q = null;
                }
                ctd ctdVar2 = this.p;
                if (ctdVar2 != null) {
                    this.p = null;
                    ctdVar = ctdVar2;
                }
                dbu dbuVar = this.c;
                if (dbuVar == null || dbuVar.g(this)) {
                    this.l.jZ(i());
                }
                this.z = 6;
                if (ctdVar != null) {
                    ((csx) ctdVar).f();
                }
            }
        }
    }

    @Override // defpackage.dby
    public final void d(csz cszVar) {
        s(cszVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r13 = (defpackage.csx) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r13.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bf, code lost:
    
        r13 = (defpackage.csx) r13;
     */
    @Override // defpackage.dby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.ctd r13, int r14) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbz.e(ctd, int):void");
    }

    @Override // defpackage.dbs
    public final void f() {
        synchronized (this.a) {
            if (n()) {
                c();
            }
        }
    }

    @Override // defpackage.dck
    public final void g(int i, int i2) {
        Class cls;
        int i3;
        cqi cqiVar;
        boolean z;
        Executor executor;
        csw cswVar;
        int i4;
        Object obj;
        csx csxVar;
        csw cswVar2;
        int i5;
        csq csqVar;
        dbz dbzVar = this;
        dbzVar.A.b();
        synchronized (dbzVar.a) {
            if (dbzVar.z == 3) {
                dbzVar.z = 2;
                float f = dbzVar.h.a;
                dbzVar.v = h(i, f);
                dbzVar.w = h(i2, f);
                csr csrVar = dbzVar.s;
                cod codVar = dbzVar.e;
                Object obj2 = dbzVar.f;
                dbo dboVar = dbzVar.h;
                cqi cqiVar2 = dboVar.k;
                int i6 = dbzVar.v;
                int i7 = dbzVar.w;
                Class cls2 = dboVar.p;
                Class cls3 = dbzVar.g;
                cof cofVar = dbzVar.k;
                csk cskVar = dboVar.b;
                Map map = dboVar.o;
                boolean z2 = dboVar.l;
                boolean z3 = dboVar.r;
                cqn cqnVar = dboVar.n;
                boolean z4 = dboVar.h;
                boolean z5 = dboVar.s;
                Executor executor2 = dbzVar.o;
                gm gmVar = csrVar.f;
                csw cswVar3 = new csw(obj2, cqiVar2, i6, i7, map, cls2, cls3, cqnVar);
                synchronized (csrVar) {
                    if (z4) {
                        try {
                            csx a = csrVar.d.a(cswVar3);
                            if (a != null) {
                                a.d();
                            }
                            if (a == null) {
                                ctd b = csrVar.e.b(cswVar3);
                                if (b == null) {
                                    cswVar2 = cswVar3;
                                    cls = cls2;
                                    i5 = i7;
                                    i3 = i6;
                                    cqiVar = cqiVar2;
                                    obj = obj2;
                                    z = z5;
                                    executor = executor2;
                                    csxVar = null;
                                } else if (b instanceof csx) {
                                    cswVar2 = cswVar3;
                                    cls = cls2;
                                    i5 = i7;
                                    i3 = i6;
                                    cqiVar = cqiVar2;
                                    csxVar = (csx) b;
                                    z = z5;
                                    executor = executor2;
                                    obj = obj2;
                                } else {
                                    cswVar2 = cswVar3;
                                    z = z5;
                                    executor = executor2;
                                    cls = cls2;
                                    i3 = i6;
                                    cqiVar = cqiVar2;
                                    i5 = i7;
                                    obj = obj2;
                                    csxVar = new csx(b, true, true, cswVar2, csrVar);
                                }
                                if (csxVar != null) {
                                    csxVar.d();
                                    cswVar = cswVar2;
                                    csrVar.d.b(cswVar, csxVar);
                                } else {
                                    cswVar = cswVar2;
                                }
                                i4 = i5;
                                if (csxVar == null) {
                                    csxVar = null;
                                }
                            } else {
                                cls = cls2;
                                i3 = i6;
                                cqiVar = cqiVar2;
                                z = z5;
                                executor = executor2;
                                cswVar = cswVar3;
                                i4 = i7;
                                obj = obj2;
                                csxVar = a;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        cls = cls2;
                        i3 = i6;
                        cqiVar = cqiVar2;
                        obj = obj2;
                        z = z5;
                        executor = executor2;
                        csxVar = null;
                        cswVar = cswVar3;
                        i4 = i7;
                    }
                    if (csxVar == null) {
                        csv csvVar = (csv) csrVar.g.a.get(cswVar);
                        if (csvVar != null) {
                            csvVar.b(dbzVar, executor);
                            csqVar = new csq(csrVar, dbzVar, csvVar);
                        } else {
                            Executor executor3 = executor;
                            csv csvVar2 = (csv) csrVar.a.d.a();
                            did.ap(csvVar2);
                            csvVar2.i(cswVar, z4, z);
                            csm csmVar = csrVar.c;
                            csf csfVar = (csf) csmVar.a.a();
                            did.ap(csfVar);
                            int i8 = csmVar.b;
                            csmVar.b = i8 + 1;
                            csc cscVar = csfVar.a;
                            csp cspVar = csfVar.p;
                            cscVar.c = codVar;
                            cscVar.d = obj;
                            cscVar.m = cqiVar;
                            cscVar.e = i3;
                            cscVar.f = i4;
                            cscVar.o = cskVar;
                            try {
                                cscVar.g = cls;
                                cscVar.r = cspVar;
                                cscVar.j = cls3;
                                cscVar.n = cofVar;
                                cscVar.h = cqnVar;
                                cscVar.i = map;
                                cscVar.p = z2;
                                cscVar.q = z3;
                                csfVar.c = codVar;
                                csfVar.d = cqiVar;
                                csfVar.e = cofVar;
                                csfVar.f = i3;
                                csfVar.g = i4;
                                csfVar.h = cskVar;
                                csfVar.i = cqnVar;
                                csfVar.j = csvVar2;
                                csfVar.k = i8;
                                csfVar.o = 1;
                                csrVar.g.a.put(cswVar, csvVar2);
                                dbzVar = this;
                                csvVar2.b(dbzVar, executor3);
                                csvVar2.h(csfVar);
                                csqVar = new csq(csrVar, dbzVar, csvVar2);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } else {
                        dbzVar.e(csxVar, 5);
                        csqVar = null;
                    }
                    dbzVar.q = csqVar;
                    if (dbzVar.z != 2) {
                        dbzVar.q = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.dbs
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.z == 4;
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.z == 6;
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.z == 4;
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean m(dbs dbsVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        dbo dboVar;
        cof cofVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        dbo dboVar2;
        cof cofVar2;
        int size2;
        if (!(dbsVar instanceof dbz)) {
            return false;
        }
        synchronized (this.a) {
            i = this.i;
            i2 = this.j;
            obj = this.f;
            cls = this.g;
            dboVar = this.h;
            cofVar = this.k;
            List list = this.m;
            size = list != null ? list.size() : 0;
        }
        dbz dbzVar = (dbz) dbsVar;
        synchronized (dbzVar.a) {
            i3 = dbzVar.i;
            i4 = dbzVar.j;
            obj2 = dbzVar.f;
            cls2 = dbzVar.g;
            dboVar2 = dbzVar.h;
            cofVar2 = dbzVar.k;
            List list2 = dbzVar.m;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && ddn.l(obj, obj2) && cls.equals(cls2) && dboVar.equals(dboVar2) && cofVar == cofVar2 && size == size2;
    }

    @Override // defpackage.dbs
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            int i = this.z;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.a) {
            obj = this.f;
            cls = this.g;
        }
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(cls);
        int length = String.valueOf(obj2).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(obj2);
        sb.append("[model=");
        sb.append(valueOf);
        sb.append(", transcodeClass=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
