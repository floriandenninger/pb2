package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pvz extends prh {
    public final Object a = new Object();
    public prh b;

    @Override // defpackage.prh
    public final void a() {
        synchronized (this.a) {
            prh prhVar = this.b;
            if (prhVar != null) {
                prhVar.a();
            }
        }
    }

    @Override // defpackage.prh
    public final void b() {
        synchronized (this.a) {
            prh prhVar = this.b;
            if (prhVar != null) {
                prhVar.b();
            }
        }
    }

    @Override // defpackage.prh
    public void c(pum pumVar) {
        synchronized (this.a) {
            prh prhVar = this.b;
            if (prhVar != null) {
                prhVar.c(pumVar);
            }
        }
    }

    @Override // defpackage.prh
    public void d() {
        synchronized (this.a) {
            prh prhVar = this.b;
            if (prhVar != null) {
                prhVar.d();
            }
        }
    }

    @Override // defpackage.prh
    public final void e() {
        synchronized (this.a) {
            prh prhVar = this.b;
            if (prhVar != null) {
                prhVar.e();
            }
        }
    }

    @Override // defpackage.prh
    public final void f() {
        synchronized (this.a) {
        }
    }
}
