package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrd implements adqp {
    public volatile adqo a;
    final adro b;
    private final adqp c;
    private final adqp d;
    private final AtomicInteger e = new AtomicInteger(0);
    private final adqo f;
    private final adqw g;

    public adrd(adqp adqpVar, adqp adqpVar2, adrp adrpVar, acpl acplVar) {
        adqo adqoVar = new adqo() { // from class: adrb
            @Override // defpackage.adqo
            public final void b(adqz adqzVar) {
                adqo adqoVar2 = adrd.this.a;
                if (adqoVar2 != null) {
                    adqoVar2.b(adqzVar);
                }
            }
        };
        this.f = adqoVar;
        adro adrcVar = new adrc(this);
        this.b = adrcVar;
        this.c = adqpVar;
        this.d = adqpVar2;
        adqw adqwVar = new adqw(adqoVar, acplVar);
        this.g = adqwVar;
        adrpVar.d(adqwVar);
        adrpVar.c(adrcVar);
    }

    @Override // defpackage.adqp
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.adqp
    public final void b(adqo adqoVar) {
        this.a = adqoVar;
        this.c.b(this.g);
        this.d.b(this.g);
    }

    @Override // defpackage.adqp
    public final void d() {
    }

    @Override // defpackage.adqp
    public final void e(adgf adgfVar, adgj adgjVar) {
        adgj adgjVar2 = new adgj(adgjVar.b);
        adgjVar2.a("senderMsn", Integer.toString(this.e.getAndIncrement()));
        if (!adgf.al.contains(adgfVar) || this.d.a() != 2) {
            if (adgf.am.contains(adgfVar)) {
                return;
            }
            this.c.e(adgfVar, adgjVar2);
            return;
        }
        this.d.e(adgfVar, adgjVar2);
    }

    @Override // defpackage.adqp
    public final void g() {
        this.c.g();
    }

    @Override // defpackage.adqp
    public final void j(boolean z) {
        this.e.set(0);
        this.c.j(z);
        this.d.j(z);
        this.g.d();
    }

    @Override // defpackage.adqp
    public final /* synthetic */ void m(adqn adqnVar) {
    }

    @Override // defpackage.adqp
    public final void n(adqs adqsVar) {
        ((acwa) this.c).j = adqsVar;
    }
}
