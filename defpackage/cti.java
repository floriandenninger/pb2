package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cti implements csb, csa {
    public final csc a;
    public final csa b;
    public volatile Object c;
    public volatile cry d;
    private volatile int e;
    private volatile crx f;
    private volatile cvy g;

    public cti(csc cscVar, csa csaVar) {
        this.a = cscVar;
        this.b = csaVar;
    }

    @Override // defpackage.csb
    public final void a() {
        cvy cvyVar = this.g;
        if (cvyVar != null) {
            cvyVar.c.b();
        }
    }

    @Override // defpackage.csb
    public final boolean b() {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                ddi.b();
                try {
                    cqy a = this.a.c.c.a(obj);
                    Object a2 = a.a();
                    cpx l = this.a.c.c.g.l(a2.getClass());
                    if (l != null) {
                        crz crzVar = new crz(l, a2, this.a.h);
                        cry cryVar = new cry(this.g.a, this.a.m);
                        cuc d = this.a.d();
                        d.b(cryVar, crzVar);
                        if (d.a(cryVar) == null) {
                            try {
                                this.b.e(this.g.a, a.a(), this.g.c, this.g.c.e(), this.g.a);
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                if (!z) {
                                    this.g.c.c();
                                }
                                throw th;
                            }
                        }
                        this.d = cryVar;
                        this.f = new crx(Collections.singletonList(this.g.a), this.a, this);
                        this.g.c.c();
                    } else {
                        throw new cok(a2.getClass());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f != null && this.f.b()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!z2 && this.e < this.a.f().size()) {
            List f = this.a.f();
            int i = this.e;
            this.e = i + 1;
            this.g = (cvy) f.get(i);
            if (this.g != null && (this.a.o.c(this.g.c.e()) || this.a.h(this.g.c.a()))) {
                this.g.c.d(this.a.n, new cth(this, this.g));
                z2 = true;
            }
        }
        return z2;
    }

    @Override // defpackage.csa
    public final void c() {
        throw null;
    }

    @Override // defpackage.csa
    public final void d(cqi cqiVar, Exception exc, cqw cqwVar, int i) {
        this.b.d(cqiVar, exc, cqwVar, this.g.c.e());
    }

    @Override // defpackage.csa
    public final void e(cqi cqiVar, Object obj, cqw cqwVar, int i, cqi cqiVar2) {
        this.b.e(cqiVar, obj, cqwVar, this.g.c.e(), cqiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(cvy cvyVar) {
        cvy cvyVar2 = this.g;
        return cvyVar2 != null && cvyVar2 == cvyVar;
    }
}
