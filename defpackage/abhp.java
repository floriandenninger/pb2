package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abhp implements afwx {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ajcd b;
    final /* synthetic */ aaru c;
    final /* synthetic */ abhq d;

    public abhp(abhq abhqVar, Runnable runnable, ajcd ajcdVar, aaru aaruVar) {
        this.d = abhqVar;
        this.a = runnable;
        this.b = ajcdVar;
        this.c = aaruVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        abjp o = this.d.d.o();
        if (o != null) {
            String b = this.d.d.n.b(cnqVar);
            final aaru aaruVar = this.c;
            final ajcd ajcdVar = this.b;
            final Runnable runnable = this.a;
            o.z(b, new Runnable() { // from class: abho
                @Override // java.lang.Runnable
                public final void run() {
                    abhp abhpVar = abhp.this;
                    abhpVar.d.m(aaruVar, ajcdVar, runnable);
                }
            });
        }
        abhu abhuVar = this.d.d.w;
        if (abhuVar != null) {
            abhuVar.f();
        }
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        ajcf ajcfVar = (ajcf) obj;
        abjp o = this.d.d.o();
        if (o != null) {
            o.y();
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        this.d.k((asra) ajcfVar.b());
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
