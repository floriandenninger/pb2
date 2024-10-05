package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class fgi {
    public final shf a;
    public Object b;
    public long c;
    public cnq d;
    public afwx e;
    private final azrw f;
    private aaqh g;
    private String h;

    /* JADX INFO: Access modifiers changed from: protected */
    public fgi(azrw azrwVar, shf shfVar) {
        this.f = azrwVar;
        shfVar.getClass();
        this.a = shfVar;
        amkq.E(true);
    }

    private final boolean n() {
        return this.b != null && this.c + 60000 >= this.a.d();
    }

    public final fgh a(final aaqh aaqhVar) {
        aaqhVar.getClass();
        return new fgh(ayqj.p(new ayql() { // from class: fgc
            @Override // defpackage.ayql
            public final void a(azmi azmiVar) {
                fgi.this.h(aaqhVar, new fgg(azmiVar));
            }
        }).J(new ayrv() { // from class: fge
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                final fgi fgiVar = fgi.this;
                Throwable th = (Throwable) obj;
                return fgiVar.c(aaqhVar, th).m(new ayrs() { // from class: fgd
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        Log.e(fgi.this.getClass().getSimpleName(), "Failed to generate fallback response", (Throwable) obj2);
                    }
                }).A().Q(ayqj.z(th));
            }
        }).m(), d(aaqhVar));
    }

    public final afwx b() {
        afwx afwxVar = this.e;
        this.e = null;
        return afwxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ayps c(aaqh aaqhVar, Throwable th) {
        return ayps.p();
    }

    protected ayps d(aaqh aaqhVar) {
        return ayps.p();
    }

    public final void e(aaqh aaqhVar) {
        aaqhVar.getClass();
        if (!n()) {
            this.b = null;
            this.c = 0L;
        }
        if (m(aaqhVar)) {
            return;
        }
        if (this.g != null) {
            j();
        }
        this.g = aaqhVar;
        this.h = aaqhVar.b();
        i((aasw) this.f.get(), this.g, new fgf(this, aaqhVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(cnq cnqVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(Object obj) {
        throw null;
    }

    public final void h(aaqh aaqhVar, afwx afwxVar) {
        afwxVar.getClass();
        if (m(aaqhVar)) {
            if (n()) {
                afwxVar.kZ(this.b);
                j();
                return;
            }
            if (this.b != null) {
                i((aasw) this.f.get(), aaqhVar, afwxVar);
                j();
                return;
            }
            if (this.e != afwxVar) {
                k(new cnq(new CancellationException()));
            }
            this.e = afwxVar;
            cnq cnqVar = this.d;
            if (cnqVar != null) {
                k(cnqVar);
                j();
                return;
            }
            return;
        }
        i((aasw) this.f.get(), aaqhVar, afwxVar);
    }

    protected abstract void i(aasw aaswVar, aaqh aaqhVar, afwx afwxVar);

    public final void j() {
        this.g = null;
        this.h = null;
        this.b = null;
        this.c = 0L;
        k(new cnq(new CancellationException()));
        this.d = null;
    }

    public final void k(cnq cnqVar) {
        afwx b = b();
        if (b != null) {
            b.kY(cnqVar);
        }
    }

    @Deprecated
    public final boolean l() {
        return this.g != null;
    }

    public final boolean m(aaqh aaqhVar) {
        String b = aaqhVar.b();
        b.getClass();
        return b.equals(this.h);
    }
}
