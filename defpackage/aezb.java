package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezb implements bcy {
    public volatile bel a;
    final /* synthetic */ aezc b;
    private final aeyg c;
    private final bel d;

    public aezb(aezc aezcVar, ovw ovwVar, bel belVar) {
        this.b = aezcVar;
        this.c = aezcVar.d.c(ovwVar);
        this.d = belVar;
        this.a = aezcVar.h.a(ovwVar);
    }

    private final boolean e() {
        return !this.d.equals(this.a);
    }

    @Override // defpackage.bcy
    public final synchronized int a(pmt pmtVar, asw aswVar, int i) {
        int i2;
        if (e()) {
            return -3;
        }
        this.c.h();
        int a = this.c.a(pmtVar, aswVar, i);
        if (a == -5) {
            aeza aezaVar = this.b.e;
            pms pmsVar = pmtVar.b;
            afki.a(pmsVar);
            final String str = pmsVar.c;
            if (str != null) {
                synchronized (((aeyk) aezaVar).d) {
                    aexz aexzVar = ((aeyk) aezaVar).h.c;
                    i2 = aexzVar != null ? ((aexy) aexzVar).c : 1;
                }
                aezf aezfVar = ((aeyk) aezaVar).c;
                final aezh a2 = new aezh(aezfVar, aezfVar.c(), i2, ((aeyr) ((aeyk) aezaVar).e).k).a(aenk.a);
                final boolean z = ((aeyr) ((aeyk) aezaVar).e).k;
                Handler handler = ((aeyk) aezaVar).f;
                final aeyk aeykVar = (aeyk) aezaVar;
                handler.post(new Runnable() { // from class: aeyi
                    @Override // java.lang.Runnable
                    public final void run() {
                        aeyk aeykVar2 = aeyk.this;
                        aeykVar2.c.m(str, z, a2, 2);
                    }
                });
            }
        }
        return a;
    }

    @Override // defpackage.bcy
    public final synchronized int b(long j) {
        if (e()) {
            return 0;
        }
        return this.c.b(j);
    }

    @Override // defpackage.bcy
    public final synchronized boolean d() {
        boolean z;
        if (!e()) {
            z = this.c.g();
        }
        return z;
    }

    @Override // defpackage.bcy
    public final void jK() {
    }
}
