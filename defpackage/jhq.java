package defpackage;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jhq extends jhj {
    private final aahv a;
    private final Executor b;
    private ayqx c;
    private awiu d;

    public jhq(aahv aahvVar, Executor executor) {
        this.a = aahvVar;
        this.b = executor;
    }

    @Override // defpackage.jhn
    public final void d() {
        this.c = this.a.c().g(awiu.class).ab(azre.b(this.b)).L(iub.f).Y(ivh.t).k(awiu.class).ax(new ayrs() { // from class: jhp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                jhq.this.f((awiu) obj);
            }
        });
    }

    @Override // defpackage.jhn
    public final void e() {
        ayqx ayqxVar = this.c;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.c);
            this.c = null;
        }
        this.d = null;
    }

    public final void f(awiu awiuVar) {
        HashSet ao;
        awiuVar.getClass();
        awiu awiuVar2 = this.d;
        if (awiuVar2 == null) {
            ao = amkq.an();
        } else {
            ao = amkq.ao(awiuVar2.getDownloads());
        }
        HashSet ao2 = amkq.ao(awiuVar.getDownloads());
        amwe al = amkq.al(ao2, ao);
        amwe al2 = amkq.al(ao, ao2);
        this.d = awiuVar;
        amxd it = ((amwc) al).iterator();
        while (it.hasNext()) {
            awiv awivVar = (awiv) it.next();
            if (awivVar.b == 1) {
                final String g = aalt.g((String) awivVar.c);
                super.b(new jhx() { // from class: jhh
                    @Override // defpackage.jhx
                    public final void a(Object obj) {
                        ((jhm) obj).a(g);
                    }
                });
            }
        }
        amxd it2 = ((amwc) al2).iterator();
        while (it2.hasNext()) {
            awiv awivVar2 = (awiv) it2.next();
            if (awivVar2.b == 1) {
                aalt.g((String) awivVar2.c);
                super.b(new jhx() { // from class: jhi
                    @Override // defpackage.jhx
                    public final void a(Object obj) {
                        ((jhm) obj).b();
                    }
                });
            }
        }
    }
}
