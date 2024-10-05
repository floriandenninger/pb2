package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rho implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ rid b;

    public rho(rid ridVar, boolean z) {
        this.b = ridVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean v = this.b.w.v();
        boolean u = this.b.w.u();
        this.b.w.t(this.a);
        if (u == this.a) {
            this.b.w.aF().k.b("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.w.v() == v || this.b.w.v() != this.b.w.u()) {
            this.b.w.aF().h.c("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(v));
        }
        this.b.V();
    }
}
