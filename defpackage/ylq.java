package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ylq {
    public final Runnable a;
    public final azrw b;
    public final ylg c;
    private final Executor d;

    public ylq(Executor executor, ylg ylgVar, Runnable runnable, azrw azrwVar) {
        this.d = executor;
        this.c = ylgVar;
        this.a = runnable;
        this.b = azrwVar;
    }

    public final anhy a(final anfz anfzVar) {
        anhy a;
        if (this.c.f()) {
            try {
                a = anfzVar.a((vgz) this.b.get());
            } catch (Exception e) {
                this.c.e();
                return anaf.N(e);
            }
        } else {
            a = anaf.T(new anfy() { // from class: yln
                @Override // defpackage.anfy
                public final anhy a() {
                    ylq ylqVar = ylq.this;
                    anfz anfzVar2 = anfzVar;
                    ylqVar.c.c();
                    try {
                        return anfzVar2.a((vgz) ylqVar.b.get());
                    } catch (Throwable th) {
                        ylqVar.c.e();
                        return anaf.N(th);
                    }
                }
            }, this.d);
        }
        try {
            return aney.i(anfq.h(anht.q(a), new ylm(this, 1), angq.a), Throwable.class, new anfz() { // from class: ylo
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    ylq.this.c.e();
                    return anaf.N((Throwable) obj);
                }
            }, angq.a);
        } catch (Exception e2) {
            this.c.e();
            return anaf.N(e2);
        }
    }
}
