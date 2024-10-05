package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hyc extends gp {
    final /* synthetic */ amc a;
    final /* synthetic */ hye b;

    public hyc(hye hyeVar, amc amcVar) {
        this.b = hyeVar;
        this.a = amcVar;
    }

    @Override // defpackage.gp
    public final void h() {
        this.a.b(this);
        this.b.b.execute(new Runnable() { // from class: hyb
            @Override // java.lang.Runnable
            public final void run() {
                hyc.this.b.b();
            }
        });
    }

    @Override // defpackage.gp
    public final void i() {
        this.a.b(this);
    }
}
