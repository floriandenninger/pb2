package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vhj {
    public final vid a;

    public vhj(vid vidVar) {
        this.a = vidVar;
    }

    public final anhy a(final vip vipVar) {
        return this.a.b().c(amjk.d(new angg() { // from class: vhi
            @Override // defpackage.angg
            public final angk a(angi angiVar, Object obj) {
                vip vipVar2 = vip.this;
                vhp vhpVar = (vhp) obj;
                vhpVar.a();
                final viq viqVar = new viq(vhpVar.a);
                amil l = amjw.l("Transaction");
                try {
                    final anhz a = anhz.a(amjk.g(new vhn(vhpVar, vipVar2, viqVar)));
                    vhpVar.c.execute(a);
                    a.d(new Runnable() { // from class: vhl
                        @Override // java.lang.Runnable
                        public final void run() {
                            anhz anhzVar = anhz.this;
                            viq viqVar2 = viqVar;
                            if (anhzVar.isCancelled()) {
                                viqVar2.a.cancel();
                            }
                        }
                    }, angq.a);
                    l.a(a);
                    l.close();
                    return angk.b(a);
                } catch (Throwable th) {
                    try {
                        l.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }), angq.a).h();
    }
}
